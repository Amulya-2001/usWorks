package week2.task;
import java.util.LinkedList;


public class ReverseLinkedList {
	public static void reverse(LinkedList<String> n) {
		String rev="";					
		for( int i=n.size()-1;i>=0;i--) {
			System.out.println(n.get(i));
		}
		
	}
	public static void main(String[] args) {
		LinkedList<String> rivers=new LinkedList<>();
		rivers.add("Ganga");
		rivers.add("Yamuna");
		rivers.add("Narmada");
		System.out.println(rivers);
		reverse(rivers);	
	}
}
