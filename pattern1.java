import java.util.Scanner;

public class pattern1 {
    public static void main(String[]args){
        Scanner var =new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n= var.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
