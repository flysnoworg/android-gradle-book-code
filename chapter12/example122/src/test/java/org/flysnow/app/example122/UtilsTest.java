package org.flysnow.app.example122;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 * @author 飞雪无情
 * @since 16-5-9 上午12:53
 */
@RunWith(MockitoJUnitRunner.class)
public class UtilsTest {
    private static final String APP_NAME = "Example122";

    @Mock
    Context mMockContext;
    @Test
    public void readAppNameFromContext(){
        when(mMockContext.getString(R.string.app_name)).thenReturn(APP_NAME);

        Utils utils = new Utils(mMockContext);
        String appName = utils.getAppName();
        assertThat(appName,is(APP_NAME));
    }
}
