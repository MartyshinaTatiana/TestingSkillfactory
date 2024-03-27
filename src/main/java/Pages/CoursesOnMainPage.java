package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesOnMainPage {
    private final WebDriver driver;
    public CoursesOnMainPage(WebDriver driver){
        this.driver = driver;
    }

    private static final String ALL_COURSES_PAGE_URL = "https://skillfactory.ru/courses";
    private static final String TESTING_BUTTON_XPATH = "//a[contains(@class,'tn-atom') and text()='Тестирование']";
    private static final String JAVA_TESTER_COURSE_CARD_XPATH = "//li[@id='QAJA']";
    private static final String PROFORIENTATION_TEST_CARD_XPATH = "//*[@id=\"Type-3-green\"]/div[2]/h3/a";
    private static final String PROFORIENTATION_TEST_PAGE_URL = "https://free.skillfactory.ru/proftest?utm_source=sf-index&utm_medium=site&utm_campaign=np_all_all_sf-index_site_lp_leadmagnet-111_none_all_sf_catalog-card&utm_content=catalog-card";
    private static final String IT_SPEC_FROM_SCRATCH_CARD_XPATH = "//*[@id=\"Type-2-darkgreen\"]/div[2]/h3/a";
    private static final String IT_SPEC_FROM_SCRATCH_PAGE_URL = "https://skillfactory.ru/it-specialist-proforientaciya";
    private static final String PYTHON_TESTER_CARD_XPATH = "//*[@id=\"Type-4-green\"]/div[2]/h3/a";
    private static final String PYTHON_TESTER_PAGE_URL = "https://skillfactory.ru/qa-engineer-python-testirovshchik-programmnogo-obespecheniya";
    private static final String PYTHON_DEVELOPER_CARD_XPATH = "//*[@id=\"Type-3-darkgreen\"]/div[2]/h3/a";
    private static final String PYTHON_DEVELOPER_PAGE_URL = "https://skillfactory.ru/python-developer";
    private static final String DATA_ANALYST_CARD_XPATH = "//*[@id=\"Type-6-pink\"]/div[2]/h3/a";
    private static final String DATA_ANALYST_PAGE_URL = "https://skillfactory.ru/data-analyst-pro";
    private static final String GRAPH_DESIGNER_PRO_CARD_XPATH = "//*[@id=\"Type-9-black\"]/div[2]/h3/a";
    private static final String GRAPH_DESIGNER_PRO_PAGE_URL = "https://contented.ru/edu/graphic-designer-pro?utm_source=skillfactory";
    private static final String PYTHON_DEVELOPER_PRO_CARD_XPATH = "//div[@class='card__link']//a[text()='Python*PRO']";
    private static final String PYTHON_DEVELOPER_PRO_PAGE_URL = "https://skillfactory.ru/python-developer-pro";
    private static final String DATA_SCIENTIST_CARD_XPATH = "//div[@class='card__link']//a[text()='Data Scientist']";
    private static final String DATA_SCIENTIST_PAGE_URL = "https://skillfactory.ru/data-scientist-pro";
    private static final String DATA_SCIENTIST_PRO_CARD_XPATH = "//div[@class='card__link']//a[text()='Data Scientist']";
    private static final String DATA_SCIENTIST_PRO_PAGE_URL = "https://skillfactory.ru/data-scientist-pro-mgu";
    private static final String PROJECT_MANAGER_CARD_XPATH = "//div[@class='card__link']//a[text()='Project Manager в IT']";
    private static final String PROJECT_MANAGER_PAGE_URL = "https://skillfactory.ru/project-manager";
    private static final String FULLSTACK_PYTHON_DEVELOPER_CARD_XPATH = "//div[@class='card__link']//a[text()='Fullstack-разработчик на Python']";
    private static final String FULLSTACK_PYTHON_DEVELOPER_PAGE_URL = "https://skillfactory.ru/python-fullstack-web-developer-b";
    private static final String WHITE_HACKER_CARD_XPATH = "//div[@class='card__link']//a[contains(text(),'хакер')]";
    private static final String WHITE_HACKER_PAGE_URL = "https://skillfactory.ru/cyber-security-etichnij-haker";
    private static final String UX_UI_DESIGNER_PRO_CARD_XPATH = "//div[@class='card__link']//a[contains(text(),'UI-дизайнер с нуля до PRO')]";
    private static final String UX_UI_DESIGNER_PRO_PAGE_URL = "https://contented.ru/edu/ux-ui-designer-pro?utm_source=skillfactory";
    private static final String INTERNET_MARKETER_CARD_XPATH = "//div[@class='card__link']//a[text()='Интернет-маркетолог']";
    private static final String INTERNET_MARKETER_PAGE_URL = "https://new.skillfactory.ru/internet-marketing-new";
    private static final String DATA_SCIENCES_MIPT_CARD_XPATH = "//*[@id=\"Type-8-cream\"]/div[2]/h3/a";
    private static final String DATA_SCIENCES_MIPT_PAGE_URL = "https://new.skillfactory.ru/data-science-machine-learning-mipt";
    private static final String IT_PRODUCTS_MANAGEMENT_MIPT_CARD_XPATH = "//*[@id=\"Type-4-cream\"]/div[2]/h3/a";
    private static final String IT_PRODUCTS_MANAGEMENT_MIPT_PAGE_URL = "https://new.skillfactory.ru/new-upravlenie-it-produktami-mipt";
    private static final String NEURAL_NETWORKS_SPEC_CARD_XPATH = "//*[@id=\"Type-5-red\"]/div[2]/h3/a";
    private static final String NEURAL_NETWORKS_SPEC_PAGE_URL = "https://skillfactory.ru/kurs-po-nejronnim-setyam";
    private static final String NLP_IN_LINGUISTICS_AND_IT_CARD_TSU_CARD_XPATH = "//*[@id=\"Type-8-darkgreen\"]/div[2]/h3/a";
    private static final String NLP_IN_LINGUISTICS_AND_IT_PAGE_URL = "https://new.skillfactory.ru/nlp-data-research-tsu";
    public String getProforientationTestPageUrl() { return PROFORIENTATION_TEST_PAGE_URL; }
    public String getItSpecFromScratchPageUrl() { return IT_SPEC_FROM_SCRATCH_PAGE_URL; }
    public String getPythonTesterPageUrl() { return PYTHON_TESTER_PAGE_URL; }
    public String getPythonDeveloperPageUrl() { return PYTHON_DEVELOPER_PAGE_URL; }
    public String getDataAnalystPageUrl() { return DATA_ANALYST_PAGE_URL; }
    public String getGraphDesignerProPageUrl() { return GRAPH_DESIGNER_PRO_PAGE_URL; }
    public String getPythonDeveloperProPageUrl() { return PYTHON_DEVELOPER_PRO_PAGE_URL; }
    public String getDataScientistPageUrl() { return DATA_SCIENTIST_PAGE_URL; }
    public String getDataScientistProPageUrl() { return DATA_SCIENTIST_PRO_PAGE_URL; }
    public String getProjectManagerPageUrl() { return PROJECT_MANAGER_PAGE_URL; }
    public String getFullstackPythonDeveloperPageUrl() { return FULLSTACK_PYTHON_DEVELOPER_PAGE_URL; }
    public String getWhiteHackerPageUrl() { return WHITE_HACKER_PAGE_URL; }
    public String getUxUiDesignerProPageUrl() { return UX_UI_DESIGNER_PRO_PAGE_URL; }
    public String getInternetMarketerPageUrl() { return INTERNET_MARKETER_PAGE_URL; }
    public String getDataSciencesMiptPageUrl() { return DATA_SCIENCES_MIPT_PAGE_URL; }
    public String getItProductsManagementMiptPageUrl() { return IT_PRODUCTS_MANAGEMENT_MIPT_PAGE_URL; }
    public String getNeuralNetworksSpecPageUrl() { return NEURAL_NETWORKS_SPEC_PAGE_URL; }
    public String getNlpInLinguisticsAndItPageUrl() { return NLP_IN_LINGUISTICS_AND_IT_PAGE_URL; }

    public void open() { driver.get(ALL_COURSES_PAGE_URL); }
    public void clickTestingButton() {
        driver.findElement(By.xpath(TESTING_BUTTON_XPATH)).click();
    }
    public void clickJavaTesterCourseCard() {
        driver.findElement(By.xpath(JAVA_TESTER_COURSE_CARD_XPATH)).click();
    }
    public void clickProforientationTestCard() {
        driver.findElement(By.xpath(PROFORIENTATION_TEST_CARD_XPATH)).click();
    }
    public void clickItSpecFromScratchCard() {
        driver.findElement(By.xpath(IT_SPEC_FROM_SCRATCH_CARD_XPATH)).click();
    }
    public void clickPythonTesterCard() {
        driver.findElement(By.xpath(PYTHON_TESTER_CARD_XPATH)).click();
    }
    public void clickPythonDeveloperCard() {
        driver.findElement(By.xpath(PYTHON_DEVELOPER_CARD_XPATH)).click();
    }
    public void clickDataAnalystCard() {
        driver.findElement(By.xpath(DATA_ANALYST_CARD_XPATH)).click();
    }
    public void clickGraphDesignerProCard() {
        driver.findElement(By.xpath(GRAPH_DESIGNER_PRO_CARD_XPATH)).click();
    }
    public void clickPythonDeveloperProCard() {
        driver.findElement(By.xpath(PYTHON_DEVELOPER_PRO_CARD_XPATH)).click();
    }
    public void clickDataScientistCard() {
        driver.findElement(By.xpath(DATA_SCIENTIST_CARD_XPATH)).click();
    }
    public void clickDataScientistProCard() { driver.findElement(By.xpath(DATA_SCIENTIST_PRO_CARD_XPATH)).click(); }
    public void clickProjectManagerCard() { driver.findElement(By.xpath(PROJECT_MANAGER_CARD_XPATH)).click(); }
    public void clickFullstackPythonDeveloperCard() { driver.findElement(By.xpath(FULLSTACK_PYTHON_DEVELOPER_CARD_XPATH)).click(); }
    public void clickWhiteHackerCard() { driver.findElement(By.xpath(WHITE_HACKER_CARD_XPATH)).click(); }
    public void clickUxUiDesignerProCard() { driver.findElement(By.xpath(UX_UI_DESIGNER_PRO_CARD_XPATH)).click(); }
    public void clickInternetMarketerCard() { driver.findElement(By.xpath(INTERNET_MARKETER_CARD_XPATH)).click(); }
    public void clickDataSciencesMiptCard() { driver.findElement(By.xpath(DATA_SCIENCES_MIPT_CARD_XPATH)).click(); }
    public void clickItProductsManagementMiptCard() { driver.findElement(By.xpath(IT_PRODUCTS_MANAGEMENT_MIPT_CARD_XPATH)).click(); }
    public void clickNeuralNetworksSpecCard() { driver.findElement(By.xpath(NEURAL_NETWORKS_SPEC_CARD_XPATH)).click(); }
    public void clickNlpInLinguisticsAndItCard() { driver.findElement(By.xpath(NLP_IN_LINGUISTICS_AND_IT_CARD_TSU_CARD_XPATH)).click(); }
}