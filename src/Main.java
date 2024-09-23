import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("task1");

        //task1.1
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        //System.out.println(Arrays.toString(array));

        //task1.2
        double[] array2 = new double[]{1.57, 7.654, 9.986};
        //System.out.println(Arrays.toString(array2));

        //task1.3
        double[] myArray = {1.13, 15, 30, 17.5, 11};
        //System.out.println(Arrays.toString(myArray));


        //task2
        System.out.println("task2");

        //task2.1
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        //task2.2
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }


        //task2.3
        for (int i1 = 0; i1 < myArray.length; i1++) {
            if (i1 < myArray.length - 1) {
                System.out.print(myArray[i1] + ", ");
            } else {
                System.out.println(myArray[i1]);
            }
        }


        //task3
        System.out.println("task3");

        //task3.1
        for (int i = array.length-1; i >=0; i--) {
            array[i]=i+1;
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }

        //task3.2
        for (int i = array2.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        //task3.3
        for (int i = myArray.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(myArray[i]);
                break;
            }
            System.out.print(myArray[i] + ", ");
        }


        //task4
        System.out.println("task4");


        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
            if (array[i]%2!=0){
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));


    }
}