package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingCoursesPage {
    private final WebDriver driver;
    public TestingCoursesPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final String JAVA_TESTER_COURSE_CARD_CLASS = "//*[@id=\"QAJA\"]";

    public void clickJavaTesterCourseCard() {
        driver.findElement(By.xpath(JAVA_TESTER_COURSE_CARD_CLASS)).click();

    }
}