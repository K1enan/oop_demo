package oop_exercises.java_time_exc;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaTimeExc {

    public static void main(String[] args) {

       /* System.out.println("Java Time Exercises\n");
        System.out.println("Exercise NO 1:");
        ex1();
        System.out.println("____________\n");
        System.out.println("Exercise NO 2:");
        ex2();
        System.out.println("____________\n");
        System.out.println("Exercise NO 3:");
        ex3();
        System.out.println("____________\n");
        System.out.println("Exercise NO 4:");
        ex4();
        System.out.println("____________\n");
        System.out.println("Exercise NO 5:");
        ex5();
        System.out.println("____________\n");
        System.out.println("Exercise NO 6:");
        ex6();
        System.out.println("____________\n");
        System.out.println("Exercise NO 7:");
        ex7();
        System.out.println("____________\n");
        System.out.println("Exercise NO 8:");
        ex8();
        System.out.println("____________\n");
        System.out.println("Exercise NO 9:");
        ex9();
        System.out.println("____________\n");
        System.out.println("Exercise NO 10:");
        ex10();
        System.out.println("____________\n");
        System.out.println("Exercise NO 11:");
        ex11();
        System.out.println("____________\n");
        System.out.println("Exercise NO 12:");
        ex12();
        System.out.println("____________\n");
        System.out.println("Exercise NO 13:");
        ex13();
        System.out.println("____________\n");
        System.out.println("Exercise NO 14:");
        ex14();
        System.out.println("____________\n");
        System.out.println("Exercise NO 15:");
        ex15();
        System.out.println("____________\n");
        System.out.println("Exercise NO 16:");
        ex16();

        calender();

        */


    }


    public static void ex1() {

        LocalDate today = LocalDate.now();
        System.out.println(today);
    }

    public static void ex2() {

        LocalDate date = LocalDate.now();
        String custom = date.format(DateTimeFormatter.ofPattern("eeee dd MMMM "));
        System.out.println(custom);
    }

    public static void ex3() {

        LocalDate startDay = LocalDate.now().with(DayOfWeek.MONDAY);
        LocalDate endDate = LocalDate.now().plusDays(1);
        for (LocalDate date = startDay; date.isBefore(endDate); date = date.plusDays(1))
            System.out.println(date);

    }

    public static void ex4() {

        LocalDate date = LocalDate.parse("2020-11-11");
        String strDate = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(strDate);

    }

    public static void ex5() {

        LocalDate dayOfWeek = LocalDate.parse("1945-05-08");
        System.out.println(dayOfWeek.getDayOfWeek());
    }

    public static void ex6() {

        LocalDate currentDate = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println(currentDate.getMonth());
    }

    public static void ex7() {

        LocalDate myBirthDate = LocalDate.parse("1983-01-01");
        LocalDate currentDate = LocalDate.now().plusYears(10).minusMonths(10);// LocalDate from ex6
        // LocalDate dayOfWeek = LocalDate.parse("1945-05-08"); //LocalDate from ex5
        Period period = Period.between(myBirthDate, currentDate);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days.");
    }

    public static void ex8() {

        Period period = Period.of(4, 7, 29);
        LocalDate date = LocalDate.now().plus(period);
        System.out.println(date);
    }

    public static void ex9() {

        LocalTime time = LocalTime.now();
        System.out.println(time.truncatedTo(ChronoUnit.SECONDS));
    }

    public static void ex10() {

        LocalTime time = LocalTime.now();
        System.out.println(time.getNano());
    }

    public static void ex11() {

        LocalTime time = LocalTime.parse("15:30:55");
        String strTime = time.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(strTime);

    }

    public static void ex12() {

        LocalTime currentTime = LocalTime.now();
        currentTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(currentTime.truncatedTo(ChronoUnit.SECONDS));
    }

    public static void ex13() {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time.truncatedTo(ChronoUnit.MINUTES));
        System.out.println("Date: " + dateTime.toLocalDate() + ", Time: " + dateTime.toLocalTime());
    }

    public static void ex14() {

        LocalDateTime dateTime = LocalDateTime.now();
        // String strTime = time.format(DateTimeFormatter.ofPattern("EEEE dd MMMM HH:mm"));
        String strTime = dateTime.format(DateTimeFormatter.ofPattern("EEEE dd MMMM HH:mm", new Locale("SV")));
        System.out.println(strTime);

    }

    public static void ex15() {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
    }

    public static void ex16() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
    }

    public static void calender(){

        int Y = 2018;    // year
        int startDayOfMonth = 5;
        int spaces = startDayOfMonth;

        // startDayOfMonth

        // months[i] = name of month i
        String[] months = {
                "",                               // leave empty so that we start with months[1] = "January"
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        // days[i] = number of days in month i
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int M = 1; M <= 12; M++) {

            // check for leap year
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;


            // print calendar header
            // Display the month and year
            System.out.println("          "+ months[M] + " " + Y);

            // Display the lines
            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

            // spaces required
            spaces = (days[M-1] + spaces)%7;

            // print the calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            }

            System.out.println();
        }
    }


}
