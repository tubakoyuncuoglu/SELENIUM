package day02_DriverMethods_Erol_Hoca;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().maximize();//açılan browser'i maximize yapar
        driver.get("https://techproeducation.com");
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().minimize();//sayfayı aşağıya indirir
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
        driver.close();

    }
}

        //driver.manage().window().maximize(); Browser'i maximize yapar
        //driver.manage().window().minimize();  Browser'i minimize yapar yani asagiya indirir
        //driver.manage().window().fullscreen(); Browser'i full screen yapar
        //driver.manage().window().getPosition();  Browser'i kordinatlarini verir
        //driver.manage().window().getSize();       Browser'i olculerini verir
        // driver.manage().window().setPosition(new Point(80,0)); Browser'i istenen kordinata tasir
        //driver.manage().window().setSize(new Dimension(800,600));Browser'i istenen olculere getirir
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); istenen sayfa acilincaya kadar maximum bekleme suresini belirtir
        //driver.close();sadece calisilan browser'i kapatir
        //driver.quit(); acik olan tum browser'i kapapatir.


