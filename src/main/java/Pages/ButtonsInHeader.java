package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsInHeader {
    private final WebDriver driver;
    public ButtonsInHeader(WebDriver driver){
        this.driver = driver;
    }
    private static final String MAIN_PAGE_URL = "https://skillfactory.ru/";
    private static final String ONLINE_COURSES_ON_MAIN_MENU_XPATH = "//*[@class='main__nav']//*[text()='онлайн-курсы']";
    private static final String ALL_COURSES_MAIN_MENU_XPATH = "//span[text()='Все онлайн-курсы']";
    public static final String CONTACTS = "//*[@id=\"rec713616993\"]/div/div/div/section/div[1]/div/div[1]/ul/li[1]/a";
    private static final String FREE_EVENTS  = "//*[@id=\"sbs-562561178-1678713806343\"]/div/a";
    private static final String CAREER_CENTER = "//*[@id=\"sbs-562561178-1678713806322\"]/div/a";
    private static final String MEDIA = "//*[@id=\"sbs-562561178-1678713806329\"]/div/a";
    private static final String CORPORATE_EDUCATION = "//*[@id=\"sbs-562561178-1678713806333\"]/div/a";
    private static final String COURSES = "//*[@id=\"rec562561178\"]/div/div/div[20]/a";
    private static final String HISTORY = "//*[@id=\"sbs-563872722-1679689839392\"]/div/a";
    private static final String TESTING_COURSE = ".tn-elem__5625611781679405234205 > .tn-atom";
    private static final String  GO_TO_MEDIA = "//*[@id=\"sbs-566452408-1679042434649\"]/div/a";
    private static final String SUBSCRIPTION = ".t-input-group_em:nth-child(1) .t-input";
    private static final String LOOK_ALL_MATERIALS = "//*[@id=\"sbs-563688903-1679040484154\"]/div/a";
    private static final String ERROR_MESSAGE = "t-input-error";
    private static final String SEARCH_CONTACTS = "//*[@id=\"rec472341689\"]/div/div/div[3]/h1";
    private static final String SEARCH_MEDIA = "//*[@id=\"header\"]/div[1]/p";
    private static final String SEARACH_FREE_EVENTS = "//*[@id=\"rec487651767\"]/div/div/div[3]/h1";
    private static final String SEARCH_CAREER_CENTER = "//*[@id=\"rec350865380\"]/div/div/div[3]/h1";
    private static final String SEARCH_CORP_OBUCHENIE = "#rec425993788 > div > div > div.t396__elem.tn-elem.tn-elem__4259937881636447160852 > h1 > span";
    private static final String SEARCH_COURSES = "//*[@id=\"rec567539569\"]/div/div/div[3]/h1";



    public void clickContacts (){
        driver.findElement(By.xpath(CONTACTS)).click();
    }
    public String getContacts(){
        return driver.findElement(By.xpath(SEARCH_CONTACTS)).getText();
    }
    public void clickFree_events(){
        driver.findElement(By.xpath(FREE_EVENTS)).click();
    }
    public String getFreeEvents(){
        return driver.findElement(By.xpath(SEARACH_FREE_EVENTS)).getText();
    }
    public void clickCareerCenter (){
        driver.findElement(By.xpath(CAREER_CENTER)).click();
    }
    public String getCareerCenter(){
        return driver.findElement(By.xpath(SEARCH_CAREER_CENTER)).getText();
    }
    public void clickMedia (){
        driver.findElement(By.xpath(MEDIA)).click();
    }
    public String getMedia(){
        return driver.findElement(By.xpath(SEARCH_MEDIA)).getText();
    }
    public void clickEducation (){
        driver.findElement(By.xpath(CORPORATE_EDUCATION)).click();
    }
    public String getCorporateEducation(){
        return driver.findElement(By.cssSelector(SEARCH_CORP_OBUCHENIE)).getText();
    }
    public void clickCourses(){
        driver.findElement(By.xpath(COURSES)).click();
    }
    public String getCourses(){
        return driver.findElement(By.xpath(SEARCH_COURSES)).getText();
    }
    public void readHistory(){
        driver.findElement(By.xpath(HISTORY)).click();
    }
    public void Course_Testing(){
        driver.findElement(By.cssSelector(TESTING_COURSE)).click();
    }
    public void Go_to_media(){
        driver.findElement(By.xpath(GO_TO_MEDIA)).click();
    }
}