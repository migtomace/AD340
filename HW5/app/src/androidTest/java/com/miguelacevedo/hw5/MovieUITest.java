package com.miguelacevedo.hw5;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MovieUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testMoviePrice() {

        onView(withId(R.id.edit_text)).perform(typeText("1"));

        // Spinner
        onView(withId(R.id.spinner))
                .perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Title1")))
                .perform(click());

        // Radio
        onView(withId(R.id.rent))
                .perform(click());

        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.price)).check(matches(withText("Movie: Title1"
                + "\nPurchase Type: Rent"
                + "\nQuantity: 1"
                + "\nPrice: 4.99")));

    }
}