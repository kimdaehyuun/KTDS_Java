package exam2;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		System.out.println("== å�� ������ �� ��� ==");
		int sum = bookList.parallelStream().mapToInt(b -> b.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("== 2���� �̻��� å �̸� �����Ͽ� ��� ==");
		bookList.stream().filter(b -> b.getPrice() >= 20000).map(b -> b.getName()).sorted().forEach(s -> System.out.println(s));

	}

}
