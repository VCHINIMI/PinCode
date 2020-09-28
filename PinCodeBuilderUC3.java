import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeBuilderUC3 {
	public void Validate(String pincode) {
		String regex ="^[1-9]{1}[0-9]{4}[0-9]{1}$";		 
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
		PinCodeBuilderUC3 p = new PinCodeBuilderUC3();
		p.Validate(pincode);
	}

}