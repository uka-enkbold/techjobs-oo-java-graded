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
         assertTrue (job1.getLocation() instanceof Location);
         assertEquals(job1.getName(), "Product " +
                "tester");
         assertTrue (job1.getLocation() instanceof Location);
         assertEquals(job1.getName(), "Product " +
                "tester");
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
                "\n ID: " + number1.getId() +
                        "\n" +
                         "\n Name: " + number1.getName() + "\n" +
                         "\n Employer: " + number1.getEmployer() + "\n" +
                         "\n Location: " + number1.getLocation() + "\n " +
                         "\n Position Type: " + number1.getPositionType() + "\n" +
                         "\n Core Competency: " + number1.getCoreCompetency() + "\n");
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job number1 = new Job (" ",
                new Employer(" "), new Location(" "), new PositionType(" "), new CoreCompetency(" "));

        String firstString = number1.toString();

        assertEquals(firstString,
                "\n ID: " + number1.getId() + "\n"+
                        "\n Name: " + "Data not available \n" );
//                        "\n Employer: " + "Data not available \n" +
//                        "\n Location: " + "Data not available \n" +
//                        "\n Position Type: " + "Data not available \n" +
//                        "\n Core Competency: " + "Data not available \n");
    }
}
