
public class SalePerson implements Comparable<SalePerson>{
	private String firstName;
	private String lastName;
	private int totalSales;
	public SalePerson(String f, String l, int sales) {
		firstName = f;
		lastName = l;
		totalSales = sales;
	}
	public String toString() {
		return firstName + " ,"  + lastName + " : " + totalSales;
	}
	public boolean equals(SalePerson s) {
		boolean isEqual = false;
		if(s.getFirstName()==firstName && s.getLastName()==lastName)
			isEqual = true;
		return isEqual;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public int compareTo(SalePerson s) {
		int x = totalSales;
		int y = s.getTotalSales();
		if(x>y)return 1;
		if(x<y)return -1;
		return lastName.compareTo(s.getLastName());

	}
}
