package co.com.choucair.pruebaelcolombiano.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    public static final Target INPUT_SEARCH = Target.the("input search")
            .located(By.id("_1012348259_keywords"));

    public static final Target BUTTON_SEARCH = Target.the("button search")
            .located(By.xpath("//header/div[5]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/span[2]"));

    public static final Target  CHECK_IMAGES = Target.the("check images")
            .located(By.id("cacfcefa-298a-422d-b484-ab82afcd1bfc"));

    public static final Target  CHECK_SPORTS = Target.the("check sports")
            .located(By.id("0f48f889-92f2-4ac1-90b6-da81cfcbcdf8"));

    public static final Target  TEXT_CONFIRM_PAGE = Target.the("text confirm page")
            .located(By.xpath("//span[contains(text(),'Henry Agudelo')]"));
}
