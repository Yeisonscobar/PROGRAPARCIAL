package edu.Formularios;

import edu.pizza.base.*;
import edu.pizza.especialidades.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmPizza{
    private JPanel jPanelPrincipal;
    private JComboBox<Ingrediente> cbIngredientes;
    private JTextField txtPizza;
    private JButton btnAgregarIngrediente;
    private JLabel lblTotal;
    private JList listIngredientes;
    private JComboBox<Pizza> cbTipoPizza;
    private JButton btnPreparar;
    private JList listPreparar;
    private JRadioButton radPequenia;
    private JRadioButton radMediana;
    private JRadioButton radGrande;
    private double total;
    private DefaultListModel<Ingrediente> modeloIngrediente = new DefaultListModel<>();
    private DefaultListModel<String> modeloPreparar = new DefaultListModel<>();

    public frmPizza() {
        radMediana.setSelected(true);
        //agregar pizzas
        cbTipoPizza.addItem(new Carnivora());
        cbTipoPizza.addItem(new Hawaina());
        cbTipoPizza.addItem(new Margherita());
        cbTipoPizza.addItem(new Pepperoni());
        cbTipoPizza.addItem(new Vegetariana());
        cbTipoPizza.addItem(new Yo_laArmo());
        listIngredientes.setModel(modeloIngrediente);
        listPreparar.setModel(modeloPreparar);

        //agregar Ingredientes en general
        cbIngredientes.addItem(new Ingrediente("Pepperoni",15));
        cbIngredientes.addItem(new Ingrediente("Salchichas",12));
        cbIngredientes.addItem(new Ingrediente("Jamón",12));
        cbIngredientes.addItem(new Ingrediente("Carne molida",10));
        cbIngredientes.addItem(new Ingrediente("Pollo",8));
        cbIngredientes.addItem(new Ingrediente("Piña",12));
        cbIngredientes.addItem(new Ingrediente("Cebolla",4));
        cbIngredientes.addItem(new Ingrediente("Pimientos",7));
        cbIngredientes.addItem(new Ingrediente("Aceituna",8));
        cbIngredientes.addItem(new Ingrediente("Albahaca",10));
        cbIngredientes.addItem(new Ingrediente("Aceite de Oliva",3));
        cbIngredientes.addItem(new Ingrediente("Champiñones",12));
        cbIngredientes.addItem(new Ingrediente("Espinaca",7));
        cbIngredientes.addItem(new Ingrediente("Tomates cherry",5));

        cbTipoPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloIngrediente.removeAllElements();
                modeloPreparar.removeAllElements();
                if(cbTipoPizza.getSelectedIndex()>=1){
                    Pizza p= (Pizza) cbTipoPizza.getSelectedItem();
                    total=0;
                    Ingrediente ingrediente;
                    for(int i=0; i<p.getIngredientes().size(); i++){
                        ingrediente=p.getIngredientes().get(i);
                        total+=ingrediente.getPrecio();
                        modeloIngrediente.addElement(ingrediente);
                    }
                    if(radMediana.isSelected())  lblTotal.setText(total+"");
                    else if(radPequenia.isSelected()) lblTotal.setText((total-total*0.15)+"");
                    else lblTotal.setText((total+total*0.15)+"");
                    txtPizza.setText(p.toString());
                }else{
                    lblTotal.setText("0.00");
                    txtPizza.setText("");
                }
            }
        });
        listIngredientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{

                    if (e.getClickCount() == 2) { // Verifica si se hizo doble clic
                        int selectedIndex = listIngredientes.getSelectedIndex();
                        if (selectedIndex >=0) { // Verifica si se seleccionó un elemento
                            modeloIngrediente.remove(selectedIndex);
                            //calcular el total
                            lblTotal.setText(calcularTotal()+"");
                        }
                    }
                }catch(Exception ex){

                }
            }
        });
        btnPreparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    modeloPreparar.removeAllElements();
                    String msj=validarCampos();
                    if(msj.isEmpty()){
                        modeloPreparar.addElement("Agregando...");
                        for (int i = modeloIngrediente.size()-1; i >= 0; i--) {
                            modeloPreparar.addElement(modeloIngrediente.getElementAt(i).getNombre());
                        }
                        modeloPreparar.addElement("La pizza está lista");
                    }else{
                        JOptionPane.showMessageDialog(null,msj);
                    }
                }catch(Exception ex){

                }

            }
        });

        radPequenia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTotal.setText(total-total*0.15+"");
            }
        });
        radMediana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTotal.setText(total+"");
            }
        });
        radGrande.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTotal.setText(total+total*0.15+"");
            }
        });
        btnAgregarIngrediente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ingrediente ingrediente= (Ingrediente)cbIngredientes.getSelectedItem();
                modeloIngrediente.addElement(ingrediente);
                lblTotal.setText(calcularTotal()+"");

            }
        });
    }

    private String validarCampos(){
        String msj="";
        if(txtPizza.getText().isEmpty()) msj+="Falta ingresar nombre\n";
        if(listIngredientes.getModel().getSize()==0) msj+="No hay ingredientes\n";
        if(!radMediana.isSelected() && !radPequenia.isSelected() && !radGrande.isSelected()) msj+="Falta seleccionar tamaño\n";
        return msj;
    }

    private double calcularTotal(){
        total = 0;

        Ingrediente ingrediente;

        for (int i = 0; i < modeloIngrediente.size(); i++) {
            ingrediente = modeloIngrediente.getElementAt(i);
            total += ingrediente.getPrecio();
        }

        if(radMediana.isSelected())  return total;
        else if(radPequenia.isSelected()) return total-total*0.15;
        else return total+total*0.15;
    }


    public JPanel getjPanelPrincipal() {
        return jPanelPrincipal;

    }
}
