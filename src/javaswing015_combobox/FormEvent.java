package javaswing015_combobox;

import java.util.EventObject;

public class FormEvent extends EventObject
{
  private String mName;
  private String mOccupation;
  private int mAgeCategory;
  
  
  public FormEvent (Object source)
  {
    super (source);
  }
  
  public FormEvent (Object source, String name, String occupation, int ageCat)
  {
    super (source);
    mName = name;
    mOccupation = occupation;
    mAgeCategory = ageCat;
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
