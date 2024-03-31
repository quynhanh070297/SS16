package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai2
{  // Tim 1 so trong mang 2 chieu
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }
    // Mang tren tra ve 1 mang 2 chieu
    public static void main(String[] args)
    {
        // In ra mang 2 chieu
        System.out.println(Arrays.deepToString(getArr()));
        searchNum(6);




        //B6: in ra các vị trí và trả vể biến check

    }
    //B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean
    public static boolean searchNum(int number)
    {
        //B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
        int[][] arrNum = getArr();

        //B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
        List<Integer> arrList1 = new ArrayList<>();
        List<Integer> arrList2 = new ArrayList<>();

        //B4: tạo biến check dkl bolean, mặc định = false
        boolean check = false;
        //B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều, nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
        for (int i = 0; i < arrNum.length; i++)
        {
            System.out.println("Cac vi tri xuat hien so" + number + "la");
            for (int j = 0; j < arrNum[i].length; j++)
            {
                if (number == arrNum[i][j])
                {

                    System.out.println("["+i + "," + j+"]");;
                    check = true;

                }
            }
            if (check)
            {
                return check;
            }
        }
        return check;
    }
}
