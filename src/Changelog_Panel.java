import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;



@SuppressWarnings("serial")
public class Changelog_Panel extends JPanel {

	JTextArea changelog = new JTextArea();

	
	
	public Changelog_Panel(){
		
		setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane(changelog);
		scrollPane.setBounds(0,0,200,400);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		
		changelog.setFont((new Font("Serif Plain", Font.BOLD, 14 )));
		
		changelog.setText("Changelog \n ***********\n");
		changelog.setText(changelog.getText()+
				"\n Update 1.7"
				+ "\n+Fixed Bugs"
				+ "\n+Added Working Maps"
				);
	
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		
		changelog.setBounds(0,0,870,700);
		changelog.setLineWrap(true);
		changelog.setOpaque(false);
		changelog.setBorder(null);
		changelog.setBackground(new Color(255, 255, 255, 255));
		changelog.setEditable(false);
		changelog.setForeground(Color.BLACK);
		changelog.setVisible(true);
		
		add(scrollPane);
	   

	    

	}
}
