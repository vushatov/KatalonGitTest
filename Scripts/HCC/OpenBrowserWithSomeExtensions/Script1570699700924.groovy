import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory

System.setProperty("webdriver.chrome.driver","D:/Katalon_Studio_Windows_64-6.3.3/configuration/resources/drivers/chromedriver_win32/chromedriver.exe" )

ChromeOptions option = new ChromeOptions()

option.addExtensions(new File("C:/Users/vladi/Downloads/Momentum-_سوق-Chrome-الإلكتروني_v1.12.4.crx")) 

DesiredCapabilities caps = new DesiredCapabilities()
caps.setCapability(ChromeOptions.CAPABILITY, option)

WebDriver driver = new ChromeDriver(caps)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl("https:/google.com")