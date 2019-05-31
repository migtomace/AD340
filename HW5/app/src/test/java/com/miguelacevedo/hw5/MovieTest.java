package com.miguelacevedo.hw5;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MovieTest {

    Movie movie;
    Movie defaultMovie;

    Context context;

    @Before
    public void setUp(){
        this.movie = new Movie("Title1", "Rent");
        context = RuntimeEnvironment.application.getApplicationContext();
        this.defaultMovie = new Movie(context);
    }

    @Test
    public void price() {
        float moviePrice = movie.price(1);
        assertThat(moviePrice, is(4.99f));

        float moviePrice2 = movie.price(2);
        assertThat(moviePrice2, is(not(4.99f)));

    }

    @Test
    public void defaultPriceTest(){
        float defaultMovie_price = defaultMovie.price(1);
        assertThat(defaultMovie_price, is(19.99f));

        float defaultMovie_price2 = defaultMovie.price(1);
        assertThat(defaultMovie_price2, is(not(4.99f)));
    }

}