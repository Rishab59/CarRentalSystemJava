package Model;

public class Client extends User {
	public Client() {
		super();
	}

	@Override
	public void showList() {
		System.out.println("Menu:\n1.] View Cars");
		System.out.println("2.] Rent Car");
		System.out.println("3.] Return Car");
		System.out.println("4.] Show My Rents");
		System.out.println("5.] Edit My Data");
		System.out.println("6.] Quit\n");
	}
}
