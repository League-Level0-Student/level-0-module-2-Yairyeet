import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		for (int i = 0; i < 5; i++) {
			
		
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		
		if(randomNumber==0) {
			
			JOptionPane.showMessageDialog(null,"0");
		 if(randomNumber==1){
			JOptionPane.showMessageDialog(null,"1");
		 }
			
		 if(randomNumber==2){
				JOptionPane.showMessageDialog(null,"2");
			 }
		 if(randomNumber==3){
				JOptionPane.showMessageDialog(null,"3");
			 }
		 if(randomNumber==4){
				JOptionPane.showMessageDialog(null,"4");
			 }
		 if(randomNumber==5){
				JOptionPane.showMessageDialog(null,"5");
			 }
}}}}