package junit;

import org.junit.Assert;
import org.junit.Test;
import project3.ImplementCases;

public class HumanReadableTest {



    ImplementCases sentences = new ImplementCases();

    @Test
    public void HumanTest()
    {

        String inputOne = "hello_world";
        String expectedOutputOne = "Hello world";


        String inputTwo = "i LOVE java";
        String expectedOutputTwo = "I love java";

        Assert.assertEquals(sentences.asHumanReadableText(inputOne),expectedOutputOne);
        Assert.assertEquals(sentences.asHumanReadableText(inputTwo),expectedOutputTwo);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Human readable  Example");
        System.out.println("Input: " + inputOne );
        System.out.println("Output: " + expectedOutputOne);
        System.out.println(" ");

        System.out.println("Input: " + inputTwo );
        System.out.println("Output: " + expectedOutputTwo);


    }




}
