import java.util.*;

public class Bmi {
	static double bmi;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ennet weigth : ");
		double weigth = sc.nextDouble();
		System.out.print("Enter height : ");
		double height = sc.nextDouble();
		height = height / 100;
		height = (Double) Math.pow(height, 2);
		bmi = weigth / height;
		System.out.println("BMI : " + bmi);
	}

}
