public class LinkedList {

    node head;

    class node{
        int data;
        node next;
        node(int data){
            this.data = data; //data has tbeen provied to the node
            next = null; //since it is the only data you are providing now !!
        }
    }

    //Inserting the nodes-beggining
    public  void add_beg(int val) {
        node newNode = new node(val);

        newNode.next = head;
        head = newNode ;
    }

    //Inserting the nodes-end
    public void add_end(int val)
    {
        node newNode = new node(val);

        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = null;
        node last = head;

        while(last.next!=null)
        {
            last = last.next;

        }

        last.next = newNode;
        return;
    }

    //Insertion-at any position(provided)
    public void add_anywhere(int val, int pos)
    {
        node curr = head;
        node prev = null;
        int i = 1;

        node newNode = new node(val);
        if(pos==0){
            System.out.println("Position cant be zero !");
            return;
        }
        else{
            if(head==null || pos ==1){
                add_beg(val);
            }
            
            while(head!=null){
                while(i<pos){
                    prev = curr;
                    curr = curr.next;
                    if(curr.next  == null)
                    {
                        break;
                    }
                   i++;

                }
                
                    newNode.next = curr;
                    prev.next = newNode;
                
            }
        }
    }


    //Deletion - beg
    public void del_beg()
    {
        if(head==null)
        {
            return;
        }
        head = head.next;

    }

    public void del_end(){
        node curr = head;
        node prev = null;

        
        while(curr.next!=null)
        {
            prev = curr;
        curr = curr.next;
        if(curr.next==null)
            break;
        }

        prev.next = null;

    }

    //Deletion-anywhere
    public void del_anywhere(int pos){

        if(pos==0)
            {
                System.out.println("Invalid !!");
                return;
            }
        if(pos==1)
        {
            del_beg();
        }
        else{
            node prev = null;
            node curr = head;
            int i = 1;

            while(i<pos){
                prev = curr;
                curr = curr.next;
                if(curr.next==null)
                {
                    break;

                }
                i++;
            }
            prev.next = prev.next.next;
            

        }
    }

    //Counting the nodes
    public void count(){
        node n =head;
        int c = 0;
        while(n.next!=null)
        {
            c++;
            n = n.next;

        }
        System.out.println("Number of nodes in the list : "+c);

    }

    


    //Printing the list
    public void print(){
        node newNode = head;
        while(newNode!=null)
        {
            System.out.println(newNode.data+ "  ");
            newNode = newNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.add_beg(100);
        ll.add_beg(200);
        ll.add_beg(200);
        ll.add_beg(34);

        // ll.add_anywhere(12, 2);

        // ll.del_beg();
        // ll.del_end();
        ll.del_anywhere(1);
        ll.print();                                                                                                                           
    }

}
