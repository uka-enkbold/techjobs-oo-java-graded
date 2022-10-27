package org.launchcode.techjobs.oo.test;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        //check if two id's are different
        Job id1 = new Job();
        System.out.println(id1);
        Job id2 = new Job();
        System.out.println(id2);
        assertNotEquals(id1,id2);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
//        new Job ("Product tester",
//                new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//         assertEquals("Product tester" instanceof Job.equals(name);
//         assertEquals("ACME","ACME");
//         assertEquals("Desert","Desert");
    }

    @Test
    public void testJobsForEquality(){
       Job number1 =  new Job ("Product tester",
                new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job number2 =  new Job ("Product tester ",
               new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertFalse(number1.equals(number2));
    }
   @Test
    public void testToStringStartsAndEndsWithNewLine(){
//       assertEquals();
   }


}
