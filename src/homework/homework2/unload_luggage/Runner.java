package homework.homework2.unload_luggage;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        try(InputStream luggage = Runner.class.getClassLoader().getResourceAsStream("luggage.csv"); Scanner scanner = new Scanner(luggage)) {
            LinkedList<String> luggageLine = new LinkedList<>();
            int maxCapacity = 10;
            System.out.println("Начинается загрузка на ленту");
            while (scanner.hasNextLine()) {
                String[] element =  scanner.nextLine().split(";");
                luggageLine.addLast(element[0]);
                if (luggageLine.size() == maxCapacity) {
                    System.out.println("Лента загружена, начинается выдача багажа");
                    while (!luggageLine.isEmpty()) {
                        System.out.println(luggageLine.pollFirst() + " - выдан");
                    }
                    System.out.println("Лента пустая, закончена выдача багажа");
                }
            }
        }
    }
}
