package com.ant.error; import java.util.regex.Pattern; import java.util.regex.Matcher;

import javax.swing.JButton; import javax.swing.JFrame; import javax.swing.JLabel; import javax.swing.JOptionPane; import javax.swing.JPanel;

import java.awt.Component; import java.awt.GridBagLayout; import java.awt.GridLayout; import java.awt.event.ActionEvent; import java.io.File; import java.io.IOException; import java.util.ArrayList; import java.util.Scanner; import java.util.regex.*;

public class ant { public static void main(String[]Args)throws IOException { System.out.println(System.getProperty("user.dir")); var file=new Scanner(new File("Vocabulary.txt"));

ArrayList<String> linesArray = new ArrayList<String>();
ArrayList<String> filterlinesArray = new ArrayList<String>();

while(file.hasNextLine())  {
	linesArray.add(file.nextLine().toString());
}
	
Object[] lines = linesArray.toArray();

int total=0;
for(int i=0;i<=lines.length; i++) {

	if(lines[i].toString().contains("adj.)") | lines[i].toString().contains("n.)") | lines[i].toString().contains("v.)")) {
		  int linebeforenext=3;
		  for(int j=1; j<20; j++) {
			  if(lines[i+j].toString().contains("adj.)") | lines[i+j].toString().contains("n.)"
			  		+ ""
			  		+ "") | lines[i+j].toString().contains("v.)")){
				linebeforenext=j;
			
				break;
				}
			  }
		  total=total+1;
		  JPanel panel=new JPanel(new GridLayout(20,0));
		  panel.getAutoscrolls();
		  
		  JButton myButton = new JButton("Exit");
		  myButton.setSize(400, 300);
		  myButton.addActionListener((ActionEvent e)->{System.exit(0);});
	      panel.add(myButton);
		 
		  panel.add(new JLabel("Word: " + lines[i]));
		  panel.add(new JLabel("		             " ));
		  panel.add(new JLabel("Meaning: " ));
		 
		  for(int s=1; s < linebeforenext; s++) {	
			
			  panel.add(new JLabel(lines[i + s].toString()));
		  }
		  panel.add(new JLabel("Network range is: " + c.toString()));
		  Component frame = null;
		 
		  JOptionPane.showMessageDialog(frame, panel);
		  
	   }
	
	
	}	

}

}
