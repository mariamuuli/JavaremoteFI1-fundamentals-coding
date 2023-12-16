import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayDiff {

    private LocalDate nextClassDate;


    public DayDiff(String nextClassDateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter.withLocale(Locale.ENGLISH);

        LocalDate nextClassDate = LocalDate.parse(nextClassDateStr, formatter);

        Duration duration = Duration.between(LocalDate.now(), nextClassDate.atStartOfDay());

        System.out.printf("%NMy next SDA class will be in %d days", duration.toDays());

//DayDiff dayDiff = new DayDiff("2024-01-23");
    }
    }



