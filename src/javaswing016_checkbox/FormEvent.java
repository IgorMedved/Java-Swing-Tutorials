package javaswing016_checkbox;

import java.util.EventObject;

public class FormEvent extends EventObject
{
  private String mName;
  private String mOccupation;
  private int mAgeCategory;
  private String mEmploymentCategory;
  
  
  public FormEvent (Object source)
  {
    super (source);
  }
  
  public FormEvent (Object source, String name, String occupation, int ageCat, String empCategory)
  {
    super (source);
    mName = name;
    mOccupation = occupation;
    mAgeCategory = ageCat;
    mEmploymentCategory = empCategory;
  }
  
 

public String getEmploymentCategory() {
	return mEmploymentCategory;
}

public void setEmploymentCategory(String employmentCategory) {
	mEmploymentCategory = employmentCategory;
}

public void setName (String name)
  {
    mName = name;
  }
  
  public void setOccupation (String occupation)
  {
    mOccupation = occupation;
  }
  
  public String getName()
  {
    return mName;
  }
  
  public int getAgeCategory()
  {
	  return mAgeCategory;
  }
  
  public String getOccupation()
  {
    return mOccupation;
  }
}
