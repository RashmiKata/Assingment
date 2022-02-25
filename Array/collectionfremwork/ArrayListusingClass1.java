package collectionFremwork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListusingClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Author1>  list=new ArrayList<Author1>();
		list.add(new Author1(101,"Balguruswami","Let use C"));
		list.add(new Author1(102,"schild","Database managment system"));
		list.add(new Author1(103,"mc","Java complete refrence"));
		System.out.println(list);
		for(Author1 author:list)
		{
			System.out.println("Id:"+author.getId()+""+"Name:"+author.getName()+""+"BookName:"+author.getBookname());
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
/*
output
[Author[id=101,name=Balguruswami, bookname=], Author[id=102,name=schild, bookname=], Author[id=103,name=mc, bookname=]]
Id:101Name:BalguruswamiBookName:Let use C
Id:102Name:schildBookName:Database managment system
Id:103Name:mcBookName:Java complete refrence
[Author[id=103,name=mc, bookname=], Author[id=102,name=schild, bookname=], Author[id=101,name=Balguruswami, bookname=]]
*/