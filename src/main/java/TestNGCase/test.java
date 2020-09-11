/**
 * 
 */
package TestNGCase;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author ����
 * 2020��9��11��
 * test
 */
public class test {
	
	@BeforeClass
  	public void beforeClass() {
  		
  		System.out.println("ִ执行之前="+ new Date().toInstant());
  	}
	
  	@AfterClass
  	public void afterClass() {
  		System.out.println("执行之后="+ new Date().toInstant());
  	}
  
  	
	@Test(groups={"用例A"},priority = 2)
	public void getTime() {
		System.out.println("执行中时间2=" + new Date().toInstant());
	}
	
  	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint", priority = 1)
  	public void testException(){
  		System.out.println("执行中时间1=" + new Date().toInstant());
  		throw new IllegalArgumentException("NullPoint");
  	}

}
