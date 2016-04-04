package javaswing016_checkbox;

import java.util.EventObject;

public class FormEvent extends EventObject {
	private String mName;
	private String mOccupation;
	private int mAgeCategory;
	private String mEmploymentCategory;
	private String mTaxId;
	private boolean mUSCitizen;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String name, String occupation, 
			int ageCat, String empCategory, String taxId, boolean usCitizen) {
		super(source);
		mName = name;
		mOccupation = occupation;
		mAgeCategory = ageCat;
		mEmploymentCategory = empCategory;
		mTaxId = taxId;
		mUSCitizen = usCitizen;
	}

	public String getEmploymentCategory() {
		return mEmploymentCategory;
	}

	public void setEmploymentCategory(String employmentCategory) {
		mEmploymentCategory = employmentCategory;
	}

	public void setName(String name) {
		mName = name;
	}

	public void setOccupation(String occupation) {
		mOccupation = occupation;
	}

	public String getName() {
		return mName;
	}

	public int getAgeCategory() {
		return mAgeCategory;
	}

	public boolean isUSCitizen() {
		return mUSCitizen;
	}

	public String getOccupation() {
		return mOccupation;
	}

	public String getTaxId() {
		return mTaxId;
	}

}
