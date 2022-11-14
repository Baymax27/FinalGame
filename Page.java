	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

public class Page implements ActionListener {

	
	
		JFrame frame = new JFrame();
		JButton button = new JButton();

		Page()
		{	
		
		JLabel label = new JLabel();
		ImageIcon page = new ImageIcon("src/hintOG2.jpg");
		
		frame.add(button);
		frame.add(label);
		
		label.setIcon(page);
		
		frame.setVisible(true);
		frame.setSize(1080,764);
		frame.setResizable(false);
		frame.setTitle("Hint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		button.setOpaque(false);
		button.setBounds(20,680,30,30);
		button.addActionListener(this);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e)
		{
			if(e.getSource()==button)
			{
				frame.dispose();
				new DustbinTV();
			}
		}
	}