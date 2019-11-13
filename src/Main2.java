import java.util.Scanner;

class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            Node head = new Node(0);
            Node a = head;
            for (int i = 1; i < (n > 1000 ? 1000 : n); i++) {
                head.next = new Node(i);
                head = head.next;
            }
            head.next = a;

            int q = a.val;
            while (a != null && a.next != a) {

                a = a.next.next;
                a.next = a.next.next;
                q = a.val;

            }
            System.out.println(q);
        }
    }
}