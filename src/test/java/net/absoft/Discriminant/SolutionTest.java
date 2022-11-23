package net.absoft.Discriminant;

import net.absoft.discriminant.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {
    @Test
    public void TestThatSolutionContainsDifferentValuesIfDiscriminantIsBigger0(){
        Solution discriminant = new Solution(1,5,2);
        Assert.assertNotNull(discriminant.getX1());
        Assert.assertNotNull(discriminant.getX2());
        Assert.assertNotEquals(discriminant.getX1(),discriminant.getX2(),"Discriminant shouldn't be equal to 0");
    }
    @Test
    public void TestThatSolutionContainsSameValuesIfDiscriminantIs0(){
        Solution discriminant = new Solution(1,4,4);
        Assert.assertNotNull(discriminant.getX1());
        Assert.assertNotNull(discriminant.getX2());
        Assert.assertEquals(discriminant.getX1(),discriminant.getX2(),"Discriminant is not equal to 0!");
    }
    @Test
    public void TestThatSolutionDoesNotExistIfDiscriminantIsLessThan0(){
        Solution discriminant = new Solution(1,1,4);
        Assert.assertNull(discriminant.getX1(),"Discriminant should be bigger or equal to 0");
        Assert.assertNull(discriminant.getX2(), "Discriminant should be bigger or equal to 0");
    }
    @Test
    public void TestThatEquasionIsQuadratic(){
        Solution discriminant = new Solution(0,2,2);
        Assert.assertNull(discriminant.getX1(),"a cannot be equal to 0!");
        Assert.assertNull(discriminant.getX2(),"a cannot be equal to 0!");
    }

}
