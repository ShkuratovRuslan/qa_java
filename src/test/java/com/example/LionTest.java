package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private final String checkedSex;
    private final boolean expectedHasMane;

    public LionTest(String checkedSex, boolean expectedHasMane) {
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

    @Test
    public void getKittensLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int expected = 1;
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}