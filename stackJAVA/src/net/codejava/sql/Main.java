package net.codejava.sql;
import java.io.*;
import java.util.*;

public class Main {
    public static class customStack
    {
        ArrayList<Integer> data = new ArrayList<>();
        int tos;
        customStack()
        {
            tos = -1;
        }
        public void addIntoStack(int num)
        {
            tos++;
            data.add(tos, num);
            System.out.println("Successfully added " + num + " into stack");
        }
        public void peekFromStack()
        {
            if(data.isEmpty())
            {
                System.out.println("Stack is Empty!");
            }
            else
            {
                System.out.println("First element in Stack :  " + data.get(tos));
            }
        }
        public void popFromStack()
        {
            if(data.isEmpty())
            {
                System.out.println("Stack is Empty!");
            }
            else
            {
                data.remove(tos);
                System.out.println("Successfully removed " );
                tos--;
            }
        }
        public void sizeOfStack()
        {
            System.out.println("Size of Stack : " + (tos + 1));
        }
        public void displayStack()
        {
            System.out.println("Stack Elements :  " + data);
        }
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        int choice;
        customStack cs = new customStack();
        do
        {
            System.out.println("-----Stack Menu-----");
            System.out.println("1: Add Element");
            System.out.println("2: Peek Element");
            System.out.println("3: Pop Element");
            System.out.println("4: Display Element");
            System.out.println("5: Stack Size");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your Choice : ");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1 ->
                        {
                            System.out.print("\n Enter element to add: ");
                            int num = Integer.parseInt(br.readLine());
                            cs.addIntoStack(num);
                        }
                case 2 -> cs.peekFromStack();
                case 3 -> cs.popFromStack();
                case 4 -> cs.displayStack();
                case 5 -> cs.sizeOfStack();
                default -> System.out.println("Alert! Wrong Input.");
            }
            System.out.print("Want to continue?(y/n) : ");
            choice = br.read();
        }while(choice != 'n');
    }
}
