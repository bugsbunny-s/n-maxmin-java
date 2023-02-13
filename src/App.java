import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        
        int n,number,max=0,min=0,i=1,temp=0,a=0;

        System.out.print("Sayı adet girişi : ");
        n = inp.nextInt();

        while(i<=n){
            System.out.print(i + ". sayıyı giriniz :");
            number = inp.nextInt();
            i++;

            if (a==0){
                temp = number;
                a++;
            }
            if(number > max){
                max = number;
            }
            if(number <= temp){
                temp = number;
                min = temp;
            }
        }
        System.out.println("Maximum sayı : " + max);
        System.out.println("Minumum sayı : " + min);
    }
}