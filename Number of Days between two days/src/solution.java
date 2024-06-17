import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class solution {

    public int daysBetweenDates (String date1, String date2){
        int year1;
        int year2;
        int month1;
        int month2;
        int days1;
        int days2;

        int result;

        year1 = Integer.parseInt(date1.substring(0,4));
        year2 = Integer.parseInt(date2.substring(0,4));

            month1 = Integer.parseInt(date1.substring(5,7));



            month2 = Integer.parseInt(date2.substring(5,7));



            days1 = Integer.parseInt(date1.substring(8,10));



            days2 = Integer.parseInt(date2.substring(8,10));


        LocalDate mydate1 = LocalDate.of(year1,month1,days1);
        LocalDate mydate2 = LocalDate.of(year2,month2,days2);

        result = Math.abs(Math.toIntExact(ChronoUnit.DAYS.between(mydate1,mydate2)));

        return result;
    }

    public static void main(String[] args) {
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";

        solution handler = new solution();
        System.out.println(handler.daysBetweenDates(date1,date2));
    }
}
