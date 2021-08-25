package exam2;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		System.out.println("== 책의 가격의 합 출력 ==");
		int sum = bookList.parallelStream().mapToInt(b -> b.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("== 2만원 이상인 책 이름 정렬하여 출력 ==");
		bookList.stream().filter(b -> b.getPrice() >= 20000).map(b -> b.getName()).sorted().forEach(s -> System.out.println(s));

	}

}
