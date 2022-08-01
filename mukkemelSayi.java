import java.util.Scanner;

public class mukkemelSayi {
    public static void main(String[] args) {
        int n,perfect = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayý giriniz  :  ");
        n = inp.nextInt();

        for (int i=n-1; i>=1; i--){
            if (n%i==0){
                perfect+=i;}
        }

        if (perfect == n){
            System.out.print("Sayýnýz mükkemmel'dir:   :  ");
        }else {
            System.out.print("Sayýnýz mükemmel deðildir    : ");
        }



    }
}
