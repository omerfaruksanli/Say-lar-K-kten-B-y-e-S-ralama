import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x, y , z;
        Scanner input = new Scanner(System.in);

        System.out.print("1.SAYI :");
        x = input.nextInt();

        System.out.print("2.SAYI :");
        y = input.nextInt();

        System.out.print("3.SAYI :");
        z = input.nextInt();

        if ((x<y) && (x<z)){
           if (y<z){
               System.out.println("x < y < z");
           }else{
               System.out.println("x < z < y");
           }
        }else if ((y < x) && (y<z)) {
            if (x<z) {
                System.out.println("y < x < z");
            } else {
                System.out.println("y < z < x");
            }

        } else {
            if (x<y) {
                System.out.println("z < x < y");
            } else {
                System.out.println("z < y < x");
            }
        }

    }
}