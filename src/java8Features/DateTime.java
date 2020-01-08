package java8Features;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
       // LocalDate d = LocalDate.now();
       // LocalDate d = LocalDate.of(2018, Month.MAY,12);
        LocalDate d = LocalDate.of(2018, Month.FEBRUARY,2);
        System.out.println(d);
        LocalTime l = LocalTime.now(ZoneId.of("Europe/Volgograd"));
        System.out.println(l);

        for(String s:ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
    }
}
