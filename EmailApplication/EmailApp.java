package EmailApplication;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em1=new Email("Rakesh","Ranjan");
		em1.changePassword("GVKU@134");
		em1.setalternateEmail("Rakesh867@gmail.com");
		System.out.print(em1.showInfo());
		
	}

}
