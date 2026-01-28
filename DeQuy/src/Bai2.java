import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long S= fibo(n);
//        if(n<0){
//            System.out.println("n khong hop le");
//
//        }else{
//            S=sum(n);
//            System.out.println(S);
//        }
        System.out.println("fibo tai vi tri n:"+S);
    }
    public static long sum(int n){
        if(n==0){
            return 0;
        }else{
        return n+sum(n-1);
        }

    }
    public static long fibo(int n){
        if(n<2){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
