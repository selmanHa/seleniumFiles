package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void tes1(){
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhones");
        wd.findElement(By.cssSelector(".nav-input")).click();
    }

    @Test
    public void test2(){
        wd.findElement(By.linkText("Orders")).click();
    }

    @Test
    public void test3(){
        wd.findElement(By.cssSelector(".nav-input")).click();
    }

    @Test
    public void test4(){
        String title = wd.getTitle();
        String actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualTitle,title);
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
    }

    @Test
    public void test5(){
        wd.findElement(By.linkText("Today's Deals")).click();
    }
}
