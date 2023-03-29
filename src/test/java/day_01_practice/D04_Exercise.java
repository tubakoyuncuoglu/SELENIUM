package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class D04_Exercise {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        // Kaynak Kodlarini konsola yazdiriniz
        String kaynakKodlari = driver.getPageSource();
        System.out.println(kaynakKodlari);
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (kaynakKodlari.contains("Gateway")){
            System.out.println("gateway passed");
        }else {
            System.out.println("gateway file passed");
        }
        // sayfayi kapatiniz
       driver.close();








        /*
        2- https://www.google.com/ adresine gidin 3- cookies uyarisini kabul ederek kapatin
4Sayfa basliginin “Google” ifadesi icerdigini test edin
5Arama cubuguna “Nutella” yazip aratin
6Bulunan sonuc sayisini yazdirin
7sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
8Sayfayi kapatin
Pinned by Tolga
11:02
1.“https://www.saucedemo.com” Adresine gidin
2.Username kutusuna “standard_user” yazdirin
3.Password kutusuna “secret_sauce” yazdirin
4.Login tusuna basin
5.Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
6.Add to Cart butonuna basin
7.Alisveris sepetine tiklayin
8.Sectiginiz urunun basarili olarak sepete eklendigini control edin
9.Sayfayi kapatin
         */

    }
}
