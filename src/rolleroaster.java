import javax.swing.JOptionPane;

public class rolleroaster {
	public static void main(String[] args) {
		
		String quantity = JOptionPane.showInputDialog("how tall are you?");
		int No = Integer.parseInt(quantity);
		
		if(No>48) {
			JOptionPane.showMessageDialog(null,"You can go on the rollercoaster");
		}
		if(No<48) {
			JOptionPane.showMessageDialog(null,"You can't go on the rollercoaster");
		}
		
		
		
		
		
		
	}

}
