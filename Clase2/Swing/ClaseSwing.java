package Swing;

import javax.swing.*;

public class ClaseSwing {
    

    public static void mains (String [] args){

        //Agregamos un objeto de tipo Frame
        JFrame ventana = new JFrame();

        //Hacemos visible la ventana
        ventana.setVisible(true);

        //Le damos tamaño a la ventana (esto está en pixeles)
        ventana.setSize(500, 500);

        //Le damos un título a la ventana
        ventana.setTitle("Mi primera ventana en Java");
        
    }




    /* 
        

        //Establecemos el boton para cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Establecemos la ventana en el centro de la pantalla
        ventana.setLocationRelativeTo(null);

        //Insertamos nuestro primer boton
        JButton boton = new JButton();

        //Agregamos el boton a la ventana
        ventana.add(boton);

        //Establecemos el texto y el tamaño del boton que también
        //se expresa en pixeles
        boton.setText("Click aquí");
        boton.setBounds(10, 20, 10, 40);

        

        //Instanciamos una caja de texto
        JTextField cajaTexto = new JTextField();

        //La agreagamos a la ventana
        ventana.add(cajaTexto);
        */


}
