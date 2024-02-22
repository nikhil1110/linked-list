package practice2024;

public class insetatend {

    int a ;
    insetatend next;
    public insetatend(int a) {
        this.a = a;
        this.next =null;
    }
  static insetatend ins(int a,insetatend head)
    {
        insetatend temp = new insetatend(a);
        if(head == null)
            return temp;
        insetatend temp1=head;
        while(head.next!=null)
        {
            head=head.next;
        }
        head.next=temp;

        return temp1;


   }

    public static void main(String[] args) {
        insetatend head = null;
        head = ins(25,head);
        head = ins(26,head);
        head = ins(227,head);
        while (head.next!=null)
        {
            System.out.println(head.a);
            head=head.next;
        }
        System.out.println(head.a);

    }

}
