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

	public static void main (String[] args) {
		Paint ventana = new Paint("Paint");
		ventana.init();
		ventana.setVisible();
	}

	Image _logo;
	int _x = 0, _y = 0;
}