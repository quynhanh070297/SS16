package sort;

import java.util.Arrays;

public class Bai6SelectionSort
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
        selectionSort(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));
    }
    public static void selectionSort(int[] array) {
        int min; // chỉ số phần tử nhỏ nhất
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
                if (min != i) {
                    int temp = array[min];
                    array[min] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
