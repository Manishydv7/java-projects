/*In this program Book is POJO there are 3 private variables and contains methods getter, setter and
 *toString method.
 *we have also implemented comparable functional interface.
 *@ManishYadav*/
package CollectionProject;
//Book class
public class Book implements Comparable<Book>
{
//private variable
	private int bid;
	private String subject;
	private String author;
	
// parameterized constructor
	public Book(int bid, String subject, String author) 
	{
		super();
		this.bid = bid;
		this.subject = subject;
		this.author = author;
	}
	
	public final int getBid() {
		return bid;
	}

	public final void setBid(int bid) {
		this.bid = bid;
	}

	public final String getSubject() {
		return subject;
	}

	public final void setSubject(String subject) {
		this.subject = subject;
	}

	public final String getAuthor() {
		return author;
	}

	public final void setAuthor(String author) {
		this.author = author;
	}
//toString method
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", subject=" + subject + ", author=" + author + "]";
	}
//compareTo method
	@Override
	public int compareTo(Book o) {
		return this.author.compareTo(o.getAuthor());
	}
	
}
