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

	public static void printIth(LinkedListNode<Integer> head, int i){
		LinkedListNode<Integer> temp = head;
        int count=0;
        while(count!=i)
        {
           count++;
            if(temp==null)
                return;
            temp=temp.next;
        }
        System.out.print(temp.data);
        //return count;
	}
}