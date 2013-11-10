import javax.swing.JFrame;


public class MyJFrame extends JFrame {
	{

	Back_Panel bp;

		public MyJFrame()
			{
				super("Memory Gap");
				bp = new Back_Panel();
				add(bp, "Center");
				setSize(900, 700);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);		
			}
}

