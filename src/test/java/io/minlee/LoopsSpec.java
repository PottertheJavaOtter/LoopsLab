package io.minlee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by minlee on 5/3/16.
 */
public class LoopsSpec {

    Loops loops;

    @Before
    public void initialize(){
        loops = new Loops();
    }

    @Test
    public void oneToTenTest(){
        String expectedOutput = "*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        String actualOutput = loops.oneToTen();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void oddNumbersTest(){
        String expectedOutput = "*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        String actualOutput = loops.oddNumbers();
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void squares(){
        String expectedOutput = "*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";
        String actualOutput = loops.squares();
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void random4Test(){
        //Strips the 4 integer values out of the String output and check that each is within boundary 1 - 10
        String actualOutput = loops.random4();
        int indexStartOfNumber1 = actualOutput.indexOf("\n");
        int indexEndOfNumber1 = actualOutput.indexOf("\n", indexStartOfNumber1+1);
        int expectedOutput1 = Integer.parseInt(actualOutput.substring(indexStartOfNumber1+1,indexEndOfNumber1));
        int indexStartOfNumber2 = actualOutput.indexOf("\n", indexEndOfNumber1);
        int indexEndOfNumber2 = actualOutput.indexOf("\n", indexStartOfNumber2+1);
        int expectedOutput2 = Integer.parseInt(actualOutput.substring(indexStartOfNumber2+1,indexEndOfNumber2));
        int indexStartOfNumber3 = actualOutput.indexOf("\n", indexEndOfNumber2);
        int indexEndOfNumber3 = actualOutput.indexOf("\n", indexStartOfNumber3+1);
        int expectedOutput3 = Integer.parseInt(actualOutput.substring(indexStartOfNumber3+1,indexEndOfNumber3));
        int indexStartOfNumber4 = actualOutput.indexOf("\n", indexEndOfNumber3);
        int expectedOutput4 = Integer.parseInt(actualOutput.substring(indexStartOfNumber4+1,actualOutput.length()));
        assertTrue((expectedOutput1 > 0) && (expectedOutput1 <11));
        assertTrue((expectedOutput2 > 0) && (expectedOutput2 <11));
        assertTrue((expectedOutput3 > 0) && (expectedOutput3 <11));
        assertTrue((expectedOutput4 > 0) && (expectedOutput4 <11));
    }

    @Test
    public void evenTest(){
        String expectedOutput = "*** Output ***\n2\n4\n6\n8\n10\n12\n14\n16\n18";
        String actualOutput = loops.even(20);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void powersTest(){
        String expectedOutput = "*** Output ***\n2\n4\n8\n16\n32\n64\n128\n256";
        String actualOutput = loops.powers(8);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void areWeThereYetTest(){
        String expectedOutput = "Good!";
        String actualOutput = loops.areWeThereYet("Yes");
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void triangleTest(){
        String expectedOutput = "*** Output ***\n*\n**\n***\n****\n*****";
        String actualOutput = loops.triangle(5);
        assertEquals(expectedOutput,actualOutput);
    }

   @Test
    public void tableSquareTest(){
        String expectedOutput = "*** Output ***\nA 4 x 4 table square\n| 1 | 2 |  3 |  4 |\n| 2 | 4 |  6 |  8 |\n| 3 | 6 |  9 | 12 |\n| 4 | 8 | 12 | 16 |";
        String actualOutput = loops.tableSquare(4);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void digitsPerColumnTest(){
        int[] expectedOutput = {1 , 2 , 2 , 2, 2 , 2};
        int[] actualOutput = loops.digitsPerColumn(6);
        assertArrayEquals(expectedOutput,actualOutput);
    }
    @Test
    public void digitsOfSingleNumberTest(){
        int expectedOutput = 8;
        int actualOutput = loops.digitsOfSingleNumber(12345678);
        assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void timesTableCreatorTest(){
        int[][] expectedOutput = {{1,2,3,4,5,6},
                                  {2,4,6,8,10,12},
                                  {3,6,9,12,15,18},
                                  {4,8,12,16,20,24},
                                  {5, 10, 15, 20, 25, 30},
                                  {6,12,18,24,30,36}};
        int[][] actualOutput = loops.timesTableCreator(6);
        assertArrayEquals(expectedOutput,actualOutput);
    }

}
