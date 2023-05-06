package ivan.ermolaev;

import java.util.ArrayList;

public class DotComTestDrive {

    public static void main(String[] args){

        DotCom dot = new DotCom();
        ArrayList<String> dotArrayList = new ArrayList<>();

        dotArrayList.add("1");
        dotArrayList.add("2");
        String userGuess = "1";
        String testResult = "Неудача";

        dot.setLocationCells(dotArrayList);
        String result = dot.checkYourSelf(userGuess);

        if (result.equals("Попал")){
            testResult = "Пройден";
        }

        System.out.println(testResult);
    }
}
