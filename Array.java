package task2;
/**This class fills an array*/
public class Array {
    protected String[][] array;

    public Array(int i, int j) {
        String[][] arrRight = new String[i][j];
        int k = 1;
        for (int a = 0; a < arrRight.length; a++){
            for (int b = 0; b < arrRight[0].length; b++){
                arrRight [a][b] = Integer.toString(k);
                k++;
            }
        }
        this.array = arrRight;
    }
}
