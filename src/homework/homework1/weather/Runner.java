package homework.homework1.weather;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> january = new ArrayList<>(List.of(0,-1,-1,-2,-5,-6,-7,-8,-9,
            -10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1));
        ArrayList<Integer> february = new ArrayList<>(List.of(-8, -10, -12, -13, -15, -16,
            -12, -7, -8, -10, -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1));
        ArrayList<Integer> temperatureTowMonth = new ArrayList<>();
        temperatureTowMonth.addAll(january);
        temperatureTowMonth.addAll(february);
        int sumTemperature = 0;
        int dayCounter = 0;
        for (Integer temperature : temperatureTowMonth) {
            sumTemperature += temperature;
            dayCounter ++;
        }
        BigDecimal result = new BigDecimal(sumTemperature)
            .divide(new BigDecimal(dayCounter),2,RoundingMode.HALF_UP);
        System.out.println(result);
    }
}
