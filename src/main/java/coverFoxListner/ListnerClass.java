package coverFoxListner;


import org.testng.ITestListener;

import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerClass implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		String TCname=result.getName();
		Reporter.log("Test case "+TCname+" is completed succesfully ", true);
		
	}
	
//	@Override
//	public void onTestFailure(ITestResult result) {
//		String TCname=result.getName();
//		Reporter.log("Test case"+TCname+" is failed, please check again ", true);
//		
//	}
	@Override
	public void onTestFailure(ITestResult result) {
		String TCname=result.getName();
		Reporter.log("Test case "+TCname+" is failed, please check again ", true);
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		String TCname=result.getName();
		Reporter.log("Test case "+TCname+"is skipped check test case", true);
	}
	@Override
	public void onTestStart(ITestResult result) {

		String TCname=result.getName();
		Reporter.log("Test case "+TCname+"started successfully  ", true);
	}
	
	

}
