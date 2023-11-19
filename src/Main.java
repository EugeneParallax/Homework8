public class Main {
    public static void main(String[] args) {

        System.out.println("=== Task 1 === Initializing arrays");
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        char[] arrayChar = new char[4];
        arrayChar[0] = 'A';
        arrayChar[1] = 'B';
        arrayChar[2] = 'C';
        arrayChar[3] = 'D';
        System.out.println("No output required");

        System.out.println("=== Task 2 === Listing array values");
        // First array
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i]);
            if (i < arrayInt.length - 1) System.out.print(", ");
        }
        System.out.println();

        // Second array
        for (int i = 0; i < arrayFloat.length; i++){
            System.out.print(arrayFloat[i]);
            if (i < arrayFloat.length - 1) System.out.print(", ");
        }
        System.out.println();

        // Third array
        for (int i = 0; i < arrayChar.length; i++){
            System.out.print(arrayChar[i]);
            if (i < arrayChar.length - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.println("=== Task 3 === Listing array values in inverted order");
        // First array
        for (int i = arrayInt.length - 1; i >= 0; i--){
            System.out.print(arrayInt[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        // Second array
        for (int i = arrayFloat.length - 1; i >= 0; i--){
            System.out.print(arrayFloat[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        // Third array
        for (int i = arrayChar.length - 1; i >= 0; i--){
            System.out.print(arrayChar[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        System.out.println("=== Task 4 === Processing first array to find and modify odd values");
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] % 2 != 0){
                arrayInt[i] += 1;
                System.out.println("значение переменной массива по индексу " + i + " - нечетное, значение изменено на " + arrayInt[i]);
            }
        }
    }
}