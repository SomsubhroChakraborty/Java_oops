import java.util.*;

class Employee {
	String name;
	double basicPay;

	// Default constructor
	public Employee() {
		this.name = "Unknown";
		this.basicPay = 0;
	}

	public Employee(String name, double basicPay) {
		this.name = name;
		this.basicPay = basicPay;
	}

	// Constructor with object as parameter
	public Employee(Employee e) {
		this.name = e.name;
		this.basicPay = e.basicPay;
	}

	public class PayDetails {
		double hra, da, gross;

		public PayDetails(double hra, double da, double gross) {
			this.hra = hra;
			this.da = da;
			this.gross = gross;
		}

		public double getGross() {
			return gross;
		}
	}

	public PayDetails calculate() {
		double hra, da, gross;
		hra = 0.12 * basicPay;
		da = 0.03 * basicPay;
		gross = basicPay + hra + da;
		PayDetails p = new PayDetails(hra, da, gross);
		return p;
	}

	public String getName() {
		return name;
	}
}

public class EmpDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empDetails = new ArrayList<>();
		int n;
		System.out.println("Enter the number of employees:");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee-" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Basic pay: ");
			double basicPay = sc.nextDouble();
			System.out.print("Name:" + name + "\nSalary:" + basicPay);
			Employee e = new Employee(name, basicPay);
			empDetails.add(e);
		}
		System.out.println("The employee whose gross are: ");
		for (int i = 0; i < n; i++) {
			Employee e = empDetails.get(i);
			Employee.PayDetails pay = e.calculate();
			if (pay.getGross() > 50000) {
				System.out.println("Employee-" + i);
				System.out.println("Name: " + e.getName());
				System.out.println("Gross salary: " + pay.getGross());
			}
		}

	}

}