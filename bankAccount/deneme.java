package bankAccount;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class deneme {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate DOBDate= LocalDate.of(2018,07,07);
        Period fark = Period.between(DOBDate,today);
        if (fark.getYears()>=18)
            System.out.println( "You can get a credit card");
        else
            System.out.println( "You should be at least 18 years old to get a credit card.") ;
    }
}
