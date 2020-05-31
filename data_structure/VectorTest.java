import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// 정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(5);
		vector.add(4);
		vector.add(-1);
		
		System.out.println(vector);

		vector.add(2, 100); // index2. 4와 -1 사이에 100 삽입
		
		System.out.println(vector);
		System.out.println("벡터 안 요소 객체 수:" + vector.size());
		System.out.println("벡터의 현재 용량:" + vector.capacity());
		
		// 모든 요소 출력
		for(int i=0; i<vector.size(); i++) {
			int n = vector.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i=0; i<vector.size(); i++) {
//			int n = vector.get(i);                 get이나 element나 같음.
			int n = vector.elementAt(i);
			sum += n;
		}
		System.out.println(sum);
		
	}

}
