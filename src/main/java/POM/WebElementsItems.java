package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.openqa.selenium.JavascriptExecutor;


public class WebElementsItems {

    public static WebDriver driver;

    public WebElementsItems(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password) throws InterruptedException {

//////////////////////////////////
//*[@id="fuse-layout"]/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[3]/form/div[1]/label
//*[@id="fuse-layout"]/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[3]/form/div[1]/div/input
        //*[@id="fuse-layout"]/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[3]/form/div[2]/div/input
        ///////////////////////////////



        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[3]/form/div[1]/div/input")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[3]/form/div[2]/div/input")).sendKeys(password);

    }

    public void clickButt() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div[1]/div[1]/div/div[1]/div[1]/div[3]/form/button/span[1]")).click();
    }

    public void alertt() {

        WebDriverWait wait=new WebDriverWait(driver, 20);

        String al = driver.switchTo().alert().getText().toString();
        System.out.println("This is Alert Message >>>>> " + al);

        String msg = "Customer added successfully with customer id :6";

        // assertEquals(al,msg);

        try {
            Assert.assertEquals(al, msg);
        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    //////////////////////// 2nd Scenario //////////////////////

    public void approval() throws InterruptedException {

        // WebDriverWait wait=new WebDriverWait(driver, 2000);

        //*[@id="fuse-navbar"]/div/div/div/ul/ul[6]/li/div/span
        ////*[@id="fuse-navbar"]/div/div/div/ul/ul[6]/li/div/span
//////////////////////R&D/////////////////////////////////////Approval
        Thread.sleep(1000);
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/ul/ul[6]/li/button"));

        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //js.executeScript("window.scrollBy(0,-350)", "");
       // js.executeScript("arguments[0].click();", Element);
        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/ul/ul[6]/li/button")).click();


        //////////////////////R&D/////////////////////////////////////

        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[2]")));
    /*    Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/ul/ul[6]/li/button")).click();*/
    }

    public void approvalProcess() throws InterruptedException {

        ////*[@id="fuse-navbar"]/div/div/div/ul/ul[6]/li/div/span
        ////*[@id="fuse-navbar"]/div/div/div/ul/ul[6]/li/div
        /////*[@id="fuse-navbar"]/div/div/div/ul/ul[6]/div/div/div/ul[1]/li/div/span



        String option="Emp. Panel Map";
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/ul/ul[6]/div/div/div/ul[1]/li/div/span")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"fuse-navbar\"]/div/div/div/ul/ul[6]/div/div/div/ul[1]/div/div/div/a[1]")).click();


            /*WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
        dropdown.click();*/
    }

    public void replace_proxy() throws InterruptedException {

         driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[1]/div/div[2]/div/button[2]/span[1]")).click();


     /*   String option="Dollar";

        driver.findElement(By.xpath("//select")).click();
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
        Thread.sleep(1000);
        dropdown.click();*/

/*
        Select drpCountry = new Select(driver.findElement(By.name("currency")));
        drpCountry.selectByValue("Dollar");*/

    }

    public void first_selection(String fname) throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.id("react-select-7-input")).sendKeys(fname);
        driver.findElement(By.id("react-select-7-input")).sendKeys(Keys.ENTER);







        //Thread.sleep(1000);
        /*driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();*/

     /*   Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div")).sendKeys(fname);
*/

      /*  String option=fname;

       driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div")).click();
        Thread.sleep(1000);*/
       /* driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/label")).sendKeys("Shafa");
        Thread.sleep(1000);

        dropdown.click();

        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/option[contains(text(), '"+option+"')]"));
        Thread.sleep(1000);
        dropdown.click();

   /*     WebElement element = driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div"));
        Select select = new Select(element);
        select.selectByValue(fname)*/; // Argentina will get selected.



    }
    //////////////////////// 3rd Scenario //////////////////////

    public void redio_button() throws InterruptedException {
        ///html/body/div/div/div[2]/div/div[1]/button[3]
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[@name='radio-buttons-group'])[2]")).click();
        // Thread.sleep(3000);

    }

    public void second_selection(String sec_name) throws InterruptedException {
        ///html/body/div/div/div[2]/div/div[1]/button[3]

        Thread.sleep(2000);

        driver.findElement(By.id("react-select-8-input")).sendKeys(sec_name);
        driver.findElement(By.id("react-select-8-input")).sendKeys(Keys.ENTER);


    }

    public void remarks(String rem) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("ReplaceProxyRemarks")).sendKeys(rem);
        driver.findElement(By.id("ReplaceProxyRemarks")).sendKeys(Keys.ENTER);

    }

    public void assignBtn() throws InterruptedException {
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[1]/div[5]/button/span[1]")).click();

        driver.findElement(By.xpath("//span[text()='Assign']")).click();


        Thread.sleep(1000);
        driver.quit();

    }

}


