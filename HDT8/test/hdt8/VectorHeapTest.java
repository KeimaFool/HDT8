/*
HDT8
Sang Woo Shin Ji 15372
Diego Ricardo Valdez 15397
24/10/2016
 */
package hdt8;

import java.io.File;
import java.util.PriorityQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shin
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getQueue method, of class VectorHeap.
     */
    @Test
    public void testGetQueue() {
        System.out.println("getQueue");
        VectorHeap instance = new VectorHeap();
        PriorityQueue expResult = new PriorityQueue<Nodo>(new HeapComparator());
        instance.setQueue(expResult);
        PriorityQueue result = instance.getQueue();
        assertEquals(expResult, result);
    }

    /**
     * Test of addQueue method, of class VectorHeap.
     */
    @Test
    public void testAddQueue() {
        System.out.println("addQueue");
        Nodo paci = new Nodo("","","");
        VectorHeap instance = new VectorHeap();
        instance.addQueue(paci);
        assertEquals(paci, paci);
    }

    
}
