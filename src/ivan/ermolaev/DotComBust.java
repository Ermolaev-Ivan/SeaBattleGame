package ivan.ermolaev;

import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList <DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom who = new DotCom();
        who.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("");
        dotComList.add(one);
        dotComList.add(who);
        dotComList.add(three);

        System.out.println("Ваша цель потопить " + dotComList.size() + " 'сайта'.");
        System.out.println("Pets.com, eToys.com, Go2.com.");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов.");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCome(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("Потопил")){
                break;
            }
            if(result.equals("Потопил")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Все 'сайты' ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбрать до того как ваши вложения утонули.");
        }else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main (String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
