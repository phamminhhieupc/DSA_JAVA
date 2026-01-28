import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = daoNguoc(n,0);
        System.out.println(s);
    }
    public static long daoNguoc(int n,long kq){
        if (n==0){
            return kq;
        }else{
            return daoNguoc(n/10,kq*10+(n%10));
        }
    }
}
