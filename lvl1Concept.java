import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class lvl1Concept implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JButton buttonB = new JButton();
	

		lvl1Concept()
		{	
		
		JLabel label = new JLabel();
		ImageIcon page = new ImageIcon("src/lvl1on.jpg");
		
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
		button.setBounds(360,350,45,35);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		buttonB.setOpaque(false);
		buttonB.setBounds(17,675,35,35);
		buttonB.addActionListener(this);
		buttonB.setContentAreaFilled(false);
		buttonB.setBorderPainted(false);
	
		

		
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			if(e.getSource()==button)
			{
				SoundHandler.RunMusic("src/sounds/pcON.wav",0);
				frame.dispose();
				new concept1();
			}
			if(e.getSource()==buttonB)
			{
				
				frame.dispose();
				new HomePage();
			
		}
}
}