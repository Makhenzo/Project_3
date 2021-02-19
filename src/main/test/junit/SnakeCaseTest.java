package junit;

import org.junit.Assert;
import org.junit.Test;
import project3.ImplementCases;


public class SnakeCaseTest
{

//    @Autowired
     ImplementCases sentences = new ImplementCases();

    @Test
    public void SnakeTest()
    {

        String inputOne = "Hello World";
        String expectedOutputOne = "hello_world";


        String inputTwo = "I love java";
        String expectedOutputTwo = "i_love_java";

        Assert.assertEquals(sentences.asSnakeCase(inputOne),expectedOutputOne);
        Assert.assertEquals(sentences.asSnakeCase(inputTwo),expectedOutputTwo);



        System.out.println(" ");
        System.out.println("Snake Case  Example");
        System.out.println("Input: " + inputOne );
        System.out.println("Output: " + expectedOutputOne);
        System.out.println(" ");

        System.out.println("Input: " + inputTwo );
        System.out.println("Output: " + expectedOutputTwo);
    }
}
