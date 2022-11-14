	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class TVoff implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton button = new JButton();
		JButton buttonB = new JButton();
	

		TVoff()
		{	
		
		JLabel label = new JLabel();
		ImageIcon page = new ImageIcon("src/TVOffOG.jpg");
		
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
		button.setBounds(225,430,30,27);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		buttonB.setOpaque(false);
		buttonB.setBounds(15,10,30,30);
		buttonB.addActionListener(this);
		buttonB.setContentAreaFilled(false);
		buttonB.setBorderPainted(false);
		

		
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			if(e.getSource()==button)
			{
				SoundHandler.RunMusic("src/sounds/tvRemote.wav",0);
				frame.dispose();
				new tvQuestion1();
			}
			if(e.getSource()==buttonB)
			{
				frame.dispose();
				new LightRoom();
			}
		}
	}