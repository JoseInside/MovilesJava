import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;


public class HelloSwing extends JFrame{

	//Clase anidada no estática (estática = static)
	class MyActionListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			System.out.println(MSJ + "desde ventana " + _titulo);
		}

	}
	
	public HelloSwing(String title) {
		super(title);
		_titulo = title;
	}

	public void init() {

		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new java.awt.GridLayout(3, 1));

		JButton boton, boton2;
		boton = new JButton("Pulsame");
		add(boton);

		/*boton.addActionListener(new MyActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println(MSJ + "desde ventana " + _titulo);
			}
		});*/
		boton.addActionListener((ActionEvent e) -> System.out.println("Mensaje"));
	}

	public static void main(String[] args) {
		HelloSwing ventana = new HelloSwing("Hola Mundo"); 
		ventana.init();
		ventana.setVisible(true);

		System.out.println("Se termina el main");
	} //main

	private String _titulo;
	private final static String MSJ = "¡Soy un mensaje!";

}// HelloSwing