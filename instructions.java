import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class instructions implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton buttonB = new JButton();
	

		instructions()
		{	
		
		JLabel label = new JLabel();
		ImageIcon page = new ImageIcon("src/instruction.jpg");
		

		frame.add(buttonB);
		frame.add(label);
		
		label.setIcon(page);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("TV");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		
		buttonB.setOpaque(false);
		buttonB.setBounds(15,700,30,30);
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
				new HomePage();
				
			}
		}
	}
