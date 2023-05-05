package ivan.ermolaev;

import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDotCom dot = new SimpleDotCom();
        String result = "";
        int numOfGuesses = 0;
        int firstPositionLocations = (int) (Math.random() * 4);
        int[] locations = {firstPositionLocations, firstPositionLocations + 1, firstPositionLocations + 2};

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
