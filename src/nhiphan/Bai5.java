package nhiphan;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5
{ // tim kiem nhi phan danh sach so cho mang da duoc xap sep
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random()*100);

        }
        Arrays.sort(arr);
        return arr;

    }

    public static void main(String[] args)
    {
        //Tim kiem nhi phan danh sach so
        //B1 : tao mang bang ham getArr
        Integer[] newArray = getArr();
        //B2 : Lay 2 so Min va Max tu ban phim
        System.out.println("So can lay tu");
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Den so");
        int last = Integer.parseInt(scanner.nextLine());
        //B3 : Check so nhap vao co hop le khong
        if(first > last) {
            System.out.println("Khoong the tim trong khoang nay");
        }
        //In ra mang
        System.out.println(Arrays.toString(newArray));

        // B4:tim ra vi tri index cua so bat dau first va end trong mang
       int indexFirst = upperIndex(newArray,first);
        System.out.println(indexFirst);
       int indexLast = upperIndex(newArray,last);
        System.out.println(indexLast);
        //
        for (int i = indexFirst; i < indexLast ; i++)
        {
            System.out.println(newArray[i]);
        }
    }

    // Ham tim index
    public static int upperIndex(Integer[] newArr, int b) {
        int index=-1; //  khong thay tra ve -1
        int start=0;
        int end=newArr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            for (int i = 0; i < newArr.length; i++)
            {
                if(newArr[i]==b){
                    index=mid;    // Tra ve index
                    start=mid+1; // check tiep

                }
                else if(newArr[i]>b){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return index;
    }
}
