import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Start {
WebDriver wd;

@BeforeTest
public void init(){
    System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
}
@Test
public void goToPhoneBook(){
    //open browser
    wd = new ChromeDriver();
    //go to phonebook
   //wd.get("https://contacts-app.tobbymarshall815.vercel.app/");

    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
    wd.navigate().back();
    wd.navigate().forward();
    wd.navigate().refresh();
    //close browser
   // wd.close();
    wd.quit();
}


}
