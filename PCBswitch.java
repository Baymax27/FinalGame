import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PCBswitch implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	
	PCBswitch()
	{	
		JLabel label = new JLabel();
		ImageIcon pcb = new ImageIcon("src/SwitchOG.jpg");
		
		frame.add(button);
		frame.add(label);
		
		label.setIcon(pcb);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("DarkRoom");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		button.setOpaque(false);
		button.setBounds(490,320,75,75);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e)
	{
		if(e.getSource()==button)
		{
			SoundHandler.RunMusic("src/sounds/lightON.wav",0);
			frame.dispose();
			new lvl1Concept();
		}
	}
}
