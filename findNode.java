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
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		LinkedListNode<Integer> temp = head;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(temp.data==n)
            return count-1;
                // n.data=temp.data;
            temp=temp.next;
        }
       // System.out.print(temp.data);
		return -1;
	}
}