package news;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNews extends CommonAPI {

    @Test
    public void tesCnn1(){
        String title = wd.getTitle();
        String actualTitle = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(actualTitle,title);
    }

    @Test
    public void testCnn2(){
        wd.findElement(By.cssSelector(".nav-linksstyles__Link-sc-1tike8v-0")).click();
        /*String title = wd.getTitle();
        String subtitle = "visit the Travel section";
        Assert.assertEquals(subtitle, title);*/
    }

    @Test
    public void testCnn3(){
        WebElement element = wd.findElement(By.id("edition-picker-desktop"));
        element.click();
        //wd.findElement(By.xpath("//span[@class='Text-sc-1amvtpj-0-span']")).click();
        //wd.findElement(By.id("header-search-bar")).sendKeys("Breaking news");
    }

    @Test
    public void testCnn4(){
        wd.findElement(By.linkText("World")).click();
    }

    @Test
    public void testCnn5(){
        wd.findElement(By.partialLinkText("Health")).click();
    }
}
