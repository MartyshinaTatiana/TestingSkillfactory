import Pages.*;
import Pages.TestingCoursesPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class JavaTesterCourseTesting {
    public static final WebDriver driver;
    public static final MainPage mainPage;
    public static final CoursesOnMainPage onlineCourses;
    public static final TestingCoursesPage testingCoursesPage;



    static {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Андрей\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        mainPage = new MainPage(driver);
        onlineCourses = new CoursesOnMainPage(driver);
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

    /*
   Переход на страницу курса "Тестировщик на Java"  Главная страница - >Главное меню- >Онлайн-курсы- >Все онлайн-курсы- > Тестирование -> Тестировщик на Java.
    */

    @Test
    public void availabilityMainMenuAllCoursesTestingJavaTester() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        onlineCourses.clickTestingButton();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
        assertEquals(expectedUrl, currentUrl);
    }

    /*
   Переход на страницу курса "Тестировщик на Java"  Главная страница - >Главное меню- >Онлайн-курсы- > Все онлайн курсы -> Тестировщик на Java.
    */

    @Test
    public void availabilityMainMenuAllCoursesJavaTester() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        onlineCourses.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
        assertEquals(expectedUrl, currentUrl);
    }

    /*
   Переход на страницу курса "Тестировщик на Java"  Главная страница - >Главное меню- >Онлайн-курсы- > Тестирование -> Тестировщик на Java.
    */

    @Test
    public void availabilityMainMenuTestingJavaTester() {
        mainPage.open();
        mainPage.clickTestingOnMainMenu();
        switchToNextTab();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
        assertEquals(expectedUrl, currentUrl);
    }

    /*
    Переход на страницу курса "Тестировщик на Java"  Главная страница - > Тестирование -> Тестировщик на Java.
     */
    @Test
    public void availabilityTestingJavaTester() {
        mainPage.open();
        mainPage.clickTestingButton();
        switchToNextTab();
        testingCoursesPage.clickJavaTesterCourseCard();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/java-qa-engineer-testirovshik-po";
        assertEquals(expectedUrl, currentUrl);
    }
}

