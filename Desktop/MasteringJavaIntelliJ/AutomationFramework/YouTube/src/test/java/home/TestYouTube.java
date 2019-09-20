package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestYouTube extends CommonAPI {

    @Test
    public void test1(){
        wd.findElement(By.id("search")).sendKeys("Surah Rahman");
    }

    @Test
    public void test2(){
        /*WebElement element1 = wd.findElement(By.id("search"));
        element1.sendKeys("Selenium");*/
        wd.findElement(By.cssSelector(".style-scope ytd-searchbox")).click();
        /*WebElement element2 = wd.findElement(By.cssSelector(".style-scope ytd-searchbox"));
        element2.click();*/
    }

    @Test
    public void test3(){
        WebElement element = wd.findElement(By.linkText("Music"));
        element.click();
    }

    @Test
    public void test4(){
        wd.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();

    }
    @Test
    public void test5(){
        wd.findElement(By.tagName("h1")).click();
    }
}
