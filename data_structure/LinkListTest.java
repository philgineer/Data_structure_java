
public class LinkListTest {

	public static void main(String[] args) {
		
		LinkList list = new LinkList();
		
		list.insert(1, 100);
		list.insert(2, 200);
		list.insert(3, 300);
		list.insert(4, 400);
		list.insert(5, 500);
		
		list.printList();
		
		while(!list.isEmpty()) {
			Link deletedLink = list.delete();
			System.out.println("deleted: ");
			deletedLink.printLink();
			System.out.println("");
			
		}

		list.printList();
	}

}
