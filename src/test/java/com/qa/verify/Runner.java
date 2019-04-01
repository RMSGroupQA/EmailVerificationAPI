package com.qa.verify;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.verify.entity.BookingEntityTest;
import com.qa.verify.entity.EmployeeEntityTest;
import com.qa.verify.entity.RoomEntityTest;
import com.qa.verify.service.VerificationServiceTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BookingEntityTest.class,
   EmployeeEntityTest.class,
   RoomEntityTest.class,
   VerificationServiceTest.class
   
})

public class Runner {

}
