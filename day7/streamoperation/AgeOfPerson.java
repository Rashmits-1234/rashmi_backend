package streamoperation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPerson {
	public static void main (String[] args) {
		LocalDate birthDay = LocalDate.of(2000, 12, 20);
		LocalDate today = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthDay, today));
		
	}

}
