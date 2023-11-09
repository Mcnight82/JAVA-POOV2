//creamos la clase principal que contendrá el metodo main
public class Principal {


    //creamos el metodo main
    public static void main(String[] args) {
        //Instanciamos la clase Frame recien creada
        Frame frame = new Frame();
        //Le damos un tamaño y posicion a la ventana
        frame.setBounds(0, 0, 500, 500);
        //Hacemos visible la ventana
        frame.setVisible(true);
        //Hacemos que la ventana sea redimensionable
        frame.setResizable(true);
        //Hacemos que la ventana se ubique en el centro de la pantalla
        frame.setLocationRelativeTo(null);
        //Hacemos que la ventana y el programa se cierren (terminen) al presionar la X
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //le damos un titulo a la ventana
        frame.setTitle("Mi primera ventana en JAVA");
        
        //todo lo anterior permite mantener la modularidad del proyecto, ya que se separa la interfaz de la logica
        //de la aplicacion permitiendo que cada una de estas partes sea modificada sin afectar a la otra
        //y mejorando su legibilidad y mantenibilidad
    }
    
}
