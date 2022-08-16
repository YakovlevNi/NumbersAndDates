import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        LocalDate firstDate = LocalDate.now();
        LocalDate secondDate = LocalDate.of(1995, 5, 23);

        System.out.println(collectBirthdays(year, month, day));
        System.out.println(getPeriodFromBirthday(firstDate, secondDate));


    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE");

        String text = "";
        int number = 0;

        while (birthday.isBefore(today)) {
            text = number + " - " + formatter.format(birthday) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            number++;
            System.out.println(text);
        }
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        return "";
    }

    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {
        // firstDate = LocalDate.now();
        //secondDate = LocalDate.of(1995,5,23);

        Period period = Period.between(firstDate, secondDate);
        String difference = "years:" + period.getYears() + ", " + "months:" + period.getMonths() + ", " + "days:" + period.getDays();


        return difference;
    }

}
