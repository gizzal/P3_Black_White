package analysis;

import org.junit.Rule;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.*;

public class ShapeClassifierBlackBoxSingleTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @org.junit.Before
    public void setUp() throws Exception {}

    @org.junit.After
    public void tearDown() throws Exception {}

    @org.junit.Test
    public void evaluateGuess1() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,1");
        assertEquals("No", result);
    }
   
    @org.junit.Test
    public void evaluateGuess2() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,1");
        assertEquals("No", result);
    }
    
    @org.junit.Test
    public void evaluateGuess3() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,1");
        assertEquals("No", result);
    }
    
    
    @org.junit.Test
    public void evaluateGuess4() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess5() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,1");
        assertEquals("No", result);
    }
   
    @org.junit.Test
    public void evaluateGuess6() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,1");
        assertEquals("No", result);
    }
    
    @org.junit.Test
    public void evaluateGuess7() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,1");
        assertEquals("No", result);
    }
    
    @org.junit.Test
    public void evaluateGuess8() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,No,100");
        assertEquals("No", result);
    }
    
    @org.junit.Test
    public void evaluateGuess9() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,1,1,1,1");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess10() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,25,25,25,25");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess11() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,26,26,26,26");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess12() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,1,1,26,4095");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess13() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,4095,4095,4095,4095");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess14() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,1,1,1,26");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess15() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,1,1,1,26");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess16() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,26,26,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess17() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
    
    @org.junit.Test
    public void evaluateGuess18() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,33,33,33");
        assertEquals("No", result);
    }
    
    @org.junit.Test
    public void evaluateGuess19() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,34,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess20() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,4095,4095,4095");
        assertEquals("Yes", result);
    }
    @org.junit.Test
    public void evaluateGuess21() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess22() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess23() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess24() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
}