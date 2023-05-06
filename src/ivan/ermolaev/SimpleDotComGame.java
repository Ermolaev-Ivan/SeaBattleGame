package ivan.ermolaev;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DotCom dot = new DotCom();
        String result = "";
        int numOfGuesses = 0;
        int firstPositionLocations = (int) (Math.random() * 4);

        ArrayList<String> locations = new ArrayList<>();

        locations.add(Integer.toString(firstPositionLocations));
        locations.add(Integer.toString(firstPositionLocations + 1));
        locations.add(Integer.toString(firstPositionLocations + 2));

        dot.setLocationCells(locations);

        while (!result.equals("Потопил")){

            System.out.println("Введите число: ");
            String userGuess = sc.nextLine();
            result = dot.checkYourSelf(userGuess);
            numOfGuesses ++;
        }
        System.out.println("Вы затратили "+ numOfGuesses + " хода(ов)!");

    }
}
