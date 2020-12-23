import java.util.*;
public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (n.hasNextLine()) {
            Scanner line = new Scanner(n.nextLine());
            while (line.hasNext()) {
                String stars = "";
                int length = line.next().length();
                for (int i = 0; i < length; i++) {
                    stars += "*";
                }
                System.out.print(stars + " ");
            }
            System.out.println();
        }
        n.close();
    }
}
