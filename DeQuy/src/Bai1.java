import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("khong tinh duoc");
        }else{
            long S= factorial(n);
            System.out.println("Giai thua cua n la: "+S);
        }
    }
    public static long factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
}
