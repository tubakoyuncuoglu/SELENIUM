package day_01_practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {


        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://Amazon.com");

        // Kaynak Kodlarini konsola yazdiriniz
        String sayfaKaynakKodlari = driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);

        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (sayfaKaynakKodlari.contains("Gateway")){
            System.out.println("Kaynak Kodlarinda Gateway Yaziyor");
        }else {
            System.out.println("Kaynak kodlarinda Gateway Yazmiyor");
        }

        // sayfayi kapatiniz
        driver.close();



    }

}
