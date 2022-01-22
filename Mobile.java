package week1.day1;

public class Mobile {

	//methods: sendMsg, makeCall, saveContact)

	public String sendMessage(String msg)
	{
		return msg;
	}
	
	public void makeCall()
	{
	System.out.println("Make a Call");
	}
	
	public long saveContact()
	{
		long mobileNumber=9012345678L;
		 return mobileNumber;
	}
	// Create Object for Mobile and call all the methods
	
	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		String output = obj1.sendMessage("Hello");
		System.out.println("The message sent is :" + output);
		long output2 = obj1.saveContact();
		System.out.println("Save the contact Number :" + output2);		
		obj1.makeCall();

	}

}
