package practice2024;

import java.util.*;
import java.io.*;
import java.lang.*;

public class intersectionnode {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }



    int getNode()
    { int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;
        if(c1>c2)
        {  d= c1-c2;
            return _getIntesectionNode(d,head1,head2);
        }
        if(c2>c1)
        {
            d=c2-c1;
            return _getIntesectionNode(d,head2,head1);
        }
        return -1;
    }

    int _getIntesectionNode(int d, Node node1, Node node2)
    {
           Node curr1=node1;
           Node curr2=node2;


        for( int i=0;i<d;i++)
        {
           curr1= curr1.next;
        }
        while(curr1!=null && curr2!=null)
        {
            if(curr1.data==curr2.data)
            { return curr1.data;}
            curr1=curr1.next;
            curr2= curr2.next;
        }
        return -1;
    }

    int getCount(Node node)
    {
        Node curr =node;
        int count =0;
        while(curr!=null)
        {
            curr = curr.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        intersectionnode list = new intersectionnode();

        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);

        System.out.println(list.getNode());
    }
}


