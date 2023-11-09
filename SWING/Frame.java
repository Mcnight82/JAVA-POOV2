//importacion de librerias o paquetes necesarios para el funcionamiento del programa
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Creación clase Frame que HEREDA de JFrame
public class Frame extends JFrame {
    
    //Declaramos las variables que vamos a utilizar
    private JLabel texto1;
    private JLabel texto2;

    private JTextField caja1;
    private JTextField caja2;

    private JButton acepta;
    private JButton cancela;

    private JTable tabla;


    //Creamos el constructor de la clase que implementará los componentes de la interfaz
    public Frame(){

        setLayout(null);

        //Estos corresponden a los componentes internos de una tabla en Java
        //Se crea un arreglo de String para las columnas 
        String[] columnas = {"Nombre", "Apellido", "Edad"};

       //Se crea un arreglo de objetos para los datos (que es este caso es una matriz que llenará las filas de la tabla)
        Object[][] datos = {

            {"Juan", "Perez", 20},
            {"Maria", "Gomez", 30},
            {"Pedro", "Jimenez", 40},
            {"Luis", "Gonzalez", 50},
            {"Ana", "Lopez", 60}

        };

        //Se crean las etiquetas a utilizar con su posición, tamaño y texto
        texto1 = new JLabel("Usuario: ");
        texto1.setBounds(10, 10, 100, 30);
        add(texto1);

        texto2 = new JLabel("Clave: ");
        texto2.setBounds(10, 40, 100, 30);
        add(texto2);

        //Se crean los campos de texto a utilizar con su posición y tamaño
        caja1 = new JTextField();
        caja1.setBounds(110, 10, 100, 30);
        add(caja1);

        caja2 = new JTextField();
        caja2.setBounds(110, 40, 100, 30);
        add(caja2);

        //Se crean los botones a utilizar con su posición, tamaño y texto
        acepta = new JButton("Aceptar");
        acepta.setBounds(10, 80, 100, 30);
        //ademas, a este boton en particular se la ha asignado una acción al momento de presionarlo
        //que en este caso es mostrar un mensaje con los datos ingresados en los campos de texto
        //lo anterior haciendo uso del método addActionListener, el cual recibe como parámetro una clase anónima
        //que implementa la interfaz ActionListener y que a su vez implementa el método actionPerformed con el
        //argunto ActionEvent e
        acepta.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                //variable que recibirá el texto ingresado en el campo de texto caja1
                String letras1 = caja1.getText();
                //se imprime en consola el texto ingresado en el campo de texto caja1 POR CONSOLA
                System.out.println("El usuario ingresado es: "+letras1);

                //variable que recibirá el texto ingresado en el campo de texto caja2 POR CONSOLA
                String letras2 = caja2.getText();
                System.out.println("La clave ingresada es: "+letras2);

                //Además se muestra un cuadro de dialogo VISUAL con los datos ingresados en los campos de texto
                //en este caso se muestra el texto ingresado en el campo de texto caja1 y caja2
                //lo anterior se logra con la clase JOptionPane y su método showMessageDialog
                JOptionPane.showMessageDialog(null, "El usuario ingresado es: "+letras1+"\nLa clave ingresada es: "+letras2, "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        
        //se ingresa el boton aceptar a la interfaz
        add(acepta); 

        //se crea el boton cancelar con su posición, tamaño y texto
        cancela = new JButton("Cancelar");
        cancela.setBounds(110, 80, 100, 30);
        add(cancela);

        //se crea una tabla con su posición y tamaño
        //que trae los datos y las columnas de la matriz columnas, los cuales se ingresan en la tabla
        //los datos puestos en el array "columnas" son los que se mostrarán como encabezado en la tabla
        //los datos puestos en el OBJECT de TIPO MATRIZ "datos" son los que se mostrarán como filas
        //de contenido en la tabla
        tabla = new JTable(datos, columnas);
        //se crea un scroll para la tabla (esto es para que se pueda desplazar la tabla)
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 120, 400, 200);
        //se agrega el scroll que contiene además a la tabla a la interfaz 
        add(scroll, BorderLayout.CENTER);



    }


}
