import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	
	String quantity = JOptionPane.showInputDialog("how old are you?");
	int No = Integer.parseInt(quantity);
	
	if(No>=18) {
		JOptionPane.showMessageDialog(null,"who do you think the next president should be");
	}
	if(No<18) {
		JOptionPane.showMessageDialog(null,"nobody cares what you think");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
