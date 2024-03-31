package generic.inplement;

import generic.design.SORT;
import generic.entity.FootballTeam;

import java.util.List;

public class Shoting implements SORT<FootballTeam>
{

    @Override
    public void selectionSort(List<FootballTeam> listname)
    {


    }

    @Override
    public void insertionSort(List<FootballTeam> listname)
    {
        int number1;
        FootballTeam x;
        for(int i = 1; i < listname.size(); i++){
            x = listname.get(i); // khai bao o ngoai de co the luu tru gia tri bien x
            number1 = i;

        }


    }

    @Override
    public void bubbleSort(List<FootballTeam> listname)
    {
        int min; // chỉ số phần tử nhỏ nhất
        for (int i = 0; i < listname.size() - 1; i++) {
            min = i;
            for(int j = i + 1; j < listname.size(); j++) {
                if (listname.get(i).getId()>listname.get(i+1).getId())
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
                if (min != i) {
                    FootballTeam temp = listname.get(j);
                    listname.set(j,listname.get(j+1)) ;
                    listname.set(j+1,temp);
                }
            }
        }
    }
}
