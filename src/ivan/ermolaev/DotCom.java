package ivan.ermolaev;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourSelf(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Потопил";
            }else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }
}
