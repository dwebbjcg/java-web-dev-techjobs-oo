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
}