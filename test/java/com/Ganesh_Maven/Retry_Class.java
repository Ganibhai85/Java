package com.Ganesh_Maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		int start=1;
		int end = 5;
		if(start<=end) {
			start++;
			return true;
		}
		return false;
	}

}
