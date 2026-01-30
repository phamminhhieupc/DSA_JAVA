import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = daoNguocChuoi(s);
        System.out.println(str);
    }
    public static String daoNguocChuoi(String s){
        if(s==null||s.length()<=1){
            return s;
        }else{
            return daoNguocChuoi(s.substring(1)) +s.charAt(0);
        }
    }
}
