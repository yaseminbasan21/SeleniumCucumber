package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class AutoPage {
  public AutoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@name='email_create']")
    public WebElement emailButonu;

    @FindBy(xpath = "//button[@class='btn btn-default button button-medium exclusive']")
    public WebElement createAnAccountButonu;

    @FindBy(xpath= "//div[@id='uniform-id_gender1']")
    public WebElement Mr;

    @FindBy(xpath = "//div[@id='uniform-id_gender2']")
    public WebElement Mrs;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;


    @FindBy(xpath = "//button[@class='btn btn-default button button-medium']")
    public WebElement registerButonu;

  @FindBy(xpath = "//h1[@class='page-heading']")
  public WebElement myAccountYazısı;

}
