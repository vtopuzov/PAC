public class AcademicBuilding extends Building 
{
	public static final int LIBRARY = 0;
	public static final int CLASSROOMS = 1;
	public static final int OFFICES = 2;
	public static final int MIXED_USE = 3;

	public static final String LIBRARY_STRING = "Library";
	public static final String CLASSROOMS_STRING = "Classrooms";
	public static final String OFFICES_STRING = "Offices";
	public static final String MIXED_USE_STRING = "Mixed Use";
	
	public static final String[] TYPE_STRINGS = {LIBRARY_STRING, 
						CLASSROOMS_STRING, 
						OFFICES_STRING,
						MIXED_USE_STRING};
	
	//it would be better to use enums but we have not studied enums yet
	
	private int type;
	
	public AcademicBuilding (String name, String address, String phoneNumber, 
			int type)
	{
		super (name, address, phoneNumber);
		setType (type);
	}

	public String getTypeAsString()
	{
		return TYPE_STRINGS[type];
	}
  
	public void setType (int type)
	{
		if ((type >= LIBRARY) && (type < MIXED_USE)) 
			this.type  = type;
		else
			this.type = MIXED_USE;
	}
	
}

