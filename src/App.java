import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:\\Users\\Pszem\\IdeaProjects\\example.txt";
        String fileName = "example.txt";
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);
        for(int x=in.nextInt(); x > 0; x--) {
            if (x == 3) {
                in.nextLine();
            }
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }
}
