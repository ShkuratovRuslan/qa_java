package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> expected  = List.of("Трава", "Различные растения");
        Assert.assertEquals(expected ,animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodPredator() throws Exception {
        Animal animal = new Animal();
        List<String> expected  = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected ,animal.getFood("Хищник"));
    }

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String expected  = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected ,animal.getFamily());
    }
}