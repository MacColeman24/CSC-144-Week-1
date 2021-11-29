/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package weekone;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class Vector3Test {
    
    public Vector3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getX method, of class Vector3.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Vector3 instance = new Vector3();
        double expResult = 0.0;
        double result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Vector3.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Vector3 instance = new Vector3();
        double expResult = 0.0;
        double result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZ method, of class Vector3.
     */
    @Test
    public void testGetZ() {
        System.out.println("getZ");
        Vector3 instance = new Vector3();
        double expResult = 0.0;
        double result = instance.getZ();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Vector3.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        double newX = 0.0;
        Vector3 instance = new Vector3();
        instance.setX(newX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Vector3.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        double newY = 0.0;
        Vector3 instance = new Vector3();
        instance.setY(newY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZ method, of class Vector3.
     */
    @Test
    public void testSetZ() {
        System.out.println("setZ");
        double newZ = 0.0;
        Vector3 instance = new Vector3();
        instance.setZ(newZ);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of magnitude method, of class Vector3.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector3 instance = new Vector3();
        double expResult = 0.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unit method, of class Vector3.
     */
    @Test
    public void testUnit() {
        System.out.println("unit");
        Vector3 instance = new Vector3();
        Vector3 expResult = null;
        Vector3 result = instance.unit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Vector3.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3 a = null;
        Vector3 instance = new Vector3();
        Vector3 expResult = null;
        Vector3 result = instance.add(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Vector3.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 0.0;
        Vector3 instance = new Vector3();
        Vector3 expResult = null;
        Vector3 result = instance.multiply(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dotProduct method, of class Vector3.
     */
    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3 a = null;
        Vector3 b = null;
        double expResult = 0.0;
        double result = Vector3.dotProduct(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crossProduct method, of class Vector3.
     */
    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3 a = null;
        Vector3 b = null;
        Vector3 expResult = null;
        Vector3 result = Vector3.crossProduct(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vector3.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3 instance = new Vector3();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
