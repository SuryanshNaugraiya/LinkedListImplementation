package main;

import linkedlist.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList x = new LinkedList();
        boolean flag = true;
        while (flag) {
            System.out.println("enter 1 to insert at first ");
            System.out.println("enter 2 to insert at last");
            System.out.println("enter 3 to insert at position ");
            System.out.println("enter 4 to delete at first");
            System.out.println("enter 5 to delete at last");
            System.out.println("enter 6 to delete at position ");
            System.out.println("enter 7 to view data");
            System.out.println("enter 8 to check is list empty or not");
            System.out.println("enter 9 to find no. of elements");
            System.out.println("enter 10 to exit");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            int value, position;
            switch (choice) {
                case 1:
                    System.out.println("enter the value");
                    value = sc.nextInt();
                    x.insertAtFirst(value);
                    break;
                case 2:
                    System.out.println("enter the value");
                    value = sc.nextInt();
                    x.insertAtLast(value);
                    break;
                case 3:
                    System.out.println("enter the value");
                    value = sc.nextInt();
                    System.out.println("enter the position");
                    position = sc.nextInt();
                    x.insertAtPosition(value, position);
                    break;
                case 4:
                    x.deleteFirst();
                    break;
                case 5:
                    x.deleteLast();
                    break;
                case 6:
                    System.out.println("enter the position");
                    position = sc.nextInt();
                    x.deleteAtPosition(position);
                    break;
                case 7:
                    x.showData();
                    break;
                case 8:
                    x.IsEmpty();
                    break;
                case 9:
                    x.numberOfElements();
                    break;
                case 10:
                    flag = false;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
