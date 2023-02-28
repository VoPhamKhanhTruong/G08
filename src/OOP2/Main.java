package OOP2;

public class Main {

	public static void main(String[] args) {
		Time time = new Time(24, 60, 60);
		Time nextSecondTime = time.nextSecond();
		System.out.println(time.toString());
		
		Author author = new Author("Truong", "voxtruong93@gmail.com", 'c');
		System.out.println(author.toString());
		
		Book book = new Book("Truong", "voxtruong93@gmail.com", 'c', "Nguyen Nhat Anh", 19.00, , 0)
	}
}
