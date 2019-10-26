package Logistics;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//ItestListeners interface which implement TestNG listeners
public class Listeners implements ITestListener{

	Base b=new Base();
	
	public void onTestStart(ITestResult result) {
	
		
	}
	
public void onTestSuccess(ITestResult result) {
		
	System.out.println("Print me on sucess of each test case" + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		
		try {
			b.getscreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	



}
