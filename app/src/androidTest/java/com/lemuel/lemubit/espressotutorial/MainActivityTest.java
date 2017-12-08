package com.lemuel.lemubit.espressotutorial;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TestEditTextA()
    {
        String msg="123456";

        //write text
        onView(withId(R.id.textA)).perform(typeText(msg));

        //check if written
        onView(withId(R.id.copyBtn)).perform(click());

        //verify that second EditText view displays desired text
        onView(withId(R.id.textB)).check(matches(withText(msg)));
    }
}
