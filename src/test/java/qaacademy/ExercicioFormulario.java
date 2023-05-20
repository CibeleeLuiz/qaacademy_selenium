package qaacademy;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExercicioFormulario {

    String primeiroNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String sobreNome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String endereco = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String enderecoEmail = "//*[@id='eid']/input";
    String telefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String genero = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input";
    String hobbies = "//*[@id='checkbox2']";
    String lingua = "//*[@id='msdd']";
    String linguaPortugues = "//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[29]/a";
    String selecionarHabilidades = "//*[@id='Skills']";
    String habilidades = "//*[@id='Skills']/option[5]";
    String selecionePais = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span";
    String pais = "//*[@id='select2-country-results']/li[5]";
    String dataNascimento = "//*[@id='yearbox']";
    String ano = "//*[@id='yearbox']/option[69]";
    String selecionarMes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select";
    String mes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[11]";
    String selecionarDia = "//*[@id='daybox']";
    String dia = "//*[@id='daybox']/option[16]";
    String senha = "//*[@id='firstpassword']";
    String confirmarSenha = "//*[@id='secondpassword']";
    String EnviarBotao = "//*[@id='submitbtn']/font/font";
    String Arquivo = "//*[@id='imagesrc']";

    
    @Test
    public void testeAberturaNavegador() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        
        driver.findElement(By.xpath(primeiroNome)).click();
        driver.findElement(By.xpath(primeiroNome)).sendKeys("José Luiz");
        
        driver.findElement(By.xpath(sobreNome)).click();
        driver.findElement(By.xpath(sobreNome)).sendKeys("Da Silva Martins");
        
        driver.findElement(By.xpath(endereco)).click();
        driver.findElement(By.xpath(endereco)).sendKeys("Rua Ibitirama 1820");
        
        driver.findElement(By.xpath(enderecoEmail)).click();
        driver.findElement(By.xpath(enderecoEmail)).sendKeys("josemartins@gmail.com.br");
        
        driver.findElement(By.xpath(telefone)).click();
        driver.findElement(By.xpath(telefone)).sendKeys("11940208093");

        driver.findElement(By.xpath(genero)).click();  
        driver.findElement(By.xpath(genero)).sendKeys("Macho"); 
        
        driver.findElement(By.xpath(hobbies)).click();  
        driver.findElement(By.xpath(hobbies)).sendKeys("Filmes");

        JavascriptExecutor js = (JavascriptExecutor) driver; //comando descer barra
        js.executeScript("window.scrollBy(0,350)", ""); //comando descer barra

        //driver.findElement(By.xpath(lingua)).click();
        //driver.findElement(By.xpath(linguaPortugues)).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(selecionarHabilidades)).click();
        driver.findElement(By.xpath(habilidades)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(selecionePais)).click();
        driver.findElement(By.xpath(pais)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(dataNascimento)).click();
        driver.findElement(By.xpath(ano)).click();
        driver.findElement(By.xpath(selecionarMes)).click();
        driver.findElement(By.xpath(mes)).click();
        driver.findElement(By.xpath(selecionarDia)).click();
        driver.findElement(By.xpath(dia)).click();

        driver.findElement(By.xpath(senha)).click();  
        driver.findElement(By.xpath(senha)).sendKeys("12345678");

        driver.findElement(By.xpath(confirmarSenha)).click();  
        driver.findElement(By.xpath(confirmarSenha)).sendKeys("12345678");

        js.executeScript("window.scrollBy(0,350)", "");

        driver.findElement(By.xpath(EnviarBotao)).click();





        
        
        










        

    }
    
}
