import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class FelineTest {



    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Ошибка",(List.of("Животные", "Птицы", "Рыба")), feline.eatMeat());
    }

    @Test
    public void testFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Ошибка","Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals("Ошибка",1, feline.getKittens());

    }

    @Test
    public void testCountKittens() {
        Feline feline = new Feline();
        Assert.assertEquals("Ошибка",3, feline.getKittens(3));


    }
}