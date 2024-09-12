package homework.homework2.weight_luggage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        countWeight("luggage.csv");
        System.out.println(countWeight("luggage.csv"));
    }

    public static String countWeight(String fileName) throws IOException {
        String info;
        try (InputStream luggage = homework.homework2.unload_luggage.Runner.class.getClassLoader()
            .getResourceAsStream(fileName); Scanner scanner = new Scanner(luggage)) {
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
            } return info = "легкий " + Integer.toString(small) + "\n" +
                "средний " + Integer.toString(medium) + "\n" +
                "тяжелый " + Integer.toString(big);
        }
    }
}

