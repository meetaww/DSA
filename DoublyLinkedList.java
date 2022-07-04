
public class DoublyLinkedList {
	node head;
	
	class node{
		int data;
		node next, prev;
		
		node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public void add_beg(int val) {
		node newNode = new node(val);
		
		if(head==null) {
			head = newNode;
			newNode.prev = null;
			newNode.next = null;
		}
		else {
		newNode.next = head;
		head = newNode;
		newNode.prev = null;
		}
		
	}
	
	public void add_end(int val) {
		node newNode = new node(val);
		node curr = head;
		
		while(curr.next!=null) {
			curr = curr.next;
			
		}
		curr.next = newNode;
		newNode.next = null;
	}
	
	public void print() {
		node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.add_beg(10);
		dl.add_beg(20);
		dl.add_end(30);
		dl.add_end(40);
		dl.print();
		
	}

}
