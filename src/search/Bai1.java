package search;

import java.util.Arrays;

public class Bai1
{
  //Bai1  Tim so lon nhat trong mang chua sap xep
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
        // B1 : Gán mảng
        int [] newArr = getArr();
        // B2 : In ra Mảng
        System.out.println(Arrays.toString(newArr));
        // Đặt giá trị Max cho mảng
        int maxValue = 0;
        // Duyệt qua mảng bằng LinearSeach
        for (int i = 0; i < newArr.length ; i++)
        {
            if (newArr[i]>maxValue){
                maxValue= newArr[i];
            }
        }
        // In ra mang
        System.out.println(maxValue);
    }
}
