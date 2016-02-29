package javaswing012_eventlisteners_eventobjects;

import java.util.EventObject;

public class FormEvent extends EventObject
{
  String mName;
  String mOccupation;
  
  public FormEvent (Object source)
  {
    super (source);
  }
  
  public FormEvent (Object source, String name, String occupation)
  {
    super (source);
    mName = name;
    mOccupation = occupation;
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
  
  public String getOccupation()
  {
    return mOccupation;
  }
}
