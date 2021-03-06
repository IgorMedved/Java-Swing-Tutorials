package javaswing024_model_view_controller.model;

public class Person
{
	private static int count = 0;
	private int mId;
	
	private String mName;
	private String mOccupation;
	private AgeCategory mAgeCategory;
	private EmploymentCategory mEmploymentCategory;
	private String mTaxId;
	private boolean mUSCitizen;
	private Gender mGender;
	
	
	
					
	
	public Person(String name, String occupation, AgeCategory ageCategory,
			EmploymentCategory employmentCategory, String taxId,
			boolean uSCitizen, Gender gender)
	{
		
		mName = name;
		mOccupation = occupation;
		mAgeCategory = ageCategory;
		mEmploymentCategory = employmentCategory;
		mTaxId = taxId;
		mUSCitizen = uSCitizen;
		mGender = gender;
		
		mId = count;
		count++;
	}
	public int getId()
	{
		return mId;
	}
	public String getName()
	{
		return mName;
	}
	public String getOccupation()
	{
		return mOccupation;
	}
	public AgeCategory getAgeCategory()
	{
		return mAgeCategory;
	}
	public EmploymentCategory getEmploymentCategory()
	{
		return mEmploymentCategory;
	}
	public String getTaxId()
	{
		return mTaxId;
	}
	public boolean isUSCitizen()
	{
		return mUSCitizen;
	}
	public Gender getGender()
	{
		return mGender;
	}
	public void setId(int id)
	{
		mId = id;
	}
	public void setName(String name)
	{
		mName = name;
	}
	public void setOccupation(String occupation)
	{
		mOccupation = occupation;
	}
	public void setAgeCategory(AgeCategory ageCategory)
	{
		mAgeCategory = ageCategory;
	}
	public void setEmploymentCategory(EmploymentCategory employmentCategory)
	{
		mEmploymentCategory = employmentCategory;
	}
	public void setTaxId(String taxId)
	{
		mTaxId = taxId;
	}
	public void setUSCitizen(boolean uSCitizen)
	{
		mUSCitizen = uSCitizen;
	}
	public void setGender(Gender gender)
	{
		mGender = gender;
	}
	
	
	
	
	
}
