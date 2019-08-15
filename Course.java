package task1.course;

import task1.team.Team;
import task1.team.Teammate;
/**Класс Дистанция со свойством barriers(барьеры)*/
public class Course {

protected Barrier [] barriers = new Barrier[1 + (int) (Math.random()*5)];// определяем количество барьеров

    /**Конструктор класса*/
    public Course() {

        for (int i = 0; i < barriers.length; i++){   // Наполняем дистанцию барьерами

           this.barriers[i] = new Barrier();
        }
    }

    /**Метод прохождения дистанции командой*/
    public void doIt(Team team) {
        for ( Teammate a : team.getTeammates()) // Каждый участник проходит дистанцию
        {
                  for (Barrier i : this.barriers) {
                        if (i.getHeightBarrier() < a.getMaxHeight()){
                            a.setPass(a.getPass()+1);
                        }
                  }
        }
        
    }
}
