	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class tvQuestion1 implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton button = new JButton();
		
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();

		tvQuestion1()
		{	
		
		JLabel label = new JLabel();
		ImageIcon page = new ImageIcon("src/TVQuestino1.jpg");
		
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(label);
		
		label.setIcon(page);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("TV");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		button.setOpaque(false);
		button.setBounds(15,10,30,30);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		button1.setOpaque(false);
		button1.setBounds(80,552,20,20);
		button1.addActionListener(this);
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false);
		
		button2.setOpaque(false);
		button2.setBounds(105,582,20,20);
		button2.addActionListener(this);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		
		button3.setOpaque(false);
		button3.setBounds(134,596,20,20);
		button3.addActionListener(this);
		button3.setContentAreaFilled(false);
		button3.setBorderPainted(false);
		
		button4.setOpaque(false);
		button4.setBounds(175,604,20,20);
		button4.addActionListener(this);
		button4.setContentAreaFilled(false);
		button4.setBorderPainted(false);
		
		
		
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			if(e.getSource()==button)
			{
				frame.dispose();
				new LightRoom();
			}
			if(e.getSource()==button1)
			{
				SoundHandler.RunMusic("src/sounds/tvRemote.wav",0);
				frame.dispose();
				new tvQuestion1Wrong();
			}
			if(e.getSource()==button2)
			{
				SoundHandler.RunMusic("src/sounds/tvRemote.wav",0);
				frame.dispose();
				new tvQuestion1Wrong();
			}
			if(e.getSource()==button3)//correct
			{
				SoundHandler.RunMusic("src/sounds/correct.wav",0);
				frame.dispose();
				new tvQuestion2();
			}
			if(e.getSource()==button4)
			{
				SoundHandler.RunMusic("src/sounds/tvRemote.wav",0);
				frame.dispose();
				new tvQuestion1Wrong();
			}
		}
	}