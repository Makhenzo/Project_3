package junit;

import org.junit.Assert;
import org.junit.Test;
import project3.ImplementCases;

public class CamelCaseTest {



    ImplementCases sentences = new ImplementCases();

    @Test
    public void CamelTest()
    {

        String inputOne = "Hello World";
        String expectedOutputOne = "HelloWorld";


        String inputTwo = "I love java";
        String expectedOutputTwo = "ILoveJava";

        Assert.assertEquals(sentences.asCamelCase(inputOne),expectedOutputOne);
        Assert.assertEquals(sentences.asCamelCase(inputTwo),expectedOutputTwo);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Camel Case  Example");
        System.out.println("Input: " + inputOne );
        System.out.println("Output: " + expectedOutputOne);
        System.out.println(" ");

        System.out.println("Input: " + inputTwo );
        System.out.println("Output: " + expectedOutputTwo);
    }




}
