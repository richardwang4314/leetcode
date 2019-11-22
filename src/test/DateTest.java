package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created on 2019/6/11.
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("中文字减字我在这边");

        //減7天
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.add(Calendar.DATE, -7);
        Date date1 = now.getTime();
        System.out.println("現在時間: " + df.format(date));
        System.out.println("減7天: " + df.format(date1));

        //時區調整
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date2=df.parse("2019-11-22 10:57:03");
        System.out.println(date2);
    }
}
