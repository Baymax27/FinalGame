import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class FinalDoor implements ActionListener 
{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton buttonB = new JButton();
	JLabel label = new JLabel();
	


	FinalDoor()
	{	
		
	ImageIcon pcb = new ImageIcon("src/final door.jpg");
	
	frame.add(button);
	frame.add(buttonB);
	frame.add(label);
	
	label.setIcon(pcb);
	
	
	
	frame.setVisible(true);
	frame.setSize(1080,764);
	frame.setResizable(false);
	frame.setTitle("FinalDoor");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	
	button.setOpaque(false);
	button.setBounds(470,90,110,190);
	button.addActionListener(this);
	button.setContentAreaFilled(false);
	button.setBorderPainted(false);
	
	buttonB.setOpaque(false);
	buttonB.setBounds(15,670,40,40);
	buttonB.addActionListener(this);
	buttonB.setContentAreaFilled(false);
	buttonB.setBorderPainted(false);
		
	
	}


	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e)
	{
		if(e.getSource()==buttonB)
		{
			
			frame.dispose();
			new LightRoom();
			

		}
		if(e.getSource()==button)
		{
			
			frame.dispose();
			new Lock();
			

		}
	}
}	