package com.giaybac.traprange.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collections {

	/**
     * @param args
     */
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.quikr.com/");
        WebElement listelement = driver.findElement(By.name("categoryId"));
        
        List<WebElement> listoptions = listelement.findElements(By.tagName("option"));
        
        //ArrayList<WebElement> listoptions = (ArrayList<WebElement>) listelement.findElements(By.tagName("option"));
        for (int i = 1;i<listoptions.size();i++)
        { 
            System.out.println(listoptions.get(i).getText());
            
        }

        
        Iterator<WebElement> iterators1 = ((ArrayList<WebElement>) listoptions).iterator(); 
        
         while (iterators1.hasNext()){
             WebElement id1 = iterators1.next();
             System.out.println(id1.getText());
            
         }
        

    }	
	
}
