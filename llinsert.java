package practice2024;

public class llinsert {

    int value;
    llinsert next;
    llinsert(int value)
    {
        this.value=value;
        next=null;
    }
   static llinsert insert(int value,llinsert head)
   {
       llinsert temp = new llinsert(value);
       temp.next=head;
       return temp;

   }
    public static void main(String[] args) {
        llinsert head=null;
        head = insert(50,head);
        head = insert(51,head);
        head = insert(52,head);
        while (head.next!=null)
        {
            System.out.println(head.value);
            head=head.next;
        }
        System.out.println(head.value);
    }
}
