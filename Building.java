public class Building
{
	private String name;
	private String address;
	private String phoneNumber;

	public Building (String name, String address, String phoneNumber)
	{
		setName (name);
		setAddress (address);
		setPhoneNumber (phoneNumber);
	}
  
	public String getName()
	{
		return name;
	}
  
	public String getAddress()
	{
		return address;
	}
  
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
  
	public void setName(String name)
	{
		this.name = name;
	}
  
	public void setAddress(String  address)
	{
		this.address = address;
	}
  
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
  
	public String toString() 
	{
		return name;
	}
}


