import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s=sDT(n);
        System.out.println(s);
    }
    public static long sDT(int n){
        if(n<10){
            return n;
        }else{
            return sDT(n/10);
        }
    }
}
