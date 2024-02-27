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

class breaktheloop  {

    public static void main(String args[])
    {
        Node head=new Node(15);
        head.next=new Node(10);
        head.next.next=new Node(12);
        head.next.next.next=new Node(20);
       head.next.next.next.next=head.next;
      //  printlist(head);
         BreakLoop(head);
        System.out.println("new linked list is");
        printlist(head);
    }

    static void BreakLoop(Node head)
    {  Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(slow!=fast)
            return  ;
        slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        return;
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
