package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionParametersTest {

    private final String checkedSex;
    private final boolean expectedHasMane;

    public LionParametersTest(String checkedSex, boolean expectedHasMane) {
        this.checkedSex = checkedSex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(checkedSex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane, actualHasMane);
    }
}