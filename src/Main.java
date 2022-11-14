import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,sum=0;

        Scanner scan=new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            sayi=scan.nextInt();
            for (int i=1;i<sayi;i++){
                if(sayi % i==0){
                    sum+=i;
                }
            }
            if (sum==sayi){
                System.out.println(sayi+" Mükemmel sayıdır.");
            }else
                System.out.println(sayi+" Mükemmel sayı değildir.");
        }while(sayi>0);




    }
}