package net.absoft;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class SolutionTest {
    private Solution discriminant;

    @BeforeMethod
    public void setUp(){
       discriminant = new Solution();
       System.out.println("new test");
        }


    @Test
    public void TestThatSolutionContainsDifferentValuesIfDiscriminantIsBigger0(){
        Map<String, Double> test = discriminant.solution(1,5,2);
        Assert.assertNotNull(test);
        Assert.assertEquals(2,test.size());
        Assert.assertNotEquals(test.get("x1"),test.get("x2"),"Discriminant shouldn't be equal to 0");
    }
    @Test
    public void TestThatSolutionContainsSameValuesIfDiscriminantIs0(){
        Map<String, Double> test = discriminant.solution(1,4,4);
        Assert.assertEquals(test.get("x1"),test.get("x2"),"Discriminant is not equal to 0!");
    }
    @Test
    public void TestThatSolutionDoesNotExistIfDiscriminantIsLessThan0(){
        Map<String, Double> test = discriminant.solution(1,1,4);
        Assert.assertNull(test,"Discriminant should be bigger or equal to 0");
    }
    @Test (
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "a cannot be 0!"
    )
    public void TestThatEquationIsQuadratic() throws IllegalArgumentException{
        Map<String, Double> test = discriminant.solution(0,2,2);
        Assert.assertNull(test,"a cannot be equal to 0!");
    }

}
