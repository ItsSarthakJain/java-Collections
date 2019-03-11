/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
		LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> n=null;
        int count=0;
        while(temp!=null)
        {
           count++;
            if(count==i&&temp.next!=null)
            temp.next=temp.next.next;
           // n.data=temp.data;
            else if(temp!=null)
            temp=temp.next;
        }
       // System.out.print(temp.data);
		return head;
	}
}