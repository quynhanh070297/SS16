package generic.entity;

import java.util.List;
import java.util.Scanner;

public class FootballTeam
{
    private int id;
    private String name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam()
    {
    }

    public FootballTeam(int id, String name, int numberOfPlayer, int score)
    {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumberOfPlayer()
    {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer)
    {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "FootballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                '}';
    }
    public void displayData(){
        System.out.println(this);
    }
    public void inputData(Scanner scanner , List<FootballTeam> footballTeamList){
        inputId(footballTeamList) ;
        System.out.println("Moi ten doi bong");
        this.name = scanner.nextLine();
        System.out.println("Moi nhap so cau thu");
        this.numberOfPlayer = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap so ban ");
        this.score = Integer.parseInt(scanner.nextLine());
    }
    // ID tu tang
    private int inputId(List<FootballTeam> footballTeamList)
    {
        //Nếu list chưa có phần tử nào thì đây chính là phần tử đầu tiên
        if (footballTeamList.isEmpty())
        {
            return this.id = 1;
        } else
        {
            int maxId = footballTeamList.get(0).id;
            for (FootballTeam footballTeam : footballTeamList)
            {
                //Tìm ra id lớn nhất hiện có trong list employee
                if (footballTeam.id > maxId)
                    maxId = footballTeam.id;
            }
            return this.id = ++maxId;
        }
    }
}
