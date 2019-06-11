package test;

import tool.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created by zihao on 2019/6/11.
 */
public class Date {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(DateUtils.convertToZone(dateFormat.parse("2019-06-11T14:31:00"),8));
    }
}
