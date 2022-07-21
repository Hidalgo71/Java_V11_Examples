package Class101;

public class secsMinsExample
{
    public static void main(String[] args)
    {
        getDurationString(100, 20);
    }

    public static void getDurationString(int minutes, int seconds)
    {
        int totalSecs = 0, hours = 0;
        hours = minutes / 60;
        minutes = minutes % 60;
        if ((minutes >= 0) && (seconds >=0 && seconds <= 59))
        {
            System.out.println(hours + "H" + minutes + "M" + seconds + "S");
        }
        else
        {
            System.out.println("Invalid Value!");
        }
    }
}
