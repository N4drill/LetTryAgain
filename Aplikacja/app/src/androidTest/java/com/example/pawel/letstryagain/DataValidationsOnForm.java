package com.example.pawel.letstryagain;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.pawel.letstryagain.Views.Application_Form_Activity;
import com.example.pawel.letstryagain.Views.Application_Form_ReadyToPrint;

import org.hamcrest.text.IsEmptyString;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasShortClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtras;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;


/**
 * Created by Paweł on 28.01.2018.
 */
@RunWith(AndroidJUnit4.class)
public class DataValidationsOnForm {

    private static final String IMIE = "Marek";
    private static final String NAZWISKO = "Antont";
    private static final String BUDYNEK = "B4";
    private static final String SALA = "22";

    @Rule
    public ActivityTestRule<Application_Form_Activity> mActivity =
            new ActivityTestRule<Application_Form_Activity>(Application_Form_Activity.class);

    @Test
    public void completeForm() throws Exception {

        Intents.init();
        //Wszystkie pola formularza zostały wypełnione

        Espresso.onView(withId(R.id.Imie_Form_Text)).perform(typeText(IMIE));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Nazwisko_Form_Text)).perform(typeText(NAZWISKO));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Budynek_Form_Text)).perform(typeText(BUDYNEK));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Sala_Form_Text)).perform(typeText(SALA));

        Espresso.closeSoftKeyboard();


        Espresso.onView(withId(R.id.Next_Form_Button)).perform(click());


        intended(hasComponent(Application_Form_ReadyToPrint.class.getName()));

        Intents.release();
    }


    @Test
    public void noNameForm() throws Exception {

        Intents.init();
        //Pole imie zostalo pominiete, sprawdzamy czy formularz przejdzie werfyfikacje

        Espresso.onView(withId(R.id.Imie_Form_Text)).perform(typeText(""));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Nazwisko_Form_Text)).perform(typeText(NAZWISKO));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Budynek_Form_Text)).perform(typeText(BUDYNEK));

        Espresso.closeSoftKeyboard();





        Espresso.onView(withId(R.id.Sala_Form_Text)).perform(typeText(SALA));

        Espresso.closeSoftKeyboard();



        Espresso.onView(withId(R.id.Next_Form_Button)).perform(click());



        intended(hasComponent(Application_Form_ReadyToPrint.class.getName()));

        Intents.release();
    }

    @Test
    public void noLastNameForm() throws Exception {

        Intents.init();

        //Pole nazwisko zostalo pominiete, sprawdzamy czy formularz przejdzie werfyfikacje
        Espresso.onView(withId(R.id.Imie_Form_Text)).perform(typeText(IMIE));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Nazwisko_Form_Text)).perform(typeText(""));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Budynek_Form_Text)).perform(typeText(BUDYNEK));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Sala_Form_Text)).perform(typeText(SALA));

        Espresso.closeSoftKeyboard();



        Espresso.onView(withId(R.id.Next_Form_Button)).perform(click());



        intended(hasComponent(Application_Form_ReadyToPrint.class.getName()));

        Intents.release();
    }

    @Test
    public void noBuildingForm() throws Exception {

        Intents.init();

        //Pole budynek zostalo pominiete, sprawdzamy czy formularz przejdzie werfyfikacje
        Espresso.onView(withId(R.id.Imie_Form_Text)).perform(typeText(IMIE));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Nazwisko_Form_Text)).perform(typeText(NAZWISKO));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Budynek_Form_Text)).perform(typeText(""));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Sala_Form_Text)).perform(typeText(SALA));

        Espresso.closeSoftKeyboard();



        Espresso.onView(withId(R.id.Next_Form_Button)).perform(click());



        intended(hasComponent(Application_Form_ReadyToPrint.class.getName()));

        Intents.release();
    }

    @Test
    public void noRoomForm() throws Exception {

        Intents.init();

        //Pole sala zostalo pominiete, sprawdzamy czy formularz przejdzie werfyfikacje
        Espresso.onView(withId(R.id.Imie_Form_Text)).perform(typeText(IMIE));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Nazwisko_Form_Text)).perform(typeText(NAZWISKO));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Budynek_Form_Text)).perform(typeText(BUDYNEK));

        Espresso.closeSoftKeyboard();

        Espresso.onView(withId(R.id.Sala_Form_Text)).perform(typeText(""));

        Espresso.closeSoftKeyboard();



        Espresso.onView(withId(R.id.Next_Form_Button)).perform(click());



        intended(hasComponent(Application_Form_ReadyToPrint.class.getName()));

        Intents.release();
    }

}
