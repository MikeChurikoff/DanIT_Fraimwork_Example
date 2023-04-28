import base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickerPageTest extends BaseTest {
    @BeforeClass
    public void acceptCookiies(){
        clickerPage.openPage();
        clickerPage.acceptCoockies();
    }

    @Test
    public void pluswork(){
        int count = 4;
        clickerPage.openPage();
        clickerPage.switchToFrame();
        clickerPage.plusClick(count);
        clickerPage.checkCounter(count);
    }

    @Test
    public void pluswork2(){
        int count = 4;
        clickerPage.openPage();
        clickerPage.switchToFrame();
        clickerPage.plusClick(count);
        clickerPage.checkCounter(count);
    }

    @Test
    public void resetWork(){
        clickerPage.openPage();
        clickerPage.switchToFrame();
        clickerPage.resetWork();
        assertions.equalsOfInts(2,3);
    }
}

