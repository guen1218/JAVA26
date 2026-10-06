package example3;

import java.util.Arrays;

public class BookTest {
	public static void main(String[] args) {
		Book books[] = {new Book(15000), new Book(50000), new Book(20000)};
		System.out.println("정렬 전");
		for(Book bb : books) {
			System.out.println(bb);
		}
		
		int new_neo_books[] = new int[books.length];
		for(int i=0; i<books.length; i++) {
			new_neo_books[i] = books[i].getPrice();
		}
		Arrays.sort(new_neo_books);
		
		System.out.printf("\n정렬 후\n");
		for(int nnb : new_neo_books) {
			for(Book bb : books) {
				if(bb.getPrice() == nnb)
					System.out.println(bb);
			}
		}
	}	
}
