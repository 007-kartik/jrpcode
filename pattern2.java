import java.util.Scanner;

public class pattern2 {
    public static void main(String[]args){
        Scanner var = new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n= var.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("5");
            }
            System.out.println();
        }
    }
}
