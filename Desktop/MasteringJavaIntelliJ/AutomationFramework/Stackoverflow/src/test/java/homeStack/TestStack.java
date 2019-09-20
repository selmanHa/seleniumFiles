package homeStack;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStack extends CommonAPI {

    @Test
    public void test1(){
        WebElement element = wd.findElement(By.linkText("For developers"));
        element.click();
    }

    @Test
    public void test2(){
        wd.findElement(By.xpath("//input[@name='q']")).sendKeys("Physics");
    }

    @Test
    public void test3(){
        String title = wd.getTitle();
        String webTitle = "Stack Overflow - Where Developers Learn, Share, & Build Careers";
        Assert.assertEquals(webTitle,title);
        /*WebElement element = wd.findElement(By.cssSelector(".left-sidebar-toggle p0 ai-center jc-center js-left-sidebar-toggle"));
        element.click();*/
    }

    @Test
    public void test4(){
        wd.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Math");
        //wd.findElement(By.className("s-input s-input__search js-search-field ")).sendKeys("Physics", Keys.ENTER);
        //element.click();
    }

    @Test
    public void test5(){
        wd.findElement(By.cssSelector(".-marketing-link")).click();
    }
}
