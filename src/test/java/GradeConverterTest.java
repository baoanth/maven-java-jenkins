import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class GradeConverterTest {
    private GradeConverter gradeConverter;

    @Before
    public void setUp() throws Exception {
        gradeConverter = new GradeConverter();
    }

    @Test
    public void testConvert1() throws Exception {
        String expected = "A";
        String actual = gradeConverter.convert(100);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert2() throws Exception {
        String expected = "A";
        String actual = gradeConverter.convert(90);
        assertEquals(expected,actual);

    }

    @Test
    public void testConvert3() throws Exception {
        String expected = "B";
        String actual = gradeConverter.convert(80);
        assertEquals(expected,actual);

    }
}
