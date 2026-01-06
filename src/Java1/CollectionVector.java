package Java1;
import java.util.*;

public class CollectionVector {
	
		
		
			public static void main(String[] args) {
			
				// vector 
				
				Vector<Integer> v = new Vector<Integer>(3,2);

				System.out.println(v.size());
				System.out.println(v.capacity());
				v.add(1);
				v.addElement(2);
				v.addElement(3);
				v.addElement(4);
				System.out.println(v);
				System.out.println(v.capacity());
				System.out.println(v.firstElement());
				System.out.println(v.lastElement());
				
				
					// List 
					
					List<String> list = new ArrayList<String> ();
					LinkedList<String> ll = new LinkedList<String> ();
					list.add("one");
					list.add("two");
					list.add("three");
					for(String s: list) {
						System.out.println(s);
					}
					
					System.out.println(list.contains("one"));
					
					ll.add("three");
					ll.add("Zero");
					ll.addFirst("sonio");
					ll.lastIndexOf(ll);
					ll.addLast("Giyan");
					System.out.println(ll);
					ll.remove();
					System.out.println(ll);
					
		
//stack
System.out.println("------Stack frame--------");
Stack<Integer> s = new Stack<Integer>();
s.push(1);
s.push(2);
s.push(3);
System.out.println(s.pop());
System.out.println(s.pop());
System.out.println(s.pop());

//Queue
System.out.println("------Queue frame--------");
Queue<String>queue= new LinkedList<>();
queue.add("One");
queue.add("One");
queue.add("One");
System.out.println(queue);
queue.remove("One");
System.out.println(queue);
System.out.println("Queue total size : "+ queue.size());
System.out.println(queue.contains("Three"));
queue.clear();

System.out.println("------Deque frame--------");
Deque<Integer> num = new ArrayDeque<>();
num.offer(1);
num.offerLast(2);
num.offerLast(3);
System.out.println("Deque elements: "+ num);
int first = num.peekFirst();
System.out.println("first Element is : "+ first);
int lastElement = num.peekLast();
System.out.println("Last Element is : "+ lastElement);
int remove = num.pollFirst();
System.out.println("Remove first Element  : "+ remove);
System.out.println("Update Deque is : "+ num);

//Array Deque
System.out.println("------Array Deque frame--------");

ArrayDeque<String> ad = new ArrayDeque<String>();
ad.push("one");
ad.push("Two");
ad.push("Three");
ad.push("Four");
System.out.println(ad.pop());
while(ad.peek()!=null) {
	System.out.println(ad.pop());
}
//Iterator
System.out.println("------Iterator frame--------");
ArrayList<String> al = new ArrayList<String>();
al.add("One");
al.add("Two");
al.add("Three");

/*Map Interface
 * Inherited from collection Interface
 * The map cant */

Map<Integer, String> map= new HasMap<Integer, String>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");
for(Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();iterator.hasNext());
		{
			Enter<Integer,String>m= iterator.next();
			System.out.println(m.getkey()+ " "+ m.getValue());
		}
		
		/*SortedSet Interface
		Interface maintains mapping in ascending order
		used for naturally order collection*/
		
		SortedSet set = new TreeSet();
				set.add("One");
				set.add("Two");
				Iterator i = set.iterator();
				while(i.hasNext())
				{
					Object element = i.next();
					System.out.println()
				}
}
}


