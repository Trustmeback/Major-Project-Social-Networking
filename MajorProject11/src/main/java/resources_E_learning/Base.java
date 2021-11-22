package resources_E_learning;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {




public WebDriver driver;
public Properties prop;
public WebDriver initializeDriver() throws IOException
{

prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\SADEEKSH\\eclipse-workspace\\MajorProject11\\src\\main\\java\\resources_E_learning\\data.properties");



prop.load(fis);
//String browserName=prop.getProperty("browser");
//System.out.println(browserName);
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SADEEKSH\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver= new ChromeDriver();




driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;




}
}