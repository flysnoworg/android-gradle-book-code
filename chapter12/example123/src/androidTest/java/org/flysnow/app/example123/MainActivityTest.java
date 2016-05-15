package org.flysnow.app.example123;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author 飞雪无情
 * @since 16-5-14 下午11:03
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initSomething(){

    }

    @Test
    public void validSomething(){
        mActivityRule.getActivity().findViewById(android.R.id.text1).performClick();
    }
}
