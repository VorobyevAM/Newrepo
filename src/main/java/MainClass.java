import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {

        //Установим путь к драйверу
        //System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver.exe");

        //Проинициализируем наш драйвер
        WebDriver driver = new FirefoxDriver();

        //Неявное ожидание, программа "будет давать шанс" найти ээлемент если страница еще грузится
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Изменим размер окна браузера
        driver.manage().window().maximize();//полный экран

        //driver.manage().window().setSize(new Dimension(400,600));//Задать свой размер



        //Для перехода на какой-либо сайт
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/div[2]/div[1]/div[1]/h2/span[2]/a")).click();

        //Перейти на другую страницу
        driver.navigate().to("https://yandex.ru/");

        //Вернуться на предыдущую страницу
        driver.navigate().back();

        //Вернуться на страницу вперед
        driver.navigate().forward();

        //Обновить страницу
        driver.navigate().refresh();

        //Получим title страницы
        System.out.println(driver.getTitle());

        //Получим ссылку страницы
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

        //Поиск элемента по тексту ссылки
        //WebElement link = driver.findElement(By.linkText("Войти"));
        WebElement link = driver.findElement(By.linkText("Гомера"));

        //Поиск элемента по части текста
        WebElement link2 = driver.findElement(By.partialLinkText("Служебные "));


        //Завершить работу драйвера и закрыть браузер
        driver.quit();



    }

}
