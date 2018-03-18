import static org.junit.Assert.*;

public class ShapeClassifierWhiteBoxTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void evaluateGuess() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertEquals("Yes", result);
    }

}