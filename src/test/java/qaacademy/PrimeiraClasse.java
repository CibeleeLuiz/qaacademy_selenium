package qaacademy;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursosPresenciaisBotao = "comp-k7g9c7sd1label";
    int tempoEspera = 2000; //2 segundos em milissegundos;
    String cursosOnlineBotao = "comp-k7g9c7sd2label";
    int tempoEspera1 = 2000; //2 segundos em milissegundos;
    String contatoBotao = "//*[@id='comp-k7g9c7sd3label']";
    int tempoEspera2 = 2000; //2 segundos em milissegundos;
 
    

    /**
     * @throws InterruptedException
     * 
     */
    @Test
    public void testeAberturaNvegador() throws InterruptedException{
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.qaacademy.com.br/");
        

        //drive.findElement(By.id(cursosPresenciaisBotao)).click();
        //Thread.sleep(tempoEspera);
        //drive.findElement(By.id(cursosOnlineBotao)).click();
        //Thread.sleep(tempoEspera1);
        drive.findElement(By.xpath(contatoBotao)).click();
        Thread.sleep(tempoEspera2);
        Driver.findElement(By.id(nomecampo)).send
        //drive.findElement(By.id(Depoimento)).click();
        //Thread.sleep(tempoEspera3);
        //Thread.sleep(tempoEspera4);
        //drive.findElement(By.xpath(Matricula)).click(); 
        


    }
}
