package test;

import java.util.Base64;

/**
 * Created by zihao on 2019/6/17.
 */
public class Crypt {
    public static void main(String[] args) {
        String s="demoAgent:ba696b9f35b640b9a3ca3dd85d7978";
        String s64= Base64.getEncoder().encodeToString(s.getBytes());
        //System.out.println(s64);
        String token="eyJhbGciOiJSUzI1NiIsImtpZCI6IjVDRThDMDFBNDMwRDRFOUE0MzgyN0YzRTAzQjQ5Njg2Q0IxMjE0MkQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJYT2pBR2tNTlRwcERnbjgtQTdTV2hzc1NGQzAifQ.eyJuYmYiOjE1NjA3NTU3ODIsImV4cCI6MTU2MDc1NzU4MiwiaXNzIjoiaHR0cHM6Ly9zdHMuazJuZXQuaW8iLCJhdWQiOlsiaHR0cHM6Ly9zdHMuazJuZXQuaW8vcmVzb3VyY2VzIiwiazIiXSwiY2xpZW50X2lkIjoiRGVtb0FnZW50IiwiY2xpZW50X2FnZW50IjoiRGVtb0FnZW50IiwiY2xpZW50X29wZXJhdGlvbiI6ImFueSIsInNjb3BlIjpbImFwaSJdfQ.Zcn7vcqgJP-y2XcCf0qImcTCftnA3pvk5LF_14R07kVCgVa1jFTslcVqjtstACGt4tV9FlGlCcTXGIMYnetVfEWbiRnUGM6Y9_nmFo4hhRreVpXEXRw9Gn20qbkLpbbpB_i1bdKUnNT6FIqmoHd5lX05TndzTR2on909iCdgXabfXpOeGSgLZVtChmGCJD1rZUjhy4Wh68cd9Ar8BtdmqtYHTbHpaWna36Lt4Hb9Ah3bJdVbvlldS0PpvmOFoaaIRusyPYXA5ocoPLBt46yiMyhnl66lhGcPMdxzGOj2CHjczoyIdjiRGvQJLnLcR8wwdqqnzfpCYxHxTjJsnCx8x4GNY39gPu_xblh8K0ScLws7ei-5zsccvq5ZxgolW9xD3KUtaYoet460xO70Lv9h4aDAKahmETnMrS_Q7xEyeF22gxSa9vTBZ8X-wAQ-Q9PNkP4L3fpXLjf_Tug_WnXxShgI1jqV0VvaCiPE33wtXGGDxL_l0rR2RsrEPZnhV_hHsqFMJE6Z-KPUx8eaD2kGgKFeOWEQMI3wX_hsYWOEpgxdTBjqh9oHcGQurOAbSS7XoJid6YV017tzuj5mB7LKP_LjSzz-NfzOtlfkxHQVPlnRUJETC3zwOkWHxFJknxH_YXvDT2DMHCUJ7Oggn6PkVStkHGhsS-T42voMn0Kf-Vc";
        String[] tokenArray=token.split("\\.");
        for (String ss:tokenArray){
            System.out.println(new String(Base64.getDecoder().decode(ss)));
        }
    }
}
