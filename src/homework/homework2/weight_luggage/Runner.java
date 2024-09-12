package homework.homework2.weight_luggage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        try (InputStream luggage = homework.homework2.unload_luggage.Runner.class.getClassLoader()
            .getResourceAsStream("luggage.csv"); Scanner scanner = new Scanner(luggage)) {
            int small = 0;
            int medium = 0;
            int big = 0;
            while (scanner.hasNextLine()) {
                String[] element = scanner.nextLine().split(";");
                try {
                    int weight = Integer.parseInt(element[1]);
                    if (weight < 5) {
                        small = small + weight;
                    } else if (weight < 10) {
                        medium = medium + weight;
                    } else {
                        big = big + weight;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            System.out.println(Integer.toString(small));
            System.out.println(Integer.toString(medium));
            System.out.println(Integer.toString(big));
        }
    }
}
