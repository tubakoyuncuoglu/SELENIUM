package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D02_Exercise {
    public static void main(String[] args) throws InterruptedException {
        // Pencereyi maximize yapiniz
        // "https://teknosa.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        // "https://medunna.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        // teknosa adresine geri donunuz
        // Sayfayı yenileyiniz
        // medunna adresine ilerleyiniz
        // Sayfayı yenileyiniz
        // pencereyi kapat


        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        //1.kısım
        driver.manage().window().maximize();
        //2.kısım
        driver.get("https://teknosa.com");
        //3.kısım
        String teknoTitle = driver.getTitle();
        System.out.println("teknosatitlesi :"+ teknoTitle);

        String teknosaURL = driver.getCurrentUrl();
        System.out.println("teknosaURL :"+ teknosaURL);
        //4.kısım
        if (teknosaURL.contains("Teknoloji")){
            System.out.println("Title Teknoloji iceriyor");
        }else {
            System.out.println("Title Teknoloji icermiyor");

        }
        //5.kısım
        if (teknosaURL.contains("teknosa")){
            System.out.println("url teknosa iceriyor");
        }else {
            System.out.println("url teknosa icermiyor");
        }
        //6.kısım
        driver.get( "https://medunna.com/" );
        //7.kısım
        String medunnaTitle = driver.getTitle();
        System.out.println("medunnaTitle :"+ medunnaTitle);

        String medunnaURL =driver.getCurrentUrl();
        System.out.println("medunnaURL :"+ medunnaURL);

        //8.kısım
        if (medunnaTitle.contains("medunna")){
            System.out.println("title medunna iceriyor");
        }else {
            System.out.println("title medunna icermiyor");
        }
       //9.kısım
        if (medunnaURL.contains("medunna")){
            System.out.println("url medunna iceriyor");
        }else {
            System.out.println("url medunna icermiyor");
        }
        //10.kısım
        driver.navigate().back();
        Thread.sleep(3000);
        //11.kısım
        driver.navigate().refresh();
        //12.kısım
        driver.navigate().forward();
        Thread.sleep(4000);
        //13.kısım
        driver.navigate().refresh();
        //14.kısım
        driver.close();
    }
}
