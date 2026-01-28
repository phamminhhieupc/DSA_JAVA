import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sumN(n);
        System.out.println(s);

    }
    public  static long sumN(int n){
        if(n<10){
            return n;
        }else{
            return n %10+sumN(n/10);
        }
    }
}
