import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int num=0;
        int [][]c=new int[a][b];
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                c[i][j]=1;
            }
        }
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                if(c[i][j]==1){
                    num++;
                }
                if((i+2)<a){
                    c[i+2][j]=0;
                }
                if((j+2)<b){
                    c[i][j+2]=0;
                }
            }
        }
        System.out.println(num);
    }
}