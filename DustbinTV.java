	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class DustbinTV implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JButton button2 = new JButton();

		DustbinTV()
		{	
		
		JLabel label = new JLabel();
		ImageIcon dustbin = new ImageIcon("src/DustbinOG.jpg");
		
		frame.add(button);
		frame.add(button2);
		frame.add(label);
	
		label.setIcon(dustbin);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("Dustbin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		button.setOpaque(false);
		button.setBounds(310,380,240,170);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		button2.setOpaque(false);
		button2.setBounds(20,675,35,35);
		button2.addActionListener(this);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);

		
		
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button)
			{
				SoundHandler.RunMusic("src/sounds/paperPick.wav",0);
				frame.dispose();
				new Page();
			}
				if(e.getSource()==button2)
				{
					frame.dispose();
					new LightRoom();
				
				}
		}
	
	
	
		
	}