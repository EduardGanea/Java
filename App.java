import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String [] args) throws Exception{
        File file = new File("src\\file.in");
        Scanner sc = new Scanner(file);

        int n = sc.nextInt();
        int [] v = Vector12.createVector(n);
        int x;
        int y;

        while(sc.hasNextInt()) {
            x = sc.nextInt();

            if(x == 1) {
                int pos1 = sc.nextInt();
                int pos2 = sc.nextInt();

                Vector12.reorderVector(pos1, pos2, v);
                Vector12.printVector(v, n);
                System.out.println("\n");
            }else
                if(x==2){
                y = sc.nextInt();
                Vector12.printElement(y, v);
                System.out.println("\n");
            }
        }

        sc.close();
    }

}
