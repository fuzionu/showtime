package showtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy HH:mm");
        Date date = new Date(time);
        System.out.println(dateFormat.format(date));
    }
}
