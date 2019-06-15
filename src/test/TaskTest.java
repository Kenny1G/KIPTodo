package test;

import model.Task;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest
{
    private Task task1;

    @Before
    public void setUp()
    {
        task1 = new Task("PepePls");

    }

    @Test
    public void testGetters()
    {
        assertFalse(task1.getDone());
    }

    @Test
    public void testSetDone()
    {
        task1.setDone(false);
        assertFalse(task1.getDone());
    }
    @Test
    public void testSetLabel()
    {
        task1.setLabel("POGGERS");
        assertEquals("POGGERS",task1.getLabel());
    }
}
