package test;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by Richard on 2019/6/18.
 */
public class StringTest {
    public static void main(String[] args) {
        String t = "abcde";
        t = t.substring(2);
        System.out.println(t);

        //md5
        String md5 = getMd5("wqew");
        System.out.println(md5);
    }

    //判斷String是否能轉換成Long
    private static boolean isLong(String s) {
        try {
            long long1 = Long.parseLong(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //將String進行MD5加密
    private static String getMd5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            return "MD5加密錯誤，" + e.toString();
        }
    }
}
