import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String o = in.nextLine();
        String[] str = o.split(" ");
        int[] b = new int[str.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.valueOf(str[i]);
        }
        int t = b[b.length - 1];
        int[] a = new int[b.length - 1];
        {
            for (int i = 0; i < a.length; i++) {
                a[i] = b[i];
            }
        }


        Ssort(a, a.length);
        for (int i = 0; i < t; i++) {
            System.out.print(a[i]);
            if(i<t-1){
                System.out.print(" ");
            }
        }
    }

    private static void Ssort(int[] a, int k) {
        for (int i = 1; i < k; i++) {
            int j = i - 1;
            int p = a[i];
            for (; j >= 0&&a[j]>p; j--){
                a[j + 1] = a[j];

            }
            a[j + 1] = p;
        }
    }
}