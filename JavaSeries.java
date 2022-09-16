package com.badal.puzzle;

import java.util.Scanner;

public class JavaSeries {
    public static void main(String[] args) {
        String CONSTANT_VALUE = "QEV111";
        String seriesValue = "QEV111AJQ4CK";
        System.out.println(seriesValue + ", ");
        Scanner sc = new Scanner(System.in);
        Character ch = 'Y';
        do {
            seriesValue = increamentdValue(CONSTANT_VALUE, seriesValue);
            System.out.println(seriesValue + ", ");
            System.out.println("Press N to quit and press any other key to continue.. ");
            ch = sc.next().charAt(0);
        } while (ch != 'N' && seriesValue != null);
    }

    public static String increamentdValue(String con, String series) {

        if (series.contains(con)) {
            String x = series.substring(con.length());
            char[] xry = x.toCharArray();
            char ch = '0';
            for (int i = xry.length - 1; i >= 0; i--) {
                ch = xry[i];
                if (ch > 64 && ch < 91) {
                    if (ch != 'Z') {
                        xry[i] = (char)(ch + 1);
                        break;
                    } else {
                        xry[i] = 'A';
                    }
                } else {
                    if (ch != '9') {
                        xry[i] = (char)(ch + 1);
                        break;
                    } else {
                        xry[i] = '0';
                    }
                }
            }
            series = con.concat(new String(xry));
            return series;
        }
        return null;
    }
}
