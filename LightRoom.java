	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;


public class LightRoom extends Start implements ActionListener  {

	

		JFrame frame = new JFrame();
		JButton buttonBin = new JButton();
		JButton button2 = new JButton();
		JButton buttonTV = new JButton();
		JButton buttonF = new JButton();

		LightRoom()
		{	
			
		lives=50;;
			
		JLabel label = new JLabel();
	//	JLabel hp = new JLabel();
		ImageIcon pcb = new ImageIcon("src/lvl1on.jpg");
		
		frame.add(buttonBin);
		frame.add(button2);
		frame.add(buttonTV);
		frame.add(buttonF);
		 ////////////////error happens when label above button
		
//	frame.add(hp);
		frame.add(label);
	
	//	hp.setText(String.valueOf(lives));
	//	hp.setLocation(lives, lives);
		label.setIcon(pcb);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("LightRoom");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		buttonBin.setOpaque(false);
		buttonBin.setBounds(185,440,25,55);
		buttonBin.addActionListener(this);
		buttonBin.setContentAreaFilled(false);
		buttonBin.setBorderPainted(false);
		

		button2.setOpaque(false);
		button2.setBounds(835,310,65,115);
		button2.addActionListener(this);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		
		buttonTV.setOpaque(false);
		buttonTV.setBounds(510,208,58,45);
		buttonTV.addActionListener(this);
		buttonTV.setContentAreaFilled(false);
		buttonTV.setBorderPainted(false);
		
		buttonF.setOpaque(false);
		buttonF.setBounds(465,465,88,200);
		buttonF.addActionListener(this);
		buttonF.setContentAreaFilled(false);
		buttonF.setBorderPainted(false);
		
		
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()== buttonBin)
			{
				SoundHandler.RunMusic("src/sounds/bin.wav",0);
				frame.dispose();
				new DustbinTV();
			}
			if(e.getSource()==button2)
			{
				frame.dispose();
				new ArcadeMachineOff();
				SoundHandler.RunMusic("src/sounds/arcade.wav",0);
			}
			if(e.getSource()==buttonTV)
			{
				frame.dispose();
				new TVoff();
				SoundHandler.RunMusic("src/sounds/tv static.wav",0);
			}
			if(e.getSource()==buttonF)
			{
				SoundHandler.RunMusic("src/sounds/door.wav",0);
				frame.dispose();
				new FinalDoor();
				
			}
		}

	
	
	}

