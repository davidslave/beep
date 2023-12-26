package vehicle;

public class MyClass {
	private String beep;

	public MyClass(String beep) {
		this.beep = beep;
	}

	public String toString() {
		return this.beep;
	}

	public static void main(String[] args) {
		MyClass myVehicle = new MyClass("Beep");
		System.out.println(myVehicle.toString());
	}
}
