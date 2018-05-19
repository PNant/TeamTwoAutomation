package testForEyes;

import org.testng.annotations.Test;
import forEyes.shoppingExperience;

public class testShoppingExperience extends shoppingExperience {
    @Test
    public void testFilter(){
        validateTitlePage();
        getUrl();
        validatePageSource();
        clickShoppingExperience();

    }
}
