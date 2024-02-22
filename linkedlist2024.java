package practice2024;

public class linkedlist2024 {
    int data;
    linkedlist2024 llk;
    linkedlist2024(int data)
    {
        this.data=data;
        llk=null;
    }
    public static void main(String[] args) {
        linkedlist2024 head = new linkedlist2024(25);
        linkedlist2024 tail1 = new linkedlist2024(26);
        linkedlist2024 tail2 = new linkedlist2024(27);
        head.llk=tail1;
        tail1.llk=tail2;
        System.out.println(head.data);
        System.out.println(tail1.data);
        System.out.println(tail2.data);
        System.out.println(tail2.llk);
        System.out.println(tail1.llk.llk);

    }











}
