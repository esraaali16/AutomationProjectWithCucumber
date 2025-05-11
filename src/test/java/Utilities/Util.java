package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Util {
    protected WebDriver driver;

    public static void TakeScreenshot(WebDriver driver,String name) throws IOException {

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("screenshot/" + name +  ".png"));
    }
}
