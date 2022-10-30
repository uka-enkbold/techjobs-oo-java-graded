package org.launchcode.techjobs.oo.test;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.lang.model.element.Name;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        //check if two id's are different
        Job id1 = new Job("Data",
                new Employer("Kalal"),
                new Location("St.louis"),
                new PositionType("webdev"),
                new CoreCompetency("python"));
        Job id2 = new Job("Data",
                new Employer("Kalal"),
                new Location("St.louis"),
                new PositionType("webdev"),
                new CoreCompetency("python"));

        assertNotEquals(id1.getId(),id2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
    Job job1 = new Job ("Product tester",
                new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //finish with with all value

         assertEquals(job1.getName(), "Product " +
                 "tester");
//         assertTrue(job1.getName() instanceof job1);
//         assertTrue(job1.getEmployer() instanceof Employer);
         assertEquals(job1.getEmployer(),job1.getEmployer());
//         assertTrue (job1.getLocation() instanceof Location);
         assertEquals(job1.getLocation(), job1.getLocation());
//         assertTrue (job1.getPositionType() instanceof PositionType);
         assertEquals(job1.getPositionType(),job1.getPositionType());
//         assertTrue (job1.getCoreCompetency() instanceof CoreCompetency);
         assertEquals(job1.getCoreCompetency(),job1.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality(){
      Job number1 =  new Job ("Product " +
                "tester",
                new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job number2 =  new Job ("Product tester ",
               new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertFalse(number1.equals(number2));
    }

   @Test
    public void testToStringStartsAndEndsWithNewLine(){
       Job number1 =  new Job ("Product " +
               "tester",
               new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       String firstString = number1.toString();

       assertEquals(number1.toString().charAt(0),
               '\n');
       System.out.println(number1.toString().charAt(0));

       assertEquals(number1.toString().charAt(number1.toString().length() -1),'\n');

       System.out.println(firstString.charAt(firstString.length() -1));
   }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job number1 =  new Job ("Product " +
                "tester",
                new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String firstString = number1.toString();

        assertEquals(firstString,
                "\nID: " + number1.getId() + "\n"+
                         "Name: " + number1.getName() + "\n"+
                         "Employer: " + number1.getEmployer() + "\n"+
                         "Location: " + number1.getLocation() + "\n"+
                         "Position Type: " + number1.getPositionType() + "\n"+
                         "Core Competency: " + number1.getCoreCompetency() + "\n");
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job number1 = new Job ("",
                new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(
                        ""));

        String firstString = number1.toString();

        assertEquals(
                "\nID: " + number1.getId() +"\n"+
                        "Name: " + "Data not available\n"+
                        "Employer: " + "Data not available\n"+
                        "Location: " + "Data not available\n"+
                        "Position Type: " + "Data not available\n"+
                        "Core Competency: " + "Data not available\n",firstString);
    }
}
