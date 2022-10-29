package com.centrilli.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    static String browserType;

    //Creating a private constructor,
    // so we are closing access to the object of this class from outside the class.
    private Driver() {

    }

    //Private:we want to close access from outside the class
    //Static:we will use it in a static method
    // private static WebDriver driver;
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    //Getter for Webdriver
    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            //depending on the browsertype that we write in .properties file
            if (System.getProperty("BROWSER") == null) {
                browserType = ConfigurationReader.getProperty("browser");
            } else {
                browserType = System.getProperty("BROWSER");
            }
            switch (browserType) {
                case "remote-chrome":
                    try {
                        // assign your grid server address
                        String gridAddress = "50.16.22.164";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "remote-firefox":
                    try {
                        // assign your grid server address
                        String gridAddress = "50.16.22.164";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "remote-safari":
                    try {
                        // assign your grid server address
                        String gridAddress = "50.16.22.164";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("safari");
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driverPool.get();


    }

        //This method wil make sure our driver value is always null after using quit()method
        public static void closeDriver() {
            if (driverPool.get() != null) {
                driverPool.get().quit(); //this line will terminate the existing session. Value will not even be null
                driverPool.remove();
            }
        }

    }


