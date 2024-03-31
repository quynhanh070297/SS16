package sort;

import java.util.Arrays;

public class Bai6BubbleSort
{
    //B1 : Tao mot ham random chua sap xep
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
    public static void main(String[] args)
    {
        //B2 In ra mang chua sap xep
        System.out.println(Arrays.toString(getArr()));
        int [] arrayNumber = getArr();
        //B3 trien khai thuat toan
        bubbleSort(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));
    }
    public static void bubbleSort(int[] array) {
        //Thuat toan noi bot
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    //Dat bien tam temp de doi vi tri giua 2 elem
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
