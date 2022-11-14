
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ArcadeMachineOff implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	JButton buttonS = new JButton();
	
	int ans=0;
	int count=0;
	
	JTextField textfield = new JTextField();
	
	
	ArcadeMachineOff()
	{
		
		
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("src/MachineOff.jpg");
			
			frame.add(button);
			
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.add(button4);
			frame.add(button5);
			frame.add(button6);
			frame.add(button7);
			frame.add(button8);
			frame.add(button9);
			frame.add(button0);
			frame.add(buttonS);
			
			
			
			
			frame.add(textfield);
			textfield.setBounds(504,270,80,20);
			textfield.setVisible(true);
			textfield.setEditable(false);
			//textfield.setVisible(false);
			textfield.setBackground(Color.black);
			textfield.setForeground(Color.white);
		//	textfield.setFont(new Font("Plain",Font.BOLD,20));
			
			frame.add(label);
			label.setIcon(img);
			
			
			frame.setVisible(true);
			frame.setSize(1080,764);
			frame.setResizable(false);
			frame.setTitle("DarkRoom");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			
			button.setOpaque(false);
			button.setBounds(20,680,30,30);
			button.addActionListener(this);
			button.setContentAreaFilled(false);
			button.setBorderPainted(false);
			
			
			button1.setOpaque(false);
			button1.setBounds(500,300,30,30);
			button1.addActionListener(this);
			button1.setContentAreaFilled(false);
			button1.setBorderPainted(false);

			button2.setOpaque(false);
			button2.setBounds(530,300,30,30);
			button2.addActionListener(this);
			button2.setContentAreaFilled(false);
			button2.setBorderPainted(false);

			button3.setOpaque(false);
			button3.setBounds(560,300,30,30);
			button3.addActionListener(this);
			button3.setContentAreaFilled(false);
			button3.setBorderPainted(false);

			button4.setOpaque(false);
			button4.setBounds(500,330,30,30);
			button4.addActionListener(this);
			button4.setContentAreaFilled(false);
			button4.setBorderPainted(false);
			
			button5.setOpaque(false);
			button5.setBounds(530,330,30,30);
			button5.addActionListener(this);
			button5.setContentAreaFilled(false);
			button5.setBorderPainted(false);
			
			button6.setOpaque(false);
			button6.setBounds(560,330,30,30);
			button6.addActionListener(this);
			button6.setContentAreaFilled(false);
			button6.setBorderPainted(false);
			
			button7.setOpaque(false);
			button7.setBounds(500,360,30,30);
			button7.addActionListener(this);
			button7.setContentAreaFilled(false);
			button7.setBorderPainted(false);
			
			button8.setOpaque(false);
			button8.setBounds(530,360,30,30);
			button8.addActionListener(this);
			button8.setContentAreaFilled(false);
			button8.setBorderPainted(false);
			
			button9.setOpaque(false);
			button9.setBounds(560,360,30,30);
			button9.addActionListener(this);
			button9.setContentAreaFilled(false);
			button9.setBorderPainted(false);
			
			button0.setOpaque(false);
			button0.setBounds(530,390,30,30);
			button0.addActionListener(this);
			button0.setContentAreaFilled(false);
			button0.setBorderPainted(false);
			
			buttonS.setOpaque(false);
			buttonS.setBounds(608,403,60,20);
			buttonS.addActionListener(this);
			buttonS.setContentAreaFilled(false);
			buttonS.setBorderPainted(false);
			
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			frame.dispose();
			new LightRoom();
		}
		
		if(e.getSource()==button1)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			
			if(count!=4)
			{
			count++;
			ans=0;
			textfield.setText(textfield.getText().concat("  X "));
		
		
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
			
		}
		if(e.getSource()==button2)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=0;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button3)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=3;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button4)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=0;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button5)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=0;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button6)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=0;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button7)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=ans+7;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		
		}
		if(e.getSource()==button8)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=0;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button9)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			ans=ans+9;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else 
			{
			count=0;
			textfield.setText(null);
			}
		}
		if(e.getSource()==button0)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count!=4)
			{
			count++;
			textfield.setText(textfield.getText().concat("  X "));
			}
			else
			{
			count=0;
			textfield.setText(null);
			}
			
		}
		if(e.getSource()==buttonS)
		{
			SoundHandler.RunMusic("src/sounds/arcadeButton.wav",0);
			if(count==4 && ans==19)
			{
				frame.dispose();
				new ArcadeMachineOn();
				
			}
			textfield.setText(null);
			ans=0;
			count=0;

		}
		
	}
///cnt=4 and ans=19
}
