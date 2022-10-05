public class ketqua {
    public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee(" le huy tuan dung", 15000, 7);
		System.out.println("Name: " + employee1.getName());
		System.out.println("luong hôm nay là: " + employee1.calculateSalary());

		IEmployee employee2 = new FullTimeEmployee(" nguyen van a", 35000);
		System.out.println("Name: " + employee2.getName());
		System.out.println("luong hôm nay: " + employee2.calculateSalary());

        IEmployee employee3 = new FullTimeEmployee(" nguyen van b", 25000);
		System.out.println("Name: " + employee3.getName());
		System.out.println("luong hôm nay: " + employee3.calculateSalary());
	}
}
