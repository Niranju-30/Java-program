import java.io.*;
import java.util.*;
import java.lang.*;
class LinkedList
 {
    Node start;
    class Node
    {
        int data;
        Node next;
        Node(int num)
        {
            data=num;
            next=null;
        }
    }
    //insert @beginning
    public void insertBeginning(int data)
    {
        Node newNode=new Node(data);
        newNode.next=start;
        start=newNode;
    }
//insert @end
    public void insertEnd(int data)
    {
        Node newNode=new Node(data);
        if(start==null)
        start=newNode;
        Node tptr=start;
        while(tptr.next!=null)
        tptr=tptr.next;
        tptr.next=newNode;
    }
    public void insertAfter(int pos,int data)
    {
        Node newNode=new Node(data);
        int size=calSize(start);
        if(pos<1 || pos>size)
        System.out.println("you Cannnot insert here");
        else{
            Node tptr=start;
            while(--pos>0)
            tptr=tptr.next;
            newNode.next=tptr.next;
            tptr.next=newNode;
        }
        }
        public int calSize(Node node)
        {
            int size=0;
            while(node!=null)
            {
                node=node.next;
                size++;
            }
            return size;
 
       }
       public void displayLL()
       {
        Node tptr=start;
        while(tptr!=null)
        {
            System.out.print(tptr.data + "->");
            tptr=tptr.next;
        }
       }
    }
    public class Main{
        public static void main(String args[])
        {
            LinkedList obj=new LinkedList();
            obj.insertBeginning(10);
            obj.insertBeginning(20);
            obj.insertBeginning(30);

            obj.displayLL();
            obj.insertEnd(5);
            System.out.println();
            obj.displayLL();
            obj.insertAfter(3,100);
            System.out.println();
            obj.displayLL();
        }
    }