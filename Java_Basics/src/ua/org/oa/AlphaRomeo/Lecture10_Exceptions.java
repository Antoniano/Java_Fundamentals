package ua.org.oa.AlphaRomeo;

public class Lecture10_Exceptions {

	/*
	 * Calling method call Working method and wait
	 * If there are no errors the return value is returned to the calling method
	 * If an error occur - then the return value = exception;
	 * Exception can be processed locally or by Calling method
	 * 
	 * Exception is an object of the class. The main Exception class is "Throwable";
	 * RuntimeException = uncorrect programming;
	 * 
	 * Checked exceptions are the underclass of java.lang.Exception(RuntimeException);
	 * To process an error in local method use "try" & "catch"
	 * To process an error in Calling method use "throws"; (if(1<2){throw new Exception();})
	 * 
	 * In "Try" use the term that could cause an error; In "Catch" - give the steps that must be done whe error is occur;
	 * Only Throwable underclasses can be used
	 * In "Catch" use the exceptions from Children --> to Parents
	 * 
	 * Block "Finally" can be used after Catch and can be used only one time
	 * Finally always processed and is used to close streams and something else
	 * 
	 * Try must have at least one Catch
	 * 
	 * In one Catch block can be used many exceptions threw "|".
	 * Try with resources - can make the resources free after exception error
	 * 
	 * Try block can contain another Try block and it will be processed by Parent Catch
	 * Parent Catch can process the Children Try --> Catch exceptions
	 * 
	 * PrintStackTrace() --> show the trace of exception
	 * 
	 * All exception classes that we create for ourselves - must "extends" the Exception class
	 */
	
	public static void main(String[] args) {

		
		
	}

}
