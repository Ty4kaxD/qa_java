import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void checkLionEatMeat() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> food = List.of("Животные");
        feline.getFood("Хищник");
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        Assert.assertEquals(food, lion.getFood());
    }

   @Test
    public void testConstructorInvalidSex() {
                Exception exception = Assert.assertThrows(Exception.class, () -> {
            new Lion("Некорректное значение", feline);
        });

        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void shouldBeMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean a = lion.doesHaveMane();
        Assert.assertEquals(true, a);
    }




}




