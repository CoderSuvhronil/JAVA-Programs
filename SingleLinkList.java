import java.util.Scanner;

class SingleLinkList 
{
    // Node class for the linked list
    static class Node 
    {
        int n;
        Node next;
        Node(int n) 
        {
            this.n = n;
            this.next = null;
        }
     }

    // Head of the linked list
    Node head;

    // Add a new node to the linked list
    void addNode(int x) 
    {
        Node t = new Node(x);
        if (head == null) 
        {
            head = t;
        } 
        else 
        {
            Node p = head;
            while (p.next != null) 
            {
                p = p.next;
            }
            p.next = t;
        }
    }

    // Display the elements of the linked list
    void show() 
    {
        Node h = head;
        System.out.print("The elements are: ");
        while (h != null) 
        {
            System.out.print(h.n + "  ");
            h = h.next;
        }
    }

    // Main method to run the program
    public static void main(String[] args) 
    {
        SingleLinkList sl = new SingleLinkList();
        Scanner sc = new Scanner(System.in);
        String ans;

        do {
            System.out.print("Enter a value: ");
            while (!sc.hasNextInt()) 
            {  
                // Handle non-integer input
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();  // Clear invalid input
            }
            int x = sc.nextInt();

            sl.addNode(x);

            System.out.print("Enter another value? (yes/no): ");
            ans = sc.next();

        } while (ans.equalsIgnoreCase("yes"));

        sl.show();
        sc.close();  // Close the Scanner to free resources
    }
}
