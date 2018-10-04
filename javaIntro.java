// AWT y JSWING
// java.awt.*
// javax.swing.*


/*Para crear una ventana, un botón... en jswing se llaman igual pero con j delante

Para compilar javac y el nombre del fichero

Las clases que utilizan jswing es jframe

Se puede hacer javax.swing.JFrame o hacer arriba el import

JFrame tiene varios constructores, uno de ellos tiene un string con el nombre de la ventana

En java cuando termina el main el programa no termina, al menos cuando se muestra una ventana

Cuando se abre una ventana se crea una nueva hebra que controla la ejecución de la ventana


ActionListener es un interfaz que obliga a definir la función actionPerformed
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;


public class HelloSwing extends JFrame{

	static class MyActionListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		System.out.printIn(MSJ);
	}
	}// MyActionListener

	public void init() {
		SetSize(400, 400);
		SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jbutton boton;
		boton = new JButton("Pulsame");
		add(boton);
		boton.addActionListener(new MyActionListener());
	}

	public static void Main(String[] args) {
		HelloSwing ventana;
		ventana = new HelloSwing("Hola Mundo");
		ventana.init();
		ventana.SetVisible(true);

		System.out.printIn("Se termina el main");

	} //main

	private final (constante) static String MSJ = "Ay!!";

}// HelloSwing



/*QUÉ PASA SI HAY DOS CLASES EN EL MISMO FICHERO
Dentro de un fichero solo puede haber una clase pública, que coincide con el nombre del fichero
*/

import javax.swing.*;
public class Paint extends JFrame{
	
	public Paint(String title) {
		super(title);
	}

	public void init() {
		SetSize(400, 400);
		SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
		_logo = javax.imageio.ImageIO.read(new java.io.File("tenor-0.png"));
		}

		catch(IOException ioe) {
		System.out.println(ioe);
		}
	}

	public void paint(Graphics g) {
		// Hay una subclase que es Graphics2D
		g.setColor(new Color(255, 0, 0, 128));
		g.fillRect(x, y, 32, 32);

		g.drawImage(_logo, _x, 100, null);
		
	}

	public static void Main (String[] args) {
		Paint ventana = new Paint("Paint");
		ventana.init();
		ventana.setVisible();
	}

	Image _logo;
	int _x = 0, _y = 0;
}


/*METER UNA IMAGEN
no hay que hacer la carga en el paint
La lectura del fichero puede fallar
La carga de la imagen puede llevar mucho tiempo, esa carga es sincrona
*/
