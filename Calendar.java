public class Calendar {

    public static String getMonth(int m) {

        String month_name;

        switch(m) {
            case 1: month_name = "January"; break;
            case 2: month_name = "February"; break;
            case 3: month_name = "Mart"; break;
            case 4: month_name = "April"; break;
            case 5: month_name = "May"; break;
            case 6: month_name = "June"; break;
            case 7: month_name = "July"; break;
            case 8: month_name = "August"; break;
            case 9: month_name = "September"; break;
            case 10: month_name = "October"; break;
            case 11: month_name = "November"; break;
            case 12: month_name = "December"; break;

            default: month_name = "none"; break;
        }

        return month_name;
    }

    public static boolean getLeapYear(int y) {

        boolean isLeap = true;

        isLeap = (y % 4 == 0);
        isLeap = isLeap && (y % 100 != 0);
        isLeap = isLeap || (y % 400 == 0);

        return isLeap;
    }

    public static void getCalendar(int m, int y) {

        String month = getMonth(m);
        boolean leap = getLeapYear(y);

        System.out.println(" " + month + " " + y);

        System.out.println(" S " + " M " + " Tu " + " W " + "  Th " + " F " + "  S");

        int i = 0;

        // Line #1
        System.out.print(" ");
        while(i <= 2) {
            i++;
            System.out.print(i+"  ");
        }
        while(i <= 6) {
            i++;
            System.out.print(" "+i+"  ");
        }
        System.out.println();

        // Line #2
        System.out.print(" ");
        while(i <= 13) {
            i++;
            System.out.print(i+"  ");
        }
        System.out.println();
        while(i <= 15) {
            i++;
            System.out.print(i+" ");
        }

        // Line #3
        while(i <= 20) {
            i++;
            System.out.print(" "+i+" ");
        }
        System.out.println();

        // Line #4
        // Leap year:
        if(leap == false && month == "February") {
            while(i <= 22){
                i++;
                System.out.print(i+" ");
            }
            while(i <= 27){
                i++;
                System.out.print(i+" ");
            }
            System.out.println();
        }else if(leap == true && month == "February") {
            while(i <= 22){
                i++;
                System.out.print(i+" ");
            }
            while(i <= 28){
                i++;
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }

        // Under then 30: April, June, September, November
        // Line #4 & #5
        if(m == 4 || m == 6 || m == 9 || m == 11) {
            while(i <= 22){
                i++;
                System.out.print(i+" ");
            }
            while(i <= 27){
                i++;
                System.out.print(" "+i+" ");
            }
            System.out.println();
            while(i <= 29){
                i++;
                System.out.print(i+" ");
            }
            System.out.println();
        } else if(m != 2) {
            while(i <= 22){
                i++;
                System.out.print(i+" ");
            }
            while(i <= 27){
                i++;
                System.out.print(" "+i+" ");
            }
            System.out.println();
            while(i <= 29){
                i++;
                System.out.print(i+" ");
            }
            while(i <= 30){
                i++;
                System.out.print(" "+i);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);      // month
        int y = Integer.parseInt(args[1]);      // year

        getCalendar(m,y);

    }

}
