import javax.swing.JFrame;


public class MyJFrame extends JFrame {
		public MyJFrame(){
			
				super();//title goes here if we want it
				Back_Panel bp = new Back_Panel();
				add(bp, "Center");
				setSize(870, 700);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);		
			}
}

