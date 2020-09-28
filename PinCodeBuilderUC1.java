import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeBuilderUC1 {
	public void Validate(String pincode) {
		String regex ="^[0-9]{6}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pincode);
		if(matcher.matches()) {
			System.out.println("Valid Pin Code");
		}
		else {
			System.out.println("Invalid Pin Code");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the pincode");
		Scanner scanner = new Scanner(System.in);
		String pincode = scanner.nextLine();
		scanner.close();
		PinCodeBuilderUC1 p = new PinCodeBuilderUC1();
		p.Validate(pincode);
	}

}
