package javaswing024_model_view_controller.controller;

import javaswing024_model_view_controller.gui.FormEvent;
import javaswing024_model_view_controller.model.AgeCategory;
import javaswing024_model_view_controller.model.Database;
import javaswing024_model_view_controller.model.EmploymentCategory;
import javaswing024_model_view_controller.model.Gender;
import javaswing024_model_view_controller.model.Person;

public class Controller
{
	private Database mDb = new Database();
	
	public void addPerson (FormEvent e)
	{
		String name = e.getName();
        String occupation = e.getOccupation();
        
        int ageCategoryIndex = e.getAgeCategory();
        String empCat = e.getEmploymentCategory();
        String taxId = e.getTaxId();
        boolean isUs = e.isUSCitizen();
        String gender = e.getGender();
        
        
        AgeCategory ageCategory = null;
        
        switch(ageCategoryIndex)
        {
        case 0:
        	ageCategory = AgeCategory.CHILD;
        	break;
        case 1:
        	ageCategory = AgeCategory.ADULT;
        	break;
        case 2:
        	ageCategory = AgeCategory.SENIOR;
        	break;
        }
        
        EmploymentCategory empCategory;
        
        if (empCat.equals("employed"))
        	empCategory = EmploymentCategory.EMPLOYED;
        else if (empCat.equals("unemployed"))
        	empCategory = EmploymentCategory.UNEMPLOYED;
        else if (empCat.equals("self-employed"))
        	empCategory = EmploymentCategory.SELF_EMPLOYED;
        
        else
        {
        	empCategory = EmploymentCategory.OTHER;
        	System.err.println(empCat);
        }
        	
        Gender genderCat;
        
        if (gender.equals("male"))
        	genderCat = Gender.MALE;
        else
        	genderCat = Gender.FEMALE;
        		
        
        Person person = new Person(name, occupation, ageCategory, empCategory,taxId, isUs, genderCat);
        
        mDb.addPerson(person);
        
        
	}
}



