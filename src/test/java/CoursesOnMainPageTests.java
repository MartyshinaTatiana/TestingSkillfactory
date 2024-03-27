import Pages.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.ArrayList;


public class CoursesOnMainPageTests {

    public static final WebDriver driver;
    public static final MainPage mainPage;
    public static final CoursesOnMainPage onlineCourses;
    public static final TestingCoursesPage testingCoursesPage;
    public static final ButtonsInHeader buttonsInHeader;

    static {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Андрей\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage = new MainPage(driver);
        onlineCourses = new CoursesOnMainPage(driver);
        testingCoursesPage = new TestingCoursesPage(driver);
        buttonsInHeader = new ButtonsInHeader(driver);
    }

    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
    @Test
    public void availabilityMainPageAllCourses() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses";
        assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void availabilityProgrammingOnMainPage() {
        mainPage.open();
        mainPage.clickProgrammingOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses/programmirovanie";
        assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void availabilityDataScienceOnMainPage() {
        mainPage.open();
        mainPage.clickDataScienceOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses/data-science";
        assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void availabilityAnalyticDannyhOnMainPage() {
        mainPage.open();
        mainPage.clickAnalyticDannyhOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses/analitika-dannyh";
        assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void availabilityTestingOnMainPage() {
        mainPage.open();
        mainPage.clickTestingOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses/testirovanie";
        assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void availabilityHighEducationOnMainPage() {
        mainPage.open();
        mainPage.clickHighEducationOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://new.skillfactory.ru/vyssheye-obrazovaniye?utm_source=skillfactory";
        assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void availabilityDesignOnMainPage() {
        mainPage.open();
        mainPage.clickDesignOnMainPage();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses/design";
        assertEquals(expectedUrl, currentUrl);
    }


}


