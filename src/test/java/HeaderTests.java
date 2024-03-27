import Pages.*;
import Pages.TestingCoursesPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HeaderTests {
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

    /*
    Переход по кнопке "Все онлайн-курсы" в Headere главной страницы на страницу всех курсов"
     */
    @Test
    public void availabilityMainMenuAllCourses() {
        mainPage.open();
        mainPage.clickAllCoursesOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/courses";
        assertEquals(expectedUrl, currentUrl);
    }

    /*
    Переход по кнопке "Бесплатно" в Headere главной страницы на страницу бесплатных курсов
     */
    @Test
    public void availabilityMainMenuFree() {
        mainPage.open();
        mainPage.clickFreeOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/free-events";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
    Возврат на главную страницу со страницы бесплатных курсов
     */
    @Test
    public void availabilityReturnFromFree() {
        mainPage.open();
        mainPage.clickFreeOnMainMenu();
        switchToNextTab();
        mainPage.clickMainFromFreeOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
        Переход по кнопке "Центр Карьеры" в Headere главной страницы на страницу бесплатных курсов
         */
    @Test
    public void availabilityMainMenuCareerCenter() {
        mainPage.open();
        mainPage.clickCareerCenterOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/career-center";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
    Возврат на главную страницу со страницы "Карьерный центр"
     */
    @Test
    public void availabilityReturnFromCareerCenter() {
        mainPage.open();
        mainPage.clickCareerCenterOnMainMenu();
        switchToNextTab();
        mainPage.clickMainFromCareerCenterOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
        Переход по кнопке "Контакты" в Headere главной страницы на страницу контактов
         */
    @Test
    public void availabilityMainMenuContacts() {
        mainPage.open();
        mainPage.clickContactsOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/contacts";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
    Возврат на главную страницу со страницы Контактов
     */
    @Test
    public void availabilityReturnFromContacts() {
        mainPage.open();
        mainPage.clickContactsOnMainMenu();
        switchToNextTab();
        mainPage.clickMainFromContactsOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
     Переход по кнопке "Медиа" в Headere главной страницы на страницу статей о курсах
       */
    @Test
    public void availabilityMainMenuMedia() {
        mainPage.open();
        mainPage.clickMediaOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://blog.skillfactory.ru/";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
    Переход по кнопке "Професии" в Headere страницы "Медиа" на страницу статей о профессиях
        */
    @Test
    public void availabilityProfessionMedia() {
        mainPage.open();
        mainPage.clickMediaOnMainMenu();
        switchToNextTab();
        mainPage.clickProfessionMedia();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://blog.skillfactory.ru/profession/";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
    Переход по кнопке "Корпоративное обучение" в Headere главной страницы на страницу курсов
     */
    @Test
    public void availabilityMainMenuCorpStudy() {
        mainPage.open();
        mainPage.clickCorpStudyOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://new.skillfactory.ru/corporativnoye-obuchenye";
        assertEquals(expectedUrl, currentUrl);
    }
    /*
    Возврат на главную страницу со страницы "Корпоративного обучения"
     */
    @Test
    public void availabilityReturnFromCorpStudy() {
        mainPage.open();
        mainPage.clickCorpStudyOnMainMenu();
        switchToNextTab();
        mainPage.clickMainFromCorpStudyOnMainMenu();
        switchToNextTab();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://skillfactory.ru/";
        assertEquals(expectedUrl, currentUrl);
    }
}
