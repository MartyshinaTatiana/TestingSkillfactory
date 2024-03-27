
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final String MAIN_PAGE_URL = "https://skillfactory.ru/";
    private static final String ONLINE_COURSES_ON_MAIN_MENU_XPATH = "//*[@class='main__nav']//*[text()='онлайн-курсы']";
    private static final String ALL_COURSES_MAIN_MENU_XPATH = "//span[text()='Все онлайн-курсы']";
    private static final String ALL_COURSES_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[7]/a/span";
    private static final String FREE_ON_MAIN_MENU_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[1]/ul/li[2]/a";
    private static final String RETURN_FROM_FREE_XPATH = "//*[@id=\"rec614365250\"]/div/div/div[3]/a/img";
    private static final String CAREER_CENTER_ON_MAIN_MENU_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[1]/ul/li[3]/a";
    private static final String RETURN_FROM_CAREER_CENTER_XPATH = "//*[@id=\"rec469350955\"]/div/div/div[11]/a/img";
    private static final String CONTACTS_ON_MAIN_MENU_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[1]/ul/li[4]/a";
    private static final String RETURN_FROM_CONTACTS_XPATH = "//*[@id=\"rec618809688\"]/div/div/div[3]/a/img";
    private static final String MEDIA_ON_MAIN_MENU_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[1]/ul/li[5]/a";
    private static final String PROFESSION_MEDIA_XPATH = "//*[@id=\"header\"]/div[2]/div[1]/menu/li[1]/a";
    private static final String CORP_STUDY_ON_MAIN_MENU_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[1]/ul/li[6]/a";
    private static final String RETURN_FROM_CORP_STUDY_XPATH = "//*[@id=\"nav380520206\"]/div/div[2]/div/a/img";
    private static final String TESTING_MAIN_MENU_XPATH = "//span[text()='Тестирование']";
    private static final String TESTING_BUTTON_XPATH = "//ul[@class='directions__list']//span[text()='Тестирование']";
    private static final String PROGRAMMING_ON_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[1]/a/span";
    private static final String DATA_SCIENCE_ON_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[2]/a/span";
    private static final String ANALYTIC_DANNYH_ON_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[3]/a/span";
    private static final String TESTING_ON_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[4]/a/span";
    private static final String HIGH_EDUCATION_ON_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[5]/a/span";
    private static final String DESIGN_ON_MAIN_PAGE_XPATH = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[2]/div[1]/div/ul/li[6]/a/span";



    public void open(){
        driver.get(MAIN_PAGE_URL);
    }


    public void clickAllCoursesOnMainMenu(){
        WebElement onlineCoursesOnMainMenu = driver.findElement(By.xpath(ONLINE_COURSES_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(onlineCoursesOnMainMenu).perform();
        driver.findElement(By.xpath(ALL_COURSES_MAIN_MENU_XPATH)).click();
    }

    public void clickFreeOnMainMenu(){
        WebElement freeOnMainMenu = driver.findElement(By.xpath(FREE_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(freeOnMainMenu).perform();
        driver.findElement(By.xpath(FREE_ON_MAIN_MENU_XPATH)).click();
    }
    public void clickMainFromFreeOnMainMenu(){
        WebElement mainFromFreeOnMainMenu = driver.findElement(By.xpath(RETURN_FROM_FREE_XPATH));
        new Actions(driver).moveToElement(mainFromFreeOnMainMenu).perform();
        driver.findElement(By.xpath(RETURN_FROM_FREE_XPATH)).click();
    }
    public void clickCareerCenterOnMainMenu(){
        WebElement careerCenterOnMainMenu = driver.findElement(By.xpath(CAREER_CENTER_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(careerCenterOnMainMenu).perform();
        driver.findElement(By.xpath(CAREER_CENTER_ON_MAIN_MENU_XPATH)).click();
    }
    public void clickMainFromCareerCenterOnMainMenu(){
        WebElement mainFromCareerCenterOnMainMenu = driver.findElement(By.xpath(RETURN_FROM_CAREER_CENTER_XPATH));
        new Actions(driver).moveToElement(mainFromCareerCenterOnMainMenu).perform();
        driver.findElement(By.xpath(RETURN_FROM_CAREER_CENTER_XPATH)).click();
    }
    public void clickContactsOnMainMenu(){
        WebElement contactsOnMainMenu = driver.findElement(By.xpath(CONTACTS_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(contactsOnMainMenu).perform();
        driver.findElement(By.xpath(CONTACTS_ON_MAIN_MENU_XPATH)).click();
    }
    public void clickMainFromContactsOnMainMenu(){
        WebElement mainFromContactsOnMainMenu = driver.findElement(By.xpath(RETURN_FROM_CONTACTS_XPATH));
        new Actions(driver).moveToElement(mainFromContactsOnMainMenu).perform();
        driver.findElement(By.xpath(RETURN_FROM_CONTACTS_XPATH)).click();
    }

    public void clickMediaOnMainMenu(){
        WebElement mediaOnMainMenu = driver.findElement(By.xpath(MEDIA_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(mediaOnMainMenu).perform();
        driver.findElement(By.xpath(MEDIA_ON_MAIN_MENU_XPATH)).click();
    }
    public void clickProfessionMedia(){
        WebElement mainProfessionMedia = driver.findElement(By.xpath(PROFESSION_MEDIA_XPATH));
        new Actions(driver).moveToElement(mainProfessionMedia).perform();
        driver.findElement(By.xpath(PROFESSION_MEDIA_XPATH)).click();
    }
    public void clickCorpStudyOnMainMenu(){
        WebElement corpStudyOnMainMenu = driver.findElement(By.xpath(CORP_STUDY_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(corpStudyOnMainMenu).perform();
        driver.findElement(By.xpath(CORP_STUDY_ON_MAIN_MENU_XPATH)).click();
    }
    public void clickMainFromCorpStudyOnMainMenu(){
        WebElement mainFromCorpStudyOnMainMenu = driver.findElement(By.xpath(RETURN_FROM_CORP_STUDY_XPATH));
        new Actions(driver).moveToElement(mainFromCorpStudyOnMainMenu).perform();
        driver.findElement(By.xpath(RETURN_FROM_CORP_STUDY_XPATH)).click();
    }
    public void clickTestingOnMainMenu() {
        WebElement onlineCoursesOnMainMenu = driver.findElement(By.xpath(ONLINE_COURSES_ON_MAIN_MENU_XPATH));
        new Actions(driver).moveToElement(onlineCoursesOnMainMenu).perform();
        driver.findElement(By.xpath(TESTING_MAIN_MENU_XPATH)).click();
    }
    public void clickAllCoursesOnMainPage(){
        WebElement allCoursesOnMainPage = driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(allCoursesOnMainPage).perform();
        driver.findElement(By.xpath(ALL_COURSES_MAIN_PAGE_XPATH)).click();
    }
    public void clickProgrammingOnMainPage(){
        WebElement programmingOnMainPage = driver.findElement(By.xpath(PROGRAMMING_ON_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(programmingOnMainPage).perform();
        driver.findElement(By.xpath(PROGRAMMING_ON_MAIN_PAGE_XPATH)).click();
    }
    public void clickDataScienceOnMainPage(){
        WebElement dataScienceOnMainPage = driver.findElement(By.xpath(DATA_SCIENCE_ON_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(dataScienceOnMainPage).perform();
        driver.findElement(By.xpath(DATA_SCIENCE_ON_MAIN_PAGE_XPATH)).click();
    }
    public void clickAnalyticDannyhOnMainPage(){
        WebElement analyticDannyhOnMainPage = driver.findElement(By.xpath(ANALYTIC_DANNYH_ON_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(analyticDannyhOnMainPage).perform();
        driver.findElement(By.xpath(ANALYTIC_DANNYH_ON_MAIN_PAGE_XPATH)).click();
    }
    public void clickTestingOnMainPage(){
        WebElement testingOnMainPage = driver.findElement(By.xpath(TESTING_ON_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(testingOnMainPage).perform();
        driver.findElement(By.xpath(TESTING_ON_MAIN_PAGE_XPATH)).click();
    }
    public void clickHighEducationOnMainPage(){
        WebElement highEducationOnMainPage = driver.findElement(By.xpath(HIGH_EDUCATION_ON_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(highEducationOnMainPage).perform();
        driver.findElement(By.xpath(HIGH_EDUCATION_ON_MAIN_PAGE_XPATH)).click();
    }
    public void clickDesignOnMainPage(){
        WebElement designOnMainPage = driver.findElement(By.xpath(DESIGN_ON_MAIN_PAGE_XPATH));
        new Actions(driver).moveToElement(designOnMainPage).perform();
        driver.findElement(By.xpath(DESIGN_ON_MAIN_PAGE_XPATH)).click();
    }


    public void clickTestingButton() {
        driver.findElement(By.xpath(TESTING_BUTTON_XPATH)).click();
    }
}
