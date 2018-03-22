package analysis;

import org.junit.Rule;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.*;

public class ShapeClassifierBlackBoxTripleTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @org.junit.Before
    public void setUp() throws Exception {}

    @org.junit.After
    public void tearDown() throws Exception {}


    @org.junit.Test
    public void evaluateGuess1() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,1,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess2() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,1,25,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess3() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,1,26,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess4() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,1,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess5() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,25,1,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess6() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,25,25,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess7() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,25,26,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess8() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,25,4095,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess9() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,26,1,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess10() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,26,25,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess11() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,26,26,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess12() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,26,4095,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess13() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,4095,1,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess14() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,4095,25,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess15() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,4095,26,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess16() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,4095,4095,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess17() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,1,1,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess18() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,1,25,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess19() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,1,26,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess20() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,1,4095,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess21() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,25,1,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess22() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,25,25,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess23() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,25,26,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess24() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,25,4095,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess25() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,26,1,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess26() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,26,25,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess27() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,26,26,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess28() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,26,4095,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess29() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,4095,1,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess30() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,4095,25,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess31() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,4095,26,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess32() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,4095,4095,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess33() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,1,1,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess34() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,1,25,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess35() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,1,26,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess36() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,1,4095,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess37() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,25,1,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess38() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,25,25,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess39() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,25,26,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess40() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,25,4095,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess41() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,26,1,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess42() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,26,25,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess43() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,26,26,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess44() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,26,4095,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess45() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,4095,1,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess46() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,4095,25,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess47() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,4095,26,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess48() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,4095,4095,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess49() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,1,1,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess50() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,1,25,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess51() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,1,26,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess52() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,1,4095,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess53() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,25,1,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess54() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,25,25,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess55() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,25,26,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess56() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,25,4095,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess57() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,26,1,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess58() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,26,25,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess59() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,26,26,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess60() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,26,4095,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess61() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,4095,1,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess62() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,4095,25,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess63() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,4095,26,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess64() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,4095,4095,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess65() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,1,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess66() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,1,25,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess67() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,No,1,26,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess68() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,1,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess69() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,25,1,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess70() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,No,25,25,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess71() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,25,26,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess72() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,25,4095,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess73() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,26,1,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess74() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,26,25,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess75() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,26,26,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess76() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,No,26,4095,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess77() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,4095,1,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess78() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,4095,25,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess79() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,4095,26,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess80() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,4095,4095,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess81() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,1,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess82() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,1,25,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess83() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,1,26,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess84() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,Yes,1,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess85() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,Yes,25,1,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess86() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,25,25,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess87() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,25,26,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess88() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,25,4095,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess89() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,26,1,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess90() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,26,25,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess91() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,Yes,26,26,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess92() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,26,4095,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess93() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,4095,1,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess94() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,4095,25,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess95() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,4095,26,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess96() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,4095,4095,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess97() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,1,1,1,1");
        assertEquals("Yes", result);
    }
    @org.junit.Test
    public void evaluateGuess98() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,1,25,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess99() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,1,26,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess100() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,1,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess101() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,25,1,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess102() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,25,25,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess103() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,25,26,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess104() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,25,4095,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess105() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,26,1,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess106() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,26,25,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess107() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,26,26,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess108() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,26,4095,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess109() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,4095,1,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess110() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,4095,25,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess111() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,4095,26,25,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess112() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,4095,4095,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess113() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,1,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess114() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,1,25,25,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess115() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,No,1,26,26,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess116() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,1,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess117() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,25,1,25,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess118() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,No,25,25,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess119() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,25,26,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess120() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,25,4095,26,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess121() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,26,1,26,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess122() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,26,25,4095,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess123() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,26,26,1,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess124() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,No,26,4095,25,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess125() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,4095,1,4095,25");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess126() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,4095,25,26,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess127() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,4095,26,4095,26");
        assertEquals("Yes", result);
    }
    @org.junit.Test
    public void evaluateGuess128() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,4095,4095,1,26");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess129() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess130() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,1");
        assertEquals("Yes", result);
    }
    @org.junit.Test
    public void evaluateGuess131() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess132() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess133() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess134() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess135() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess136() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess137() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess138() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess139() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess140() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess141() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess142() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess143() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess144() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess145() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess146() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess147() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess148() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess149() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess150() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess151() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess152() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess153() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess154() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess155() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess156() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess157() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess158() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess159() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess160() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess161() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess162() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess163() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess164() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess165() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess166() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess167() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess168() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess169() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess170() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess171() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess172() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess173() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess174() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess175() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess176() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess177() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess178() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess179() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess180() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess181() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess182() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess183() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess184() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess185() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess186() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess187() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess188() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess189() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess190() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess191() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess192() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,4095");
        assertEquals("No", result);
    }
}
