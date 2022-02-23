package collectionFremwork;

public class Author {
	private  int id;
	private String name;
	private String bookname;
	public Author(int id,String name,String bookname) {
	
	super();
	this.id=id;
	this.name=name;
	this.bookname=bookname;
	}
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("Author[id=").append(id).append(",name=").append(name).append(", bookname=").append("]");
	return builder.toString();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBookname() {
		return bookname;
	}
	
	
}
