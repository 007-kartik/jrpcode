import java.util.Scanner;

public class pattern6 {
    public static void main(String[]arhs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum++;
                System.out.print((char)(64+sum));}
                System.out.println();
            }
        }
    }

