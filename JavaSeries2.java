public static void main(String[] args) {
        String CONSTANT_VALUE = "QEV111";
        String seriesValue = "QEV111AAAAAA";
        Scanner sc = new Scanner(System.in);



       char ch = 'Y';



       do {
            int i = 100;
            int j = 1;
            System.out.println("current entry " + seriesValue + "\n");
            System.out.println("100 entries will be generated \n ");
            do {
                seriesValue = increamentdValue(CONSTANT_VALUE, seriesValue);
                j++;
                System.out.println(seriesValue + "");
            } while (j <= i);
            System.out.println("Continue ?");
            ch = sc.next().charAt(0);
        } while (ch != 'N');
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
                        xry[i] = (char) (ch + 1);
                        break;
                    } else {
                        xry[i] = '0';
                        break;
                    }
                } else {
                    if (ch != '9') {
                        xry[i] = (char) (ch + 1);
                        break;
                    } else {
                        xry[i] = 'A';
                    }
                }
            }
            series = con.concat(new String(xry));
            return series;
        }
        return null;
    }
