

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
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
    {
     LinkedListNode<Integer> temp = head;
        int count=0;
        while(temp!=null)
        {
            if(temp.next!=null)
             count=temp.next.data;
            if(temp.next!=null&&temp.data==count)
            temp.next=temp.next.next;
           // n.data=temp.data;
           
            else
            temp=temp.next;
        }
        
		return head;   
    }
}