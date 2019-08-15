package task1.team;
/** Класс Сокомандники со свойствами maxHeight(максимальная высота преодоления барьера), pass (количество успешно пройденых барьеров) */
public class Teammate {

    protected int maxHeight;
    protected int pass;

/**Конструктор класса*/
    public Teammate() {

        this.maxHeight = 50 + (int) (Math.random()*150);
    }
    public int getMaxHeight() {
        return maxHeight;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

}
