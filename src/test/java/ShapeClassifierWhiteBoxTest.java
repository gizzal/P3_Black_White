import static org.junit.Assert.*;

public class ShapeClassifierWhiteBoxTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void evaluateGuess1() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,220");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess2() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess(",Large,Yes,220");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess3() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,,Yes,220");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess4() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,,220");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess5() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,220");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess6() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,200,100");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess7() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,200,200");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess8() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess9() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,100,50,100,50");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess10() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,100,100,100,100");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess11() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,100,100,100,100,100");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess12() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,220");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess13() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,2");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess14() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,2");
        assertEquals("No", result);
    }

    @org.junit.Test
    public void evaluateGuess15() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,201");
        assertEquals("Yes", result);
    }

    @org.junit.Test
    public void evaluateGuess16_18() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result1 = sc.evaluateGuess("Line,Large,Yes,201");
        assertEquals("No", result1);

        String result2 = sc.evaluateGuess("Scalene,Large,Yes,100,100,100,100");
        assertEquals("No", result2);

        // I don't now how to check that the method is finishing with System.exit(1)
//        String result3 = sc.evaluateGuess("Scalene,Large,Yes,100,100,100,100");
//        assertEquals("0", result3);
    }

}