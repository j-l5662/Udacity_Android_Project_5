import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Pair;

import com.udacity.gradle.builditbigger.EndPointAsyncTask;
import com.udacity.gradle.builditbigger.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.CountDownLatch;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.not;

@RunWith(JUnit4.class)
public class TestAsyncJoke {

    Context context;

    @Test
    public void testAsyncJokeNonEmptyString() throws InterruptedException {

        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);

        context = InstrumentationRegistry.getContext();

        EndPointAsyncTask endPointAsyncTask = new EndPointAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                if( result != null) {
                    assertTrue(result.length() > 0);
                    latch.countDown();
                }

            }

        };
        endPointAsyncTask.execute(new Pair<>(context,"Joke"));
        latch.await();

    }
}
