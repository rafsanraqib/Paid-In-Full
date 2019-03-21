import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// This class stores all the variables and the methods needed to calculate remaining balance
public class CreditCard {
	double balance;
	double fee = 0.1;
	String type = "CREDIT";
	String path = "C:\\Users\\Rafsan\\Documents\\New folder\\credit.txt";
	String message = "";
	ArrayList<String[]> creditInfo = new ArrayList<String[]>();
	
	// This method reads from a CSV file and calculates remaining balance
	public void updateBalance() {
		File file = new File(path);
		try {
			
			FileReader fs = new FileReader(file);
			BufferedReader br = new BufferedReader(fs);
			while((message = br.readLine()) != null) {
			String[] a = message.split(",");
			this.creditInfo.add(a);
			
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		for (String[] s : creditInfo) {
			
			double v = Double.parseDouble(s[3]);
			
			if (s[1].equals(type)) {
				this.balance += v;
				
			}else {
				
				this.balance = this.balance - v;
			}
			
			}
		
		if (balance == 0) {
			
			System.out.println("Thank you for your payments");
			System.out.printf("You balance is %.0f", this.balance );
			
		}else if(balance < 0) {
			
			double b = Math.abs(balance);
			System.out.printf("Thank you for your payments, you overpayment is $%.2f", b );
			
		}else {
			
			this.balance += fee*(this.balance);
			System.out.println("Your balance is not paid fully");
			System.out.println("A 10 percent fee has been charged");
			System.out.printf("Remaining balance after 10 percent fee is $%.2f", this.balance);
		}
		
	}
	
}
