package day01_erol_hoca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_Driver {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com");
        //Sayfa başlığını konsola yazdırınız
        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        //Sayfanın Url'ini yazdırınız
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //Sonra techproeducation sayfasına gidiniz
        driver.get("https://techproeducation.com");
        //techproeducation'in sayfa baslığı ve url'ini yazdırınız
        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
        //Sayfanın windowHandle değerini yazdırınız
        System.out.println(driver.getWindowHandle());

    }

}
