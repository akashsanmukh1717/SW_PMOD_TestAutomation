package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
WebDriver driver;
	
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public String[] getCredentials(int number) throws IOException {
		String file = System.getProperty("user.dir")+"//src//test//resources//loginTestData.csv";
		BufferedReader reader = null;
		String line="";
		String[] data = null;
		int lineNumber=1;
		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) !=null) {
				if(lineNumber == number || number>5) {
					data = line.split(",");
					break;
				}
				lineNumber++;	 
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			 try {
				    reader.close();
				   } catch (IOException e) {
				    e.printStackTrace();
				   }
		}
		return data;
	}
	
	public String SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String firstWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
		return firstWindow;
	}
	
	public WebDriverWait waitMethod() {
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));
		return wait;
	}
	
	public String SwitchWindowToChild(String title) {

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String firstWindow = i1.next();
		while (i1.hasNext()) {
			driver.switchTo().window(i1.next());
			String winTitle = driver.getTitle();
			System.out.println(winTitle);
			if (title.equals(winTitle))
				break;
		}
		return firstWindow;
	}
	
}
