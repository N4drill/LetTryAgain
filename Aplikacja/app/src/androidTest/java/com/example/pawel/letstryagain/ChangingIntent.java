package com.example.pawel.letstryagain;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import com.example.pawel.letstryagain.Views.Application_Form_ReadyToPrint;
import com.example.pawel.letstryagain.Views.Application_List_Activity;
import com.example.pawel.letstryagain.Views.MainActivity;
import com.example.pawel.letstryagain.Views.Professors_Table_Activity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Paweł on 28.01.2018.
 */
@RunWith(AndroidJUnit4.class)
public class ChangingIntent {

    @Rule
    public ActivityTestRule<MainActivity> mActivity = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void changeForm() throws Exception {
        Intents.init();

        Espresso.onView(withId(R.id.Sprawy_button)).perform(click());

        intended(hasComponent(Application_List_Activity.class.getName()));

        Intents.release();
    }

    @Test
    public void changeProfessors() throws Exception {
        Intents.init();

        Espresso.onView(withId(R.id.Przegladaj_prowadzacych_button)).perform(click());

        intended(hasComponent(Professors_Table_Activity.class.getName()));

        Intents.release();
    }
}
