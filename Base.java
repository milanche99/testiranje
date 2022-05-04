package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Base {
    public static WebDriver driver;
    public static void createChromeDriver(String driverPath,String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
    }
    public static WebElement findElement(String locator){
        return driver.findElement(By.xpath(locator));
    }
    public static void click(String locator){
        findElement(locator).click();
    }
    public static void typeText(String locator,String text){
        findElement(locator).sendKeys(text);
    }
    public static void kill(){
        driver.quit();
    }
    public static String getTextFromElement(String locator){
        return findElement(locator).getText();
    }
    public boolean ifElementDisplayed(String locator){
        return findElement(locator).isDisplayed();
    }
    public List<WebElement> getListOfElements(String locator) {
        return driver.findElements(By.xpath(locator));
    }
    public List toList(String locator){
        List<WebElement> webElements=getListOfElements(locator);
        List<String> listOfElements=new ArrayList<>();
        for (WebElement webElement: webElements){
            listOfElements.add(webElement.getText());
        }
        return listOfElements;
    }
    public static StringBuffer readTextFile(String filePath) throws IOException {
        FileReader file=new FileReader(filePath);
        BufferedReader bf=new BufferedReader(file);
        StringBuffer sb=new StringBuffer();
        String text=null;
        String readLine;
        while ((readLine= bf.readLine())!=null){
            text= readLine;
            sb.append(text);
        }
        return sb;
    }
    public boolean isElementSelected(String locator){
        return findElement(locator).isSelected();
    }


}
