package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

//import org.launchcode.techjobs.oo.Job;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3.getName() != null);
        assertEquals("Product tester", job3.getName());

        assertTrue(job3.getEmployer() != null);
        assertEquals("ACME", job3.getEmployer().getValue());

        assertTrue(job3.getLocation() != null);
        assertEquals("Desert", job3.getLocation().getValue());

        assertTrue(job3.getPositionType() != null);
        assertEquals("Quality control", job3.getPositionType().getValue());

        assertTrue(job3.getCoreCompetency() != null);
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Software engineer", new Employer("Epic Games"), new Location("Cary, NC"), new PositionType("Quality control"), new CoreCompetency("C#"));
        Job job5 = new Job("Software engineer", new Employer("Epic Games"), new Location("Cary, NC"), new PositionType("Quality control"), new CoreCompetency("C#"));
        assertFalse(job4 == job5);
    }





}
