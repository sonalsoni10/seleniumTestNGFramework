package resources;

public class testData {

	public static String firstName = "test name";
	public static String lastName = "test lastName";
	public static String telePhoneNo = "9876541235";
	public static String password = "testpassword";
	public static String confirmPassword ="testpassword"; 
	
	public static String registerAccountConfirmExpected =  "Your Account Has Been Created!";
	
	public static String firstNameErrorMessageExpected = "First Name must be between 1 and 32 characters!";
	public static String lastNameErrorMessageExpected = "Last Name must be between 1 and 32 characters!";
	public static String emailErrorMessageExpected =  "E-Mail Address does not appear to be valid!";
	public static String telephoneErrorMessageExpected = "Telephone must be between 3 and 32 characters!";
	public static String passwordErrorMessageExpected = "Password must be between 4 and 20 characters!";
	public static String privacyPolicyAlertExpected =  "Warning: You must agree to the Privacy Policy!";

	public static String emailAlertMessageExpected = "Warning: E-Mail Address is already registered!";

	public static String successfulLoginMessageExpected = "My Account";
	public static String loginFailesAlertMessageExpected = "Warning: No match for E-Mail Address and/or Password.";
}
