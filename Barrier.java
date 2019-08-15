package task1.course;
/**Класс Барьер со свойством heightBarrier (высота барьера)*/
public class Barrier {

    public int getHeightBarrier() {
        return heightBarrier;
    }

    protected int heightBarrier;
    /**Конструктор класса*/
    public Barrier() {

        this.heightBarrier = (int) (Math.random()*100); // определяем высоту барьера
    }
}
