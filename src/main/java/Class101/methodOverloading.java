package Class101;

public class methodOverloading
{
    public static void main(String[] args)
    {
        int newScore = calculateScore("De Bruyne", 3);
        System.out.println("New score is: " + newScore);
        System.out.println("=======================================");
        calculateScore("Haaland", 3, 9);
        System.out.println("=======================================");
        calculateScore();
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println(playerName + " scored " + score + " gooaaaallll" );
        return score * 2;
    }

    //Method Overloading
    public static int calculateScore(String playerName, int score, int jerseyNumber)
    {
        System.out.println(playerName + " scored " + score + " gooaaaallll" );
        System.out.println(playerName + " Jersey Number Is: " + jerseyNumber);
        return score * 2;
    }

    //Method Overloading VOID
    public static void calculateScore()
    {
        System.out.println("And he missed!");
    }
}
