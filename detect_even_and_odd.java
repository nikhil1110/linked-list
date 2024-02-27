package practice2024;
import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class detect_even_and_odd  {

    public static void main(String args[])
    {
        Node head=new Node(17);
        head.next=new Node(15);
        head.next.next=new Node(8);
        head.next.next.next=new Node(12);
        head.next.next.next.next=new Node(10);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=new Node(4);
        printlist(head);
        head=segregate(head);
        printlist(head);

    }

    static Node segregate(Node head){
        Node es=null,ee=null,os=null,oe=null;
        int x;
        for(Node curr=head;curr!=null;curr=curr.next)
        {
         x= curr.data;
         if(x%2==0)
         {
             if(es==null)
             {
                 es=ee=curr;
             }
             else
             {
                 ee.next=curr;
                 ee=ee.next;
             }
         }
         else
         {
             if(os==null)
             {
                 os=oe=curr;
             }
             else
             {
                 oe.next=curr;
                 oe=oe.next;
             }
         }
        }
        if(es==null || os ==null )
            return head;
       ee.next=os;
       oe.next=null;
       return es;


    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
