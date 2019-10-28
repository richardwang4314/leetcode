package test;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created on 2019/6/11.
 */
public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("中文字减字我在这边");
    }
}
