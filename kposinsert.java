package practice2024;

public class kposinsert {
    kposinsert next;
    int value;

    public kposinsert(int value) {
        this.value = value;
        this.next=null;
    }
   static kposinsert position(kposinsert head, int pos,int data)
   {
       kposinsert temp = new kposinsert(data);
       if(pos==1)
       {temp.next=head;
           return temp;
       }
       kposinsert temp1 =head;
       for(int i =1; i<=pos-2&&temp1!=null;i++)
             temp1 = temp1.next;
       if(temp1==null)
           return head;
       temp.next = temp1.next;
       temp1.next=temp;
       return head;

   }
    public static void main(String[] args) {
        kposinsert head =new kposinsert(500);
        kposinsert ok = new kposinsert(501);
        kposinsert ok1 = new kposinsert(502);
        kposinsert ok2 = new kposinsert(503);
        kposinsert ok3 = new kposinsert(504);
        kposinsert ok4 = new kposinsert(505);
        head.next=ok;
        ok.next=ok1;
        ok1.next=ok2;
        ok2.next=ok3;
        ok3.next=ok4;

        position(head,3,506);
        while (head.next!=null)
        {
            System.out.println(head.value);
            head=head.next;
        }
        System.out.println(head.value);

    }
}
