import java.util.*;

// Queue: FIFO. First In First Out.
public class Queue {

	public static void main(String[] args) {

		LinkedList<String> ls = new LinkedList<String>();
		
		ls.offer("홍길동");
		ls.offer("김동자");
		ls.offer("유명한");
		ls.offer("천세원");
		
		System.out.println("Size = " + ls.size());
		
		while(ls.peek() != null) // 읽을 값이 있을 때
			System.out.println(ls.poll()); //값을 읽어서 출력
		
		System.out.println("Size = " + ls.size());
	}

}
