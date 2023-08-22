package userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN = Target.the( "button that shows us the form to register").located(By.cssSelector("a[href='/signup/personal']"));
}
