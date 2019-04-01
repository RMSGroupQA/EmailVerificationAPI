package com.qa.verify.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.verify.object.Booking;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingEntityTest {

	Booking testBook = new Booking();

	@Test
	public void startTimeTest() {
		testBook.setStartTime("a");
		assertEquals("a", testBook.getStartTime());
	}

	@Test
	public void endTimeTest() {
		testBook.setEndTime("a");
		assertEquals("a", testBook.getEndTime());
	}

	@Test
	public void peopleTest() {
		testBook.setNumberOfPeople(1);
		assertEquals(1, testBook.getNumberOfPeople());
	}

	@Test
	public void descriptionTest() {
		testBook.setDescription("a");
		assertEquals("a", testBook.getDescription());
	}

	@Test
	public void titleTest() {
		testBook.setTitle("a");
		assertEquals("a", testBook.getTitle());
	}
	
	@Test
	public void stringTest() {
		assertEquals("Booking [bookingID=0, startTime=null, endTime=null, numberOfPeople=1, title=null, description=null]",
				testBook.toString());
	}

}
