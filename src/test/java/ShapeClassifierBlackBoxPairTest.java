package analysis;

import org.junit.Rule;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.*;

public class ShapeClassifierBlackBoxPairTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void evaluateGuess1() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Line,Small,No,1,25,25,25");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess2() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Line,Large,Yes,25,26,26,26");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess3() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Line,Small,Yes,26,4095,4095,4095");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess4() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Line,Large,No,4095,1,1,1");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess5() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Circle,Small,Yes,1,26,4095,1");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess6() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Circle,Large,No,25,4095,1,25");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess7() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Circle,Small,Yes,26,1,25,26");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess8() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Circle,Large,No,4095,25,26,4095");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess9() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Ellipse,Small,Yes,1,4095,26,1");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess10() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Ellipse,Large,No,25,1,4095,25");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess11() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Ellipse,Small,Yes,26,25,1,26");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess12() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Ellipse,Large,No,4095,26,25,4095");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess13() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Equilateral,Large,Yes,1,1,26,4095");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess14() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Equilateral,Small,No,25,25,4095,1");
assertEquals("No",result);
    }

    @org.junit.Test
    public void evaluateGuess15() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Equilateral,Large,Yes,26,26,1,25");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess16() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Equilateral,Small,No,4095,4095,25,26");
assertEquals("No",result);
    }
	@org.junit.Test
    public void evaluateGuess17() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Isosceles,Large,Yes,1,1,1,4095");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess18() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Isosceles,Small,No,25,25,25,1");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess19() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Isosceles,Small,No,26,26,26,25");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess20() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Isosceles,Small,Yes,4095,4095,4095,26");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess21() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Scalene,Large,No,1,1,1,26");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess22() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Scalene,Small,Yes,25,25,25,4095");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess23() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Scalene,Large,No,26,26,26,1");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess24() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Scalene,Small,Yes,4095,4095,4095,25");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess25() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Square,Large,No,1,1,1,26");
assertEquals("No",result);
    }
	
	@org.junit.Test
    public void evaluateGuess26() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Square,Small,Yes,25,25,25,4095");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess27() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Square,Small,Yes,26,26,26,1");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess28() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Square,Small,No,4095,4095,4095,25");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess29() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Rectangle,Large,No,1,1,1,26");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess30() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Rectangle,Small,Yes,25,25,25,4095");
assertEquals("No",result);
    }

	@org.junit.Test
    public void evaluateGuess31() throws Exception {
ShapeClassifier sc = new ShapeClassifier();
String result = sc.evaluateGuess("Rectangle,Large,Yes,26,26,26,1");
assertEquals("No",result);
    }
	@org.junit.Test
    public void evaluateGuess32() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,1,33,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess33() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,33,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess34() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,34,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess35() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,4095,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess36() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,1,34,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess37() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,33,4095,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess38() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,34,1,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess39() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,4095,33,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess40() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,1,4095,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess41() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,33,1,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess42() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,Yes,34,33,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess43() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,4095,34,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess44() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,1,1,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess45() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,No,33,33,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess46() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,Yes,34,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess47() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,4095,4095,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess48() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess49() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,33,33,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess50() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,34,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess51() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess52() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess53() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,33,33,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess54() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,34,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess55() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,Yes,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess56() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess57() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,33,33,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess58() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,34,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess59() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,No,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess60() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,1,1,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess61() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,No,33,33,33");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess62() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,34,34,34");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess63() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,4095,4095,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess64() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,No,1");
        assertEquals("Yes", result);
    }
    @org.junit.Test
    public void evaluateGuess65() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess66() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Small,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess67() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Line,Large,No,4095");
        assertEquals("Yes", result);
    }
    @org.junit.Test
    public void evaluateGuess68() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,Yes,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess69() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,No,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess70() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Large,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess71() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Circle,Small,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess72() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess73() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess74() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess75() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Ellipse,Large,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess76() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess77() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess78() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess79() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Equilateral,Small,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess80() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess81() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess82() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Small,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess83() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Isosceles,Large,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess84() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess85() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess86() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Large,No,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess87() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Scalene,Small,No,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess88() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess89() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess90() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess91() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Square,Small,Yes,4095");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess92() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,No,1");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess93() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Small,Yes,100");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess94() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,101");
        assertEquals("No", result);
    }
    @org.junit.Test
    public void evaluateGuess95() throws Exception {
        ShapeClassifier sc = new ShapeClassifier();
        String result = sc.evaluateGuess("Rectangle,Large,Yes,4095");
        assertEquals("No", result);
    }

}