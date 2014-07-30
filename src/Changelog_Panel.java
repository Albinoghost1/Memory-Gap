import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;



public class Changelog_Panel extends JPanel {

	JTextArea changelog = new JTextArea();

	
	
	public Changelog_Panel(){
		
		setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane(changelog);
		scrollPane.setBounds(0,0,200,300);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		
		changelog.setFont((new Font("Serif Plain", Font.BOLD, 18 )));
		
		changelog.setText("Changelog");
		changelog.setText(changelog.getText()+
				"\nUse File Reader to put logfile output here"
				);
	
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		
		changelog.setBounds(0,0,870,700);
		changelog.setLineWrap(true);
		changelog.setOpaque(false);
		changelog.setBorder(null);
		changelog.setBackground(new Color(0, 0, 0, 0));
		changelog.setEditable(false);
		changelog.setForeground(Color.BLACK);
		changelog.setVisible(true);
		
		add(scrollPane);
	   

	    

	}
}
