package practice2024;
import java.util.*;
public class printnthfromend {

    int value;
    printnthfromend next;
    printnthfromend(int value)
    {
        this.value=value;
        this.next=null;
    }
    static printnthfromend insert(int value,printnthfromend head)
    {
        printnthfromend temp = new printnthfromend(value);
        temp.next=head;
        return temp;

    }

    static void printnode(printnthfromend head, int n) {
        if(head==null)
        return;
        printnthfromend first=head;
        printnthfromend second = head;
        for(int i=0;i<n;i++)
        {
            first=first.next;
        }
        while(first!=null)
        {
            second=second.next;
            first=first.next;
        }
        System.out.println("the value of node from"+n+"position is "+second.value);
    }


    public static void main(String[] args) {
        printnthfromend head=null;
        head = insert(50,head);
        head = insert(51,head);
        head = insert(52,head);
        head = insert(53,head);
        head = insert(54,head);
        head = insert(55,head);
        head = insert(56,head);
        head = insert(57,head);
        printnode(head,2);
        while (head.next!=null)
        {
            System.out.println(head.value);
            head=head.next;
        }
        System.out.println(head.value);

    }
}
