package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJob;
    Job testJob2;

    @Before
    public void createJobObject() {
        testJob = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testExpected() {
        assertTrue(2, testJob2.getId());
    }

    @Test
    public void testJob2IsNextId() {
        assertTrue(2, testJob2.getId());
    }

    private void assertTrue(int i, int id) {
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob3.getName() instanceof String);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void testJobsForEquality() {
        Job testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertNotEquals(testJob2, testJob3);
    }

    @Test
    public void toStringPrintsBlankLines() {
        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
       assertEquals("" + testJob2 + "", testJob2.toString());
    }

    @Test
    public void toStringPrintsLabelsOnNewLines() {
        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("\n" + "id=" + testJob2.getId() + "\n" +
                "name=" + testJob2.getName() + "\n" +
                "employer=" + testJob2.getEmployer() + "\n" +
                "location=" + testJob2.getLocation() + "\n" +
                "position type=" + testJob2.getPositionType() + "\n" +
                "core competency=" + testJob2.getCoreCompetency() + "\n", testJob2.toString());    }

    @Test
    public void toStringPrintsErrorWhenNoData() {
        testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType(""),
                new CoreCompetency("Persistence"));
        assertEquals("\n" + "id=" + testJob2.getId() + "\n" +
               "name=" + testJob2.getName() + "\n" +
                "employer=" + testJob2.getEmployer() + "\n" +
                "location=" + testJob2.getLocation() + "\n" +
                "position type=" + testJob2.getPositionType() + "\n" +
                "core competency=" + testJob2.getCoreCompetency() + "\n", testJob2.toString());
    }
}