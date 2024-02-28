package practice2024;

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next,random;
    Node(int x)
    {
        data = x;
        next = random = null;
    }
}
class CloningList{

    public static void print(Node start)
    {
        Node ptr = start;
        while (ptr!=null)
        {
            System.out.println ( "Data = " + ptr.data + ", Random  = "+ ptr.random.data );
            ptr = ptr.next;
        }
    }

    public static Node clone(Node head)
    {
       Node next;
       for(Node curr=head;curr!=null;)
       {
           next=curr.next;
           curr.next= new Node(curr.data);
           curr.next.next=next;
           curr=next;

       }
       for(Node curr =head;curr!=null;curr=curr.next.next)
       {
           curr.next.random=(curr.random!=null)?curr.random.next:null;
       }
       Node original=head,copy=head.next;
       Node ok=copy;
       while(original!=null && copy!=null)
       {
           original.next=(original.next!=null)?original.next.next:null;
           copy.next=(copy.next!=null)?copy.next.next:null;
           copy=copy.next;
           original=original.next;


       }
  return ok;
    }
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        System.out.print( "Original list : \n");
        print(head);

        System.out.print( "\nCloned list : \n");
        Node cloned_list = clone(head);
        print(cloned_list);
    }
}


