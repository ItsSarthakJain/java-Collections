
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
	public static void printReverseRecursive(LinkedListNode<Integer> root) 
    {
        LinkedListNode<Integer> temp=root;
        if(temp==null)
            return;
        printReverseRecursive(temp.next);
        System.out.print(temp.data+" ");
    }
}