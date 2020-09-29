package util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringUtilTest {

    @Test
    public void mustBeAbleToCreateInstance() {
        //Arrange, Act
        StringUtil stringUtil = new StringUtil();
        //Assert
        assertNotNull(stringUtil);
    }

    @Test
    public void mustBeAbleToReverseString() {
        //Arrange
        StringUtil stringUtil = new StringUtil();
        String  test = "reverseTest";

        //Act
        test = stringUtil.reverseString(test);

        //Assert
        assertEquals("tseTesrever",test);
    }

    @Test
    public void mustReturnEmptyStringEmpty() {
        //Arrange
        StringUtil stringUtil = new StringUtil();
        String  test = "";

        //Act
        test = stringUtil.toUpperCase(test);

        //Assert
        assertEquals("", test);
    }

    @Test
    public void mustBeAbleToConverStringToUpperCase() {
        //Arrange
        StringUtil stringUtil = new StringUtil();
        String  test = "upperTest";

        //Act
        test = stringUtil.toUpperCase(test);

        //Assert
        assertEquals("UPPERTEST",test);
    }

    @Test
    public void mustBeAbleRunReverseStringWithoutInstance() {

        String  test = "reverseTest";

        //Act
        test = StringUtil.reverseString(test);

        //Assert
        assertEquals("tseTesrever",test);
    }

    @Test
    public void mustBeAbleRunUpperCaseWithoutInstance() {

        String  test = "upperTest";

        //Act
        test = StringUtil.toUpperCase(test);

        //Assert
        assertEquals("UPPERTEST",test);
    }

    @Test
    public void mustBeAbleToConverStringToLowerCase() {
        //Arrange
        StringUtil stringUtil = new StringUtil();
        String  test = "LOWERtEST";

        //Act
        test = stringUtil.toLowerCase(test);

        //Assert
        assertEquals("lowertest",test);
    }
    @Test
    public void mustBeAbleRunLowerCaseWithoutInstance() {

        String  test = "LOWERtEST";

        //Act
        test = StringUtil.toLowerCase(test);

        //Assert
        assertEquals("lowertest",test);
    }

}
