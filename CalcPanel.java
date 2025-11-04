

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class CalcPanel extends JPanel implements ActionListener {
	String num1="";
	String num2="";
	String operator="";
	boolean usingFirst=true;
	double total=0;
	JTextField display;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;
	JButton bdec;
	JButton bclear;
	JButton bequals;
	JButton bplus;
	JButton bsubtraction;
  JButton bmultiply;
  JButton bdivide;
  JButton bpercent;
  JButton bsquare;
  JButton bdel;
  JButton bVectadd;
  
	public CalcPanel()
	{
		this.setBackground(Color.white);
		setLayout(null);
		display=new JTextField();

		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdec=new JButton(".");
		bclear=new JButton("C");
		bequals = new JButton( "=");
		bplus=new JButton("+");
    bsubtraction=new JButton("-");
    bmultiply=new JButton ("x");
    bdivide=new JButton ("÷");
    bpercent=new JButton ("%");
    bsquare=new JButton ("√");
    bdel=new JButton ("D");
    bVectadd=new JButton ("V");
		display.setBounds(0,0,205,50);

    //postion of button on GUI
		b1.setBounds(0,200,50,50);
		b2.setBounds(50,200,50,50);
		b3.setBounds(100,200,50,50);
		bplus.setBounds(154,200,50,50);
    bsubtraction.setBounds (154,150,50,50);
    bmultiply.setBounds (154,100,50,50);
    bdivide.setBounds (154,50,50,50);
    bpercent.setBounds (100,50,50,50);
    bsquare.setBounds (50,50,50,50);
    bdel.setBounds (0,50,50,50);
    bVectadd.setBounds (208,50,50,50);

		b4.setBounds(0,150,50,50);
		b5.setBounds(50,150,50,50);
		b6.setBounds(100,150,50,50);

		b7.setBounds(0,100,50,50);
		b8.setBounds(50,100,50,50);
		b9.setBounds(100,100,50,50);
		
		b0.setBounds(0,250,50,50);
		bdec.setBounds(50,250,50,50);
		bclear.setBounds(100,250,50,50);
		bequals.setBounds(154,250,50,50);
			
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bdec);
		add(display);
		add(bclear);
		add(bequals);
		add(bplus);
    add(bsubtraction);
    add(bmultiply);
    add(bdivide);
    add(bpercent);
    add(bsquare);
    add(bdel);
    add(bVectadd);
    
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bequals.addActionListener(this);
		bplus.addActionListener(this);
		bclear.addActionListener(this);
		bdec.addActionListener(this);
    bsubtraction.addActionListener(this);
    bmultiply.addActionListener(this);
		bdivide.addActionListener(this);
    bpercent.addActionListener(this);
    bsquare.addActionListener(this);
    bdel.addActionListener(this);
    bVectadd.addActionListener(this);

    //border around buttons is set with a pixel of 2 of gray line
    b1.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b2.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b3.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b4.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b5.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b6.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b7.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b8.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b9.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		b0.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bsubtraction.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bplus.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bmultiply.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bdivide.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bdel.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bclear.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bequals.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bsquare.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		bdec.setBorder(BorderFactory.createLineBorder(Color.blue, 2, true));
		bpercent.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
    bVectadd.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
    bdec.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));

    //RGB values used to define gray colour
Color MyGray = new Color(211, 211, 211);

    // Background colour is set to gray that was defined
		b1.setBackground(MyGray);
		b2.setBackground(MyGray);
		b3.setBackground(MyGray);
		b4.setBackground(MyGray);
		b5.setBackground(MyGray);
		b6.setBackground(MyGray);
		b7.setBackground(MyGray);
		b8.setBackground(MyGray);
		b9.setBackground(MyGray);
		b0.setBackground(MyGray);
		bclear.setBackground(MyGray);
		bdec.setBackground(MyGray);
		bplus.setBackground(MyGray);
		bsubtraction.setBackground(MyGray);
		bmultiply.setBackground(MyGray);
		bdivide.setBackground(MyGray);
		bsquare.setBackground(MyGray);
		bpercent.setBackground(MyGray);
		bequals.setBackground(MyGray);
		bdel.setBackground(MyGray);
    bVectadd.setBackground(MyGray);



    
	}

  //Check for if button that is pressed is # or decimal
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		if(s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||
			s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||
			 s.equals("9")||s.equals("0")||s.equals("."))
		{
      //Check if using first or second #
			if(usingFirst)
			{
		//add pressed # button to first #
				num1=num1+s;
				display.setText(num1);
			}
			else
			{
        //add pressed # button to second #
				num2=num2+s;
				display.setText(num2);
			}
		}
    //check if button pressed is addition operator
		if(s.equals("+"))
		{
			usingFirst=false;
			operator="+";
		}
        //check if button pressed is subtraction operator
    if (s.equals("-"))
    {
      usingFirst=false;
      operator="-";
    }
        //check if button pressed is multiplication operator
    if (s.equals("x"))
    {
    usingFirst=false;
      operator="*";
    }
        //check if button pressed is division operator
    if (s.equals("÷"))
    {
    usingFirst=false;
      operator="/";
    }
        //check if button pressed is percent operator
    if (s.equals("%"))
    {
    usingFirst=false;
    operator="%";
    }
        //check if button pressed is square root operator
    if (s.equals("√"))
    {
    usingFirst=false;
    operator="√";
    }
        //check if button pressed is vector addition operator
    if (s.equals("Vect+")) {
    usingFirst = false;
    operator = "Vect+";
    }
        //check if button pressed is equals operator
		if(s.equals("="))
		{
			double firstNum = Double.parseDouble(num1);
        double secondNum = Double.parseDouble(num2);
        double firstResult = 0.0;

      // Operation is done based on the operator that is chosen
			switch(operator){
			case "+":
                firstResult = firstNum + secondNum;
				break;
        case "-":
                firstResult = firstNum - secondNum;
        break;
        case "*":
                firstResult = firstNum * secondNum;
        break;
        case "/":
          // get error if number is divided by zero feature
          if(num2.equals("0")) {
            display.setText("Error: Division is by zero");
            return;
          }
                firstResult = firstNum / secondNum;
        break;
          //added a percent operator to calculator by dividing by 100
        case "%":
                firstResult = firstNum * secondNum / 100;
        break;
        case "√":
          firstResult = Math.sqrt(firstNum); 
          break;
        case "Vect+":
          //Calculator reset for vector addition
          usingFirst = true;
          num1 = "";
          num2= "";
          operator = "";
          return;
          case "":
          //If no operator is chosen, first # is returned
				firstResult=Double.parseDouble(num1);
				break;
			}
      //Calculation result is displayed
			display.setText( ""+firstResult );
      {
        
      }
      //multiple operations to be done at once
			usingFirst=true;
			num1= Double.toString(firstResult);
			num2="";
			operator="";
		}
    //check if button is clear
		if(s.equals("C"))
		{
      //clear variables and display
			display.setText( "" );
			usingFirst=true;
			num1="";
			num2="";
			total=0;
		}
    //check if button is delete that is pressed
    if (s.equals("D")){
      if (usingFirst){
        //if first #, remove last character from num1
        if (!num1.isEmpty()){
          num1 = num1.substring(0,num1.length()-1);
          display.setText(num1);
        }
      }else{
                //if second #, remove last character from num2
        if (!num2.isEmpty()){
          num2 = num2.substring(0, num2.length()-1);
          display.setText(num2);
        }
      }
      }
    }
} 
