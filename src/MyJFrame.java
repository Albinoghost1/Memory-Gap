import javax.swing.JFrame;


public class MyJFrame extends JFrame {//JD
	public MyJFrame(){

		super();
		Back_Panel bp = new Back_Panel();
		add(bp, "Center");
		setSize(870, 700);
		setTitle("Title");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
	}
}

