import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Lock implements ActionListener 
{
	JFrame frame = new JFrame();
	JButton buttonB = new JButton();
	JLabel label = new JLabel();
	JTextField textfield = new JTextField();
	
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	
	int ans=0;
	int count=0;
	
	

	Lock()
	{	
		
	ImageIcon pcb = new ImageIcon("src/lock.jpg");
	
	
	frame.add(buttonB);
	
	frame.add(textfield);

	
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
	
	frame.add(label);
	
	label.setIcon(pcb);
	
	textfield.setBounds(504,78,150,70);
	textfield.setVisible(true);
	textfield.setEditable(false);
	textfield.setBorder(null);
	textfield.setBackground(Color.black);
	textfield.setForeground(Color.white);
	textfield.setFont(new Font("Plain",Font.BOLD,42));
	
	
	frame.setVisible(true);
	frame.setSize(1080,764);
	frame.setResizable(false);
	frame.setTitle("DarkRoom");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	
	button1.setOpaque(false);
	button1.setBounds(420,280,35,35);
	button1.addActionListener(this);
	button1.setContentAreaFilled(false);
	button1.setBorderPainted(false);
	
	button2.setOpaque(false);
	button2.setBounds(472,270,35,35);
	button2.addActionListener(this);
	button2.setContentAreaFilled(false);
	button2.setBorderPainted(false);
	
	button3.setOpaque(false);
	button3.setBounds(524,270,35,35);
	button3.addActionListener(this);
	button3.setContentAreaFilled(false);
	button3.setBorderPainted(false);
	
	button4.setOpaque(false);
	button4.setBounds(578,270,35,35);
	button4.addActionListener(this);
	button4.setContentAreaFilled(false);
	button4.setBorderPainted(false);
	
	button5.setOpaque(false);
	button5.setBounds(630,280,35,35);
	button5.addActionListener(this);
	button5.setContentAreaFilled(false);
	button5.setBorderPainted(false);
	
	button6.setOpaque(false);
	button6.setBounds(420,330,35,35);
	button6.addActionListener(this);
	button6.setContentAreaFilled(false);
	button6.setBorderPainted(false);

	button7.setOpaque(false);
	button7.setBounds(472,325,35,35);
	button7.addActionListener(this);
	button7.setContentAreaFilled(false);
	button7.setBorderPainted(false);
	
	button8.setOpaque(false);
	button8.setBounds(524,320,35,35);
	button8.addActionListener(this);
	button8.setContentAreaFilled(false);
	button8.setBorderPainted(false);
	
	button9.setOpaque(false);
	button9.setBounds(578,325,35,35);
	button9.addActionListener(this);
	button9.setContentAreaFilled(false);
	button9.setBorderPainted(false);
	
	button0.setOpaque(false);
	button0.setBounds(630,330,35,35);
	button0.addActionListener(this);
	button0.setContentAreaFilled(false);
	button0.setBorderPainted(false);
		
	buttonB.setOpaque(false);
	buttonB.setBounds(15,670,40,45);
	buttonB.addActionListener(this);
	buttonB.setContentAreaFilled(false);
	buttonB.setBorderPainted(false);
	
	}


	
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
			if(count!=4)
			{
				ans=0;
				count++;
				textfield.setText(textfield.getText().concat("1 "));
			}
			else
			{
				count=0;
				ans=0;
				textfield.setText(null);
			}
			

		}
		if(e.getSource()==button2)
		{
			SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
			if(count!=4)
			{
				ans=0;
				count++;
				textfield.setText(textfield.getText().concat("2 "));
			}
			else
			{
				count=0;
				ans=0;
				textfield.setText(null);
			}
		}	

		
			if(e.getSource()==button3)
			{
				SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
				if(count!=4)
				{
					ans=0;
					count++;
					textfield.setText(textfield.getText().concat("3 "));
				}
				else
				{
					count=0;
					ans=0;
					textfield.setText(null);
				}
				
			}
			
				if(e.getSource()==button4)
				{
					SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
					if(count!=4)
					{
						ans=ans+4;
						count++;
						textfield.setText(textfield.getText().concat("4 "));
					}
					else
					{
						count=0;
						ans=0;
						textfield.setText(null);
					}
					if(count==4 && ans==75)
					{
						SoundHandler.RunMusic("src/sounds/Victory.wav",0);
						new Level2();
						
					}
					
				}
				
					if(e.getSource()==button5)
					{
						SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
						if(count!=4)
						{
							ans=0;
							count++;
							textfield.setText(textfield.getText().concat("5 "));
						}
						else
						{
							count=0;
							ans=0;
							textfield.setText(null);
						}
					}	

					SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
						if(e.getSource()==button6)
						{
							
							if(count!=4)
							{
								ans=0;
								count++;
								textfield.setText(textfield.getText().concat("6 "));
							}
							else
							{
								count=0;
								ans=0;
								textfield.setText(null);
							}
							
						}
						
							if(e.getSource()==button7)
							{
								SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
								if(count!=4)
								{
									ans=ans+7;
									count++;
									textfield.setText(textfield.getText().concat("7 "));
								}
								else
								{
									count=0;
									ans=0;
									textfield.setText(null);
								}
								
							}
							
								if(e.getSource()==button8)
								{
									SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
									if(count!=4)
									{
										ans=0;
										count++;
										textfield.setText(textfield.getText().concat("8 "));
									}
									else
									{
										count=0;
										ans=0;
										textfield.setText(null);
									}
									
								}
								
									if(e.getSource()==button9)
									{
										SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
										if(count!=4)
										{
											ans=0;
											count++;
											textfield.setText(textfield.getText().concat("9 "));
										}
										else
										{
											count=0;
											ans=0;
											textfield.setText(null);
										}
										
									}
									
										if(e.getSource()==button0)
										{
											SoundHandler.RunMusic("src/sounds/lockKey.wav",0);
											if(count!=4)
											{
												ans=ans+60;
												count++;
												textfield.setText(textfield.getText().concat("0 "));
											}
											else
											{
												count=0;
												ans=0;
												textfield.setText(null);
											}
											
										}
										
		if(e.getSource()==buttonB)
		{
			
			frame.dispose();
			new FinalDoor();
			

		}
	}
}	