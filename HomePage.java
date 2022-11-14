import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class HomePage implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JButton buttonB = new JButton();
	

		HomePage()
		{	
			SoundHandler.RunMusic("src/sounds/background.wav",1);//////1 for loop
			SoundHandler.RunMusic("src/sounds/zombie.wav",1);
		
		JLabel label = new JLabel();
		ImageIcon page = new ImageIcon("src/Home page.jpg");
		
		frame.add(button);
		frame.add(buttonB);
		frame.add(label);
		
		label.setIcon(page);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("TV");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		button.setOpaque(false);
		button.setBounds(540,600,50,90);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		buttonB.setOpaque(false);
		buttonB.setBounds(1015,670,35,50);
		buttonB.addActionListener(this);
		buttonB.setContentAreaFilled(false);
		buttonB.setBorderPainted(false);
		

		
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			if(e.getSource()==button)
			{
				
				frame.dispose();
				new DarkRoom();
			}
			if(e.getSource()==buttonB)
			{
				frame.dispose();
				new instructions();
				
			}
		}
	}