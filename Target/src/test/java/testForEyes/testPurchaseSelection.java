package testForEyes;

import org.testng.annotations.Test;
import forEyes.purchaseSelection;

public class testPurchaseSelection extends purchaseSelection {
@Test
    public void testPurchase(){
    findBoysClothing();
    selectShirt();
    /*clickOnBoysClothing();
    dresswear();
    filterDresswearResults();
    selectSizeAndQty();*/
    }
}
