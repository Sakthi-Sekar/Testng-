package Testng;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;  
public class AnnotationsTest   
{  
@BeforeTest  @BeforeSuite
public void WebStudentLogin()  
{  
System.out.println("Student login through web");  
}  
@Test @BeforeClass @AfterClass
public void MobileStudentLogin()  
{  
System.out.println("Student login through mobile");  
}  
@AfterTest@AfterSuite
public void APIStudentLogin()  
{  
System.out.println("Student login through API");  
}  
@BeforeMethod
public void StagingStudentLogin()
{
	System.out.println("Student login through staging environment");
}
@AfterMethod
public void IOSStudentLogin()
{
	System.out.println("Student login through IOS");
}

}  