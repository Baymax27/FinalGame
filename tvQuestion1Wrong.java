	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class tvQuestion1Wrong implements ActionListener {

	
	
		JFrame frame = new JFrame();
	
		JButton button2 = new JButton();

		tvQuestion1Wrong()
		{	
			SoundHandler.RunMusic("src/sounds/NoSignal.wav",0);
		
		JLabel label = new JLabel();
		ImageIcon dustbin = new ImageIcon("src/led tv question wrongOG.jpg");
		
	
		frame.add(button2);
		frame.add(label);
	
		label.setIcon(dustbin);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("Dustbin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	
		
		button2.setOpaque(false);
		button2.setBounds(12,9,30,30);
		button2.addActionListener(this);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);

		
		
		}
		@Override
		public void actionPerformed(ActionEvent e)
		{
		
				if(e.getSource()==button2)
				{
					frame.dispose();
					new tvQuestion1();
				
				}
		}
}