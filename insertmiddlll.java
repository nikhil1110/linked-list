package practice2024;
public class insertmiddlll {

    int value;
    insertmiddlll next;
    insertmiddlll(int value)
    {
        this.value=value;
       this.next=null;
    }
    static insertmiddlll insert(int value, insertmiddlll head)
    {
        insertmiddlll temp = new insertmiddlll(value);
        temp.next=head;
        return temp;

    }
    static void middle(insertmiddlll head)
    {   insertmiddlll slow=head;
        insertmiddlll fast = head;
        if(head==null)
            return;
       while(fast!=null && fast.next!=null)
       {
           slow = slow.next;
           fast = fast.next.next;
       }
        System.out.println("the middle of list is "+slow.value);
    }

    public static void main(String[] args) {
        insertmiddlll head=null;
        head = insert(50,head);
        head = insert(51,head);
        head = insert(52,head);
        head = insert(53,head);
        head = insert(54,head);
        head = insert(55,head);
        head = insert(56,head);
        head = insert(57,head);
       middle(head);

        while (head.next!=null)
        {
            System.out.println(head.value);
            head=head.next;
        }
        System.out.println(head.value);
    }
}








