import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionTestSex {


    public final String sex;
    public final boolean expectedHasMane;

    public LionTestSex(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }
    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "{index}: {0}, {1}")
    public static Object[][] getHasMane() {
        return new Object[][]{{"Самец", true}, {"Самка", false}};
    }

}
