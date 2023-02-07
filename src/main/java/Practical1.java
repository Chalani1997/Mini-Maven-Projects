import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical1 {
    public static void main(String args[]){
    // defining the location of the webdriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Chalani\\Desktop\\CV\\Practical1\\drivers\\chromedriver.exe");

        //initiate the driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        //getting page title
        String title = driver.getTitle();
        //getting page title length
        int length = title.length();
        //printing page title
        System.out.println("Title is "+title);
        //printing page title length
        System.out.println("Length is "+length);

        //checking whether correct web page loaded
        if (driver.getCurrentUrl().equals("https://www.ebay.com/")){
            System.out.println("Correct web page loaded");
        }else{
            System.out.println("Incorrect web page loaded");
        }

        //printing page source length
        driver.getPageSource();
        System.out.println(driver.getPageSource().length());

        //closing driver
        driver.close();
    }
}
