package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT,TUNA,false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, CABBAGE,false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, DOG_FOOD, false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, SALMON, true);

        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, DELUXE_DOG_FOOD, true);

        Assert.assertEquals(DELUXE_DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, LETTUCE, true);

        Assert.assertEquals(LETTUCE, food);
    }

}
