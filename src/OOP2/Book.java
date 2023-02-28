package OOP2;

public class Book extends Author{
	String name;
	Author[] authors;
	double price;
	int qty = 0;
	public Book(String name, String email, char gender, String name2, Author[] authors, double price, int qty) {
		super(name, email, gender);
		name = name2;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getAuthorNames() {
		String rs = "";
		for (Author author : authors) {
			rs+=author.name + ",";
		}
		if(!rs.isEmpty()) {
			rs=rs.substring(0,rs.length()-1);
		}
		return rs;
	}
	@Override
	public String toString() {
		String authorString="";
		for (Author author : authors) {
			authorString += author.toString() + ",";
		}
		if(!authorString.isEmpty()) {
			authorString=authorString.substring(0,authorString.length()-1);
		}
		return String.format("Book[name=%s,author={%s},price=%f,qty=%d]", name,authorString,price,qty);
	}
}
