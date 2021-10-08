package net.codejava.sql;
import java.util.*;
import java.io.*;
public class Main {

    public static class customQueue
    {
        ArrayList<Integer> data = new ArrayList<>();
        int size;
        customQueue()
        {
            size = -1;
        }
        public void addIntoQueue(int num)
        {
            size++;
            data.add(size, num);
            System.out.println("Successfully added " + num + " into Queue");
        }
        public void peekFromQueue()
        {
            if(data.isEmpty())
            {
                System.out.println("Queue is Empty!");
            }
            else
            {
                System.out.println("First element in Queue :  " + data.get(0));
            }
        }
        public void removeFromQueue()
        {
            if(data.isEmpty())
            {
                System.out.println("Stack is Empty!");
            }
            else
            {
                data.remove(data.get(0));
                System.out.println("Successfully removed " );
                size--;
            }
        }
        public void sizeOfQueue()
        {
            System.out.println("Size of Queue : " + (size + 1));
        }
        public void displayQueue()
        {
            System.out.println("Queue Elements :  " + data);
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int choice;
        customQueue cq = new customQueue();
        do
        {
            System.out.println("-----Queue Menu-----");
            System.out.println("1: Add Element");
            System.out.println("2: Peek Element");
            System.out.println("3: Remove Element");
            System.out.println("4: Display Element");
            System.out.println("5: Queue Size");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your Choice : ");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1 ->
                        {
                            System.out.print("\n Enter element to add: ");
                            int num = Integer.parseInt(br.readLine());
                            cq.addIntoQueue(num);
                        }
                case 2 -> cq.peekFromQueue();
                case 3 -> cq.removeFromQueue();
                case 4 -> cq.displayQueue();
                case 5 -> cq.sizeOfQueue();
                default -> System.out.println("Alert! Wrong Input.");
            }
            System.out.print("Want to continue?(y/n) : ");
            choice = br.read();
        }while(choice != 'n');
    }
}
