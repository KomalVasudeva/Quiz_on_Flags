// package game;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FlagQuiz implements ActionListener {
	JFrame home,q1,q2,q3,q4,q5,finish;JButton start,end,a1,b1,a2,b2,a3,b3,a4,b4,a5,b5,replay,exit;static int score=0;static JLabel total;
  public static void main(String args[])
  {
	 FlagQuiz ob=new FlagQuiz();
	   ob.home=new JFrame();
		JLabel head;
			ob.home.setSize(1000,1000);
			final String NL = System.getProperty("line.separator");  
			
			ob.home.setTitle("FLAG QUIZ");
			head=new JLabel();
			head.setText("WELCOME TO THE FLAG QUIZ");
			head.setFont(new Font(head.getFont().getName(), head.getFont().getStyle(), 20));
			
			ob.home.add(head);
			JLabel h2=new JLabel();
			h2.setText(" You will be asked 5 questions");
			JLabel h3=new JLabel();
			h3.setText("  Each question will require you to click on the flag of the country given." + NL+ NL);
			JLabel h4=new JLabel("Press Start to start the quiz "+ NL);
			JLabel h5=new JLabel("Press exit to leave the quiz "+ NL);
			
			ob.home.add(h2);
			ob.home.add(h3);
			ob.home.add(h4);
			ob.home.add(h5);
			ob.home.setVisible(true);
			ob.start=new JButton("Start");
			ob.end=new JButton("Exit");
			ob.home.add(ob.start);
			ob.home.add(ob.end);
			ob.start.addActionListener(ob);
			ob.end.addActionListener(ob);
			ob.home.setLayout(new GridLayout(7,1));
			
			// Frame for 1st question
			ob.q1=new JFrame("Question 1");
			ob.q1.setSize(500, 1000);
			JLabel que1=new JLabel("CANADA");
			que1.setFont(new Font(que1.getFont().getName(), que1.getFont().getStyle(), 18));
			
			ob.q1.setLayout(new GridLayout(4,1));
			
			ob.q1.add(que1);
			
			ImageIcon i1=new ImageIcon("/home/komalvasudeva/Downloads/Flags/australia.png");
			ImageIcon i2=new ImageIcon("/home/komalvasudeva/Downloads/Flags/canada.png");
			ob.a1=new JButton(i1);
			ob.b1=new JButton(i2);
			ob.q1.add(ob.a1);
			ob.q1.add(ob.b1);
            		
			//Frame for 2nd question
			
			ob.q2=new JFrame("Question 2");
			ob.q2.setSize(500, 1000);
			JLabel que2=new JLabel("ITALY");
			que2.setFont(new Font(que2.getFont().getName(), que2.getFont().getStyle(), 18));
			
			ob.q2.setLayout(new GridLayout(4,1));
			
			ob.q2.add(que2);
			
			ImageIcon i3=new ImageIcon("/home/komalvasudeva/Downloads/Flags/Italy.png");
			
			ImageIcon i4=new ImageIcon("/home/komalvasudeva/Downloads/Flags/Ireland.png");
			ob.a2=new JButton(i3);
			
			
			ob.b2=new JButton(i4);
			ob.a2.setSize(400, 400);
			ob.b2.setSize(400, 400);
			ob.q2.add(ob.a2);
			ob.q2.add(ob.b2);
			
			//Frame for 3rd question
			
			ob.q3=new JFrame("Question 3");
			ob.q3.setSize(500, 1000);
			JLabel que3=new JLabel("INDONESIA");
			que3.setFont(new Font(que3.getFont().getName(), que3.getFont().getStyle(), 18));
			
			ob.q3.setLayout(new GridLayout(4,1));
			
			ob.q3.add(que3);
			
			ImageIcon i5=new ImageIcon("/home/komalvasudeva/Downloads/Flags/indonesia.png");
			
			ImageIcon i6=new ImageIcon("/home/komalvasudeva/Downloads/Flags/france.png");
			ob.a3=new JButton(i5);
			
			
			ob.b3=new JButton(i6);
			ob.a3.setSize(400, 400);
			ob.b3.setSize(400, 400);
			ob.q3.add(ob.a3);
			ob.q3.add(ob.b3);
  
            //Frame for 4th question
			
			
			ob.q4=new JFrame("Question 4");
			ob.q4.setSize(500, 1000);
			JLabel que4=new JLabel("FRANCE");
			que4.setFont(new Font(que4.getFont().getName(), que4.getFont().getStyle(), 18));
			
			ob.q4.setLayout(new GridLayout(4,1));
			
			ob.q4.add(que4);
			
			ImageIcon i7=new ImageIcon("/home/komalvasudeva/Downloads/Flags/thailand.png");
			
			ImageIcon i8=new ImageIcon("/home/komalvasudeva/Downloads/Flags/france.png");
			ob.a4=new JButton(i7);
			
			
			ob.b4=new JButton(i8);
			ob.a4.setSize(400, 400);
			ob.b4.setSize(400, 400);
			ob.q4.add(ob.a4);
			ob.q4.add(ob.b4);
			
			//Frame for fifth question
			
			ob.q5=new JFrame("Question 5");
			ob.q5.setSize(500, 1000);
			JLabel que5=new JLabel("ISRAEL");
			que4.setFont(new Font(que5.getFont().getName(), que4.getFont().getStyle(), 18));
			
			ob.q5.setLayout(new GridLayout(4,1));
			
			ob.q5.add(que5);
			
			ImageIcon i9=new ImageIcon("/home/komalvasudeva/Downloads/Flags/israel.png");
			
			ImageIcon i10=new ImageIcon("/home/komalvasudeva/Downloads/Flags/Ireland.png");
			ob.a5=new JButton(i9);
			
			
			ob.b5=new JButton(i10);
			ob.a5.setSize(400, 400);
			ob.b5.setSize(400, 400);
			ob.q5.add(ob.a5);
			ob.q5.add(ob.b5);
			
			
			// Frame for the finish screen
			
			ob.finish=new JFrame();
			   ob.finish.setSize(400, 400);
			   ob.finish.setLayout(new GridLayout(4,1));
			   ob.finish.add(new JLabel("You have reached the end of the quiz"));
			ob.finish.add(new JLabel("Press Quit to exit"));
//		      ob.replay=new JButton("Play Again");
		      ob.exit=new JButton("Quit");
		      //ob.finish.add(ob.replay);
		      ob.finish.add(ob.exit);
 		  
 		  
// 		   ob.replay.addActionListener(ob);
 		   ob.exit.addActionListener(ob);
			
			
			
			ob.a1.addActionListener(ob);
			ob.b1.addActionListener(ob); 
			
			ob.a2.addActionListener(ob);
			ob.b2.addActionListener(ob); 
			
			ob.a3.addActionListener(ob);
			ob.b3.addActionListener(ob);
			
			ob.a4.addActionListener(ob);
			ob.b4.addActionListener(ob);
			
			ob.a5.addActionListener(ob);
			ob.b5.addActionListener(ob);
  }
       public void actionPerformed(ActionEvent e)
       {
    	   if(e.getSource()==start)
    	   {
    		   total=new JLabel("Score : "+ score);
   			    q1.add(total);
    		   q1.setVisible(true);
    		   home.setVisible(false);
    	   }
    	   if(e.getSource()==end)
    		   System.exit(0);
    	   if(e.getSource()==a1)
    	   {
    		   JOptionPane.showMessageDialog(null,"Sorry !! Wrong Answer ");
    		   total=new JLabel("Score : "+ score);
   			   q2.add(total);
    		   q2.setVisible(true);
    		   q1.setVisible(false);
    	   }
    	   if(e.getSource()==b1)
    	   {
    		   score++;
    		   JOptionPane.showMessageDialog(null," Yay !!! Correct answer ");
    		   total=new JLabel("Score : "+ score);
   			   q2.add(total);
    		   q2.setVisible(true);
    		   q1.setVisible(false);
    	   }
    	   if(e.getSource()==b2)
    	   {
    		   JOptionPane.showMessageDialog(null,"Sorry !! Wrong Answer ");
    		   total=new JLabel("Score : "+ score);
   			   q3.add(total);
    		   q3.setVisible(true);
    		   q2.setVisible(false);
    	   }
    	   if(e.getSource()==a2)
    	   {
    		   score++;
    		   JOptionPane.showMessageDialog(null," Yay !!! Correct answer ");
    		   total=new JLabel("Score : "+ score);
   			   q3.add(total);
    		   q3.setVisible(true);
    		   q2.setVisible(false);
    	   }
    	   if(e.getSource()==b3)
    	   {
    		   JOptionPane.showMessageDialog(null,"Sorry !! Wrong Answer ");
    		   total=new JLabel("Score : "+ score);
   			   q4.add(total);
    		   q4.setVisible(true);
    		   q3.setVisible(false);
    	   }
    	   if(e.getSource()==a3)
    	   {
    		   score++;
    		   JOptionPane.showMessageDialog(null," Yay !!! Correct answer ");
    		   total=new JLabel("Score : "+ score);
   			   q4.add(total);
    		   q4.setVisible(true);
    		   q3.setVisible(false);
    	   }
    	   if(e.getSource()==a4)
    	   {
    		   JOptionPane.showMessageDialog(null,"Sorry !! Wrong Answer ");
    		   total=new JLabel("Score : "+ score);
   			   q5.add(total);
    		   q5.setVisible(true);
    		   q4.setVisible(false);
    	   }
    	   if(e.getSource()==b4)
    	   {
    		   score++;
    		   JOptionPane.showMessageDialog(null," Yay !!! Correct answer ");
    		   total=new JLabel("Score : "+ score);
   			   q5.add(total);
    		   q5.setVisible(true);
    		   q4.setVisible(false);
    	   }
    	   if(e.getSource()==b5)
    	   {
    		   JOptionPane.showMessageDialog(null,"Sorry !! Wrong Answer ");
    		   total=new JLabel("Score : "+ score);
    		  finish.add(total);
    		  finish.setVisible(true);
  		      q5.setVisible(false);
    		   
    		 
    	   }
    	   if(e.getSource()==a5)
    	   {
    		   score++;
    		   JOptionPane.showMessageDialog(null," Yay !!! Correct answer ");
    		   total=new JLabel("Score : "+ score);
   			   finish.add(total);
   			  finish.setVisible(true);
  		      q5.setVisible(false);
    	   }
//    	   if(e.getSource()==replay)
//		   {
//			   q1.remove(total);
//    		   score=0;
//			   total=new JLabel("Score : "+ score);
//   			   q1.add(total);
//			   finish.setVisible(false);
//			   q1.setVisible(true);
//		   }
		   if(e.getSource()==exit)
		   {
//			   
			   finish.setVisible(false);
			   System.exit(0);
		   }
       }
  }
  
