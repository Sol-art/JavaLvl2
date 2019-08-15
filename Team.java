package task1.team;

import java.util.Arrays;
/** Класс Комманда со свойством teammates(сокомандники) */
public class Team {

    protected Teammate [] teammates = new Teammate[2 + (int) (Math.random()*5)];//Определяем количество участников в команде

    public Teammate[] getTeammates() {
        return teammates;
    }
    /** Конструктор класса */
    public Team() {

        for (int i = 0; i < teammates.length; i++){   // Наполняем команду

            teammates [i] = new Teammate();
        }
    }
    /** Метод выводит инф-у о прохождении препятсвий*/
    public void showResults() {

        for (Teammate i : this.teammates) {

            System.out.println("Участник номер " + (Arrays.asList(teammates).indexOf(i)+1) + " преодолел " + i.getPass() + "-е препятствие"); //
        }
    }
}
