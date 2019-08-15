package task1;

import task1.course.Course;
import task1.team.Team;
/**Класс Главный*/
public class Main {
    public static void main(String[] args) {
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team(); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
