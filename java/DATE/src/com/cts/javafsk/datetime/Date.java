package com.cts.javafsk.datetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = localDate.atTime(LocalTime.now());

		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTimePro = localTime.atDate(localDate);


		LocalDate localDatePro =  localDateTime.toLocalDate();
		LocalTime localTimePro = localDateTime.toLocalTime();


	}

}
