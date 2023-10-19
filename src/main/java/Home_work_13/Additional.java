package Home_work_13;

public class Additional {
    public static void main(String[] args) {

        String[] myArray = {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2", "J2", "K2"};
        String[] myArray2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("\n");

        printOriginal(myArray);
        reverseArray(myArray);

        System.out.println("\n");

        printOriginal(myArray2);
        reverseArray(myArray2);

    }

    public static void printOriginal(String[] myArray) {
        System.out.print("Original array: ");
        for (String s : myArray) {
            System.out.print(s + " ");
        }
    }

    public static void reverseArray(String[] myArray) {

        String temp1 = "";
        String temp2 = "";
        int n = 0;

        for (int i = 0; i < myArray.length; i++) {
            n = myArray.length - i - 1;
            if (i < n) {
                temp1 = myArray[i];
                temp2 = myArray[n];
                myArray[i] = temp2;
                myArray[n] = temp1;
            } else {
                break;
            }
        }
        System.out.println();
        System.out.print("Reverse array: ");
        for (String s : myArray) {
            System.out.print(s + " ");
        }
    }
}

