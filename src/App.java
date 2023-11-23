import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner userInput = new Scanner(System.in);
        
        int i = userInput.nextInt();

        for ( i = i; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Blast off");
                break;
            }
            System.out.println(i);
        }
        
        System.out.println((int)(Math.random()*(5+1)+40));
    }
}
