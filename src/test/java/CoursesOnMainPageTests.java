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

    public static final TestingCoursesPage testingCoursesPage;


    static {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Андрей\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage = new MainPage(driver);

        testingCoursesPage = new TestingCoursesPage(driver);

    }

    @AfterAll
    public static void closeDriver() {
        driver.quit();
    }

    public void switchToNextTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
    /* Переход на страницу всех курсов по клику на кнопку "Все курсы" на главной странице */
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
    /* Переход на страницу всех курсов Программирования по клику на кнопку "Программирование" на главной странице */
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
    /* Переход на страницу всех курсов DataScience  по клику на кнопку "DataScience" на главной странице */
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
    /* Переход на страницу Аналитика данных  по клику на кнопку "Аналитика данных" на главной странице */
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
    /* Переход на страницу курсов по тестированию  по клику на кнопку "Тестирование" на главной странице */
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
    /* Переход на страницу Высшее образование  по клику на кнопку "Высшее образование" на главной странице */
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
    /* Переход на страницу курсов по Дизайну  по клику на кнопку "Дизайн" на главной странице */
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


