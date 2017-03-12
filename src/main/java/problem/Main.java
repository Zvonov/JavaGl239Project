package pointsLines;
import java.util.Scanner;

public class Main {
//привел четкий пример, чтобы показать, мой алгоритм работает. Можно было поставить и какой-нибудь рандомайзер или ввод с клавиатуры//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    PointsPair found = new PointFinder()
                .point(61, 2)
                .point(3, -1)
                .point(4, 3)
                .point(-2, 1)
                .point(-1, -2)
                .line(0.25, 1)
                .line(1.5, 2)
                .line(1.5, 3)
                .line(1.5, 1)
                .line(-3, 46)
                .line(1, -2)
                .find();
        if (found == null) {
            System.out.println("Nothing found...");
        }
        else {
            System.out.println(found);
        }
    }
}
