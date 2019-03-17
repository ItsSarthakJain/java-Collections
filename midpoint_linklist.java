
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
	public static int printMiddel(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int i=0;
        while(i!=count/2-1)
        {
            i++;
            temp=temp.next;
        }
        return temp.data;
    }
}