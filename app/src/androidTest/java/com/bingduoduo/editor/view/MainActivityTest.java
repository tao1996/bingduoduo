package com.bingduoduo.editor.view;

import android.os.SystemClock;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.termux.R;

import org.hamcrest.core.AllOf;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.swipeLeft;
import static androidx.test.espresso.action.ViewActions.swipeRight;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSwitch()
    {
        onView(withId(R.id.menu2)).check(matches(isDisplayed()));
//        onView(isRoot()).perform(swipeRight());
//        onView(withId(R.id.menu_helper)).check(matches(isDisplayed()));
//        onView(withId(android.R.id.home)).check(matches(isDisplayed()));
//        Espresso.pressBack();
        onView(withContentDescription(containsString("navigation drawer"))).check(matches(isDisplayed()));
        onView(withContentDescription(containsString("navigation drawer"))).perform(click());

        onView(withText(R.string.action_helper)).check(matches(isDisplayed()));
        onView(withText(R.string.action_helper)).perform(click());
//        SystemClock.sleep(3000);
//        onView(withId(R.id.menu_helper)).check(matches(isDisplayed()));
//        onView(withId(R.id.menu_helper)).perform(click());
//        Espresso.pressBack();
//        onView(isRoot()).perform(swipeLeft());
//        SystemClock.sleep(3000);
//        onView(withId(2131230898)).perform(longClick());
//        onView(withId(2131230898)).perform(click());
//        onView(withId(R.id.menu2)).perform(click());
//        onView(withId(R.id.menu2_fab_switch)).check(matches(isDisplayed()));
//
//        //        onView(withId(R.id.menu2_fab_switch)).perform(click());
////        onView(withId(R.id.menu2)).check(matches(isDisplayed()));
//
    }

    @Test
    public void testAbout()
    {
        onView(withContentDescription(containsString("navigation drawer"))).perform(click());
        onView(withText(R.string.about)).check(matches(isDisplayed()));
        onView(withText(R.string.about)).perform(click());
        Espresso.pressBack();
        Espresso.pressBack();
//        Espresso.pressBack();
    }

    @Test
    public void testFab()
    {
        onView(withId(R.id.fab_label)).check(matches(isDisplayed()));
        onView(withId(R.id.fab_label)).perform(click());
        onView(withId(R.id.menu_helper)).check(matches(isDisplayed()));
        onView(withId(R.id.menu2_fab_switch)).perform(click());

        SystemClock.sleep(3000);


    }
}
