package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Prac2 {
    public static void takeScreenshot(WebDriver driver) {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String location = System.getProperty("user.dir") + "/src/test/screenshots/";
        File directory = new File(location);
        if (!directory.exists()) {
            directory.mkdir();
        }
        try {
            FileUtils.copyFile(file, new File(location + System.currentTimeMillis() + ".png"));

        } catch (IOException ex) {
            ex.printStackTrace();


        }
    }}