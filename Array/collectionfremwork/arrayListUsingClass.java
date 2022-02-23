package collectionFremwork;

import java.util.ArrayList;

public class arrayListUsingClass {

	public static void main(String[] args) {
		// way 1 to store element in a list
		ArrayList<Author>  list=new ArrayList<Author>();
		/*Author a1=new Author(101,"Balguruswami","Let use C");
		Author a2=new Author(102,"schild","Database managment system");
		Author a3=new Author(103,"mc","Java complete refrence");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		*/
		//way 2
		list.add(new Author(101,"Balguruswami","Let use C"));
		list.add(new Author(102,"schild","Database managment system"));
		list.add(new Author(103,"mc","Java complete refrence"));
		System.out.println(list);
		for(Author author:list)
		{
			System.out.println("Id:"+author.getId()+""+"Name:"+author.getName()+""+"BookName:"+author.getBookname());
		}
	}

}
/*
 * output
 * [Author[id=101,name=Balguruswami, bookname=], Author[id=102,name=schild, bookname=], Author[id=103,name=mc, bookname=]]
Id:101Name:BalguruswamiBookName:Let use C
Id:102Name:schildBookName:Database managment system
Id:103Name:mcBookName:Java complete refrence
*/