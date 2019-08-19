package task2;
/**This is the main class*/
public class Main  {
/**This is the main method*/
    public static void main(String[] args) throws MyArraySizeException {
        Array right = new Array(4,4);
        Array wrongLeinght = new Array(4,3);
        Array wrong = new Array(4,4);
        wrong.array[3][2] = "Wrong";
        checkArray(right);
        checkArray(wrongLeinght);
        checkArray(wrong);

    }
/**This is a method of counting the sum of all numbers in an array*/
    static void checkArray (Array a) throws MyArraySizeException {
        int k = 0;
        try {
            if (a.array.length != 4 || a.array[0].length !=4){
                throw new MyArraySizeException("Array size does not match.");
            }
            for (int i = 0; i < a.array.length; i++){
                for (int j = 0; j < a.array[0].length; j++){
                    if (checkString(a.array[i][j])){
                        k = k + Integer.parseInt(a.array[i][j]);
                    }
                    else {
                        throw new MyArrayDataException("Cell data "+ i +" " + j +" to convert fails");
                    }
                }
            }
            System.out.println(k);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
/**This is a method of testing whether a string can be converted to a int*/
    static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
            

