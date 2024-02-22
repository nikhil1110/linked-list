 package practice2024;
/* class node
{
    int data;
    node next;
    node prev;
    public node(int data)
    {
        this.data=data;
        next=prev=null;
    }
}

public class reversedoublyll {

    static node insertion(node head,int data)
    {
        node temp = new node(data);
        temp.next=head;
        if(head!=null)
        {
            head.prev=temp;
        }
        return temp;

    }
    static node reverse(node head )
    {
        if(head==null)
        return head;
        if(head.next==null)
        {return head;}
      node prev=null,curr=head;
        while(curr!=null)
        {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;

        }
        return prev.prev;

    }
    public static void main(String[] args) {
        node head = new node(10);
        node a1 = new node(20);
        node a2 = new node(30);

        head.next=a1;
        a1.prev=head;
        a1.next=a2;
        a2.prev=a1;
        head=  insertion(head,25);
        head=reverse(head);
        while(head!=null)
        {
            System.out.println("after reversal here is dd");
            System.out.println(head.data);
            head = head.next;

        }



    }
}
*/