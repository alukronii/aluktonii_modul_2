package homework.homework2.unload_luggage;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        try(InputStream luggage = Runner.class.getClassLoader().getResourceAsStream("luggage.csv");
            Scanner scanner = new Scanner(luggage)) {
            LinkedList<String> luggageLine = new LinkedList<>();
            int maxCapacity = 10;
            while (scanner.hasNextLine()) {
                System.out.println("Начинается загрузка на ленту");
                for (int i = 0; i < maxCapacity; i++) {
                   if (scanner.hasNextLine()) {
                        String[] element = scanner.nextLine().split(";");
                        if (!element[0].equals("номер багажа")) {
                            luggageLine.addLast(element[0]);
                        } else {
                            break;
                        }
                   }
                }
                System.out.println("Лента загружена, начинается выдача багажа");
                while (!luggageLine.isEmpty()) {
                    System.out.println(luggageLine.pollFirst() + " - выдан");
                }
                System.out.println("Лента пустая, закончена выдача багажа");
            }
        }
    }
}

