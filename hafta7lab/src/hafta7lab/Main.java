package hafta7lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String isim,soyisim;
		double saat,wage;
		long tc;
		
		System.out.println("İsim soyisim: ");
		isim = input.next();
		soyisim = input.next();
		
		System.out.println("TC: ");
		tc=input.nextLong();
		
		System.out.println("Kac Saat: ");
		saat=input.nextDouble();
		
		System.out.println("Saatlik ucret: ");
		wage=input.nextDouble();
		
		HourlyEmployee e = new HourlyEmployee(isim,soyisim,tc,saat,wage);
		Employee d = new Employee(isim,soyisim,tc);
		System.out.println(e.write());
	}

}
