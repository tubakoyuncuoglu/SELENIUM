package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D01_Exercise {
    public static void main(String[] args) {
        // Pencereyi maximize yapiniz
        // "https://www.amazon.com/" adresine gidiniz.
        // "https://www.n11.com/" adresine gidiniz.
        // amazon adresine geri donunuz
        // n11 adresine ilerleyiniz
        // sayfayi yenileyiniz
        // pencereyi kapat
        // Konsola "HER ŞEY YOLUNDA" yazdir

        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://www.amazon.com/" adresine gidiniz.
        // "https://www.n11.com/" adresine gidiniz.
         driver.get("https://Amazon.com");
         driver.get("https://n11.com");
        // amazon adresine geri donunuz
        driver.navigate().back();
        // n11 adresine ilerleyiniz
        driver.navigate().forward();
        // sayfayi yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");



    }
}
