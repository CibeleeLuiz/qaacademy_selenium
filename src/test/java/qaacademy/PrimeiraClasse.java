package qaacademy;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrimeiraClasse {

    String cursosPresenciais = "//*[@id='comp-k7g9c7sd1label']";
    String cursosOnline = "//*[@id='comp-k7g9c7sd2label']";
    String contato = "//*[@id='comp-k7g9c7sd3label']";
    String Nome = "//*[@id='input_comp-k37gdip8']";



    @Test
    public void testeAberturaNavegador() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qaacademy.com.br/");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath(cursosPresenciais)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(cursosOnline)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(contato)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Nome)).click();
        driver.findElement(By.xpath(Nome)).sendKeys("José Luiz da Silva Martins");


    }
}
