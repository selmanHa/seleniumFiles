package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKhanaccademy extends CommonAPI {
    @Test
    public void test1(){
        wd.findElement(By.cssSelector("._1l0xpe7f")).click();
    }


    @Test
    public void test2(){

        String title = wd.getTitle();
        String actualTitle = "Khan Academy | Free Online Courses, Lessons & Practice";
        Assert.assertEquals(actualTitle, title);
        //wd.findElement(By.id("main-content")).click();
    }

    @Test
    public void test3(){

        wd.findElement(By.cssSelector("._1l0xpe7f")).click();
    }

    @Test
    public void test4(){
        wd.findElement(By.linkText("Search")).sendKeys("Physics");
    }

    @Test
    public void test5(){
        wd.findElement(By.partialLinkText("here")).click();
    }


}
