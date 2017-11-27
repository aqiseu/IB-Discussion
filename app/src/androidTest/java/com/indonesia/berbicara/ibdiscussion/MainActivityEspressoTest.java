package com.indonesia.berbicara.ibdiscussion;


import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import com.indonesia.berbicara.ibdiscussion.main.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

/**
 * Created by aqiseu on 11/26/2017.
 */

public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void verifySignUpButtonDisplayed() {
        onView(ViewMatchers.withId(R.id.sign_in_button)).check(matches(isDisplayed()));
    }
}
