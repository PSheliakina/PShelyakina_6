package mantis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//span[text()=' Report Issue ']")
    private WebElement reportIssue;

    @FindBy(id ="summary")
    private WebElement summary;

    @FindBy(id= "description")
    private WebElement description;

    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void openIssuePage(){
        reportIssue.click();
    }

    public void addSummary(String summaryText){
        summary.sendKeys(summaryText);
    }

    public void addDescription(String descriptionText){
        description.sendKeys(descriptionText);
    }
}
