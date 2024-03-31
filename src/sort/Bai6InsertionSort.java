package sort;

import java.util.Arrays;

public class Bai6InsertionSort
{
    // insertionSort
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
        insertionSort(arrayNumber);
        System.out.println(Arrays.toString(arrayNumber));
    }
    public static void insertionSort(int[] array) {
        int number1, x;
        for(int i = 1; i < array.length; i++){
            x = array[i]; // khai bao o ngoai de co the luu tru gia tri bien x
            number1 = i;
            while(number1 > 0 && x < array[number1-1]){
                // đổi chỗ
                array[number1] = array[number1-1];
                number1--;
            }
            array[number1] = x;
        }
    }

}
