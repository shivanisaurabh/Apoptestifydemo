package jeera;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import jeera.JiraPolicy;
import jeera.JiraServiceProvider;

public class TestJiraListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	
	public void onTestFailure(ITestResult result) {

		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		if (isTicketReady) {
			// raise jira ticket:
			System.out.println("is ticket ready for JIRA: " + isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://apptestify123.atlassian.net/",
					"rabhishek35@gmail.com", "4fbFkfBm24RXNxosXfAq0EB0", "AD");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
					+ "got failed due to some assertion or exception";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Abhishek");
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