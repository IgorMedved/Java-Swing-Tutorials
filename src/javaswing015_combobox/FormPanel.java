package javaswing015_combobox;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel implements ActionListener
{
	private JLabel mLblName;
	private JLabel mLblOccupation;
	
	private JTextField mTxtFldName;
	private JTextField mTxtFldOccupation;
	private JButton mBtnOk;
  	
  	private JList mAgeList;
  
  
    private FormEventListener mFormEventListener;
  	
	
	public FormPanel()
	{
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		mLblName = new JLabel("Name: ");
		mLblOccupation = new JLabel("Occupation: ");
		mTxtFldOccupation = new JTextField(10);
		mTxtFldName = new JTextField(10);
		mBtnOk = new JButton ("OK");
      	mAgeList = new JList();
      
      	DefaultListModel ageListModel = new DefaultListModel();
      	ageListModel.addElement(new AgeCategory (0 , "Under 18"));
      	ageListModel.addElement(new AgeCategory (1, "18 to 65"));
      	ageListModel.addElement(new AgeCategory (2, "65 and over"));
      	
      
      	mAgeList.setModel(ageListModel);
      
      	mAgeList.setPreferredSize(new Dimension(110, 70));
        mAgeList.setBorder(BorderFactory.createEtchedBorder());
      	mAgeList.setSelectedIndex(1);
                                
      
		mBtnOk.addActionListener (this);	
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		gc.fill = GridBagConstraints.NONE;
		
		///////////////////// FIRST ROW //////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.insets = new Insets(0,0,0,5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(mLblName, gc);

		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(mTxtFldName, gc);
		
		///////////////////// SECOND ROW //////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.insets = new Insets(0,0,0,5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(mLblOccupation, gc);
		
		gc.gridx = 1;
		gc.gridy =1;
		gc.insets = new Insets(0,0,0,0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(mTxtFldOccupation, gc);
      
      	
      	///////////////////// THIRD ROW //////////////////////
		gc.weightx = 1;
		gc.weighty = .1;
		
		gc.gridx=1;
		gc.gridy=2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(mAgeList, gc);
		
		
		///////////////////// FOURTH ROW //////////////////////
		gc.weightx = 1;
		gc.weighty = 2;
		
		gc.gridx=1;
		gc.gridy=3;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(mBtnOk, gc);
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		
		
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
	}
  
  	@Override
  	public void actionPerformed (ActionEvent e)
    {
      if (mFormEventListener != null)
      {
        String name = mTxtFldName.getText();
        String occupation = mTxtFldOccupation.getText();
        AgeCategory ageCat = (AgeCategory)mAgeList.getSelectedValue();
        
        //System.out.println(ageCat.getId());
        FormEvent ev = new FormEvent(e.getSource(), name, occupation, ageCat.getId());
        mFormEventListener.formEventOccurred(ev);
      }
    }
  
    public void setFormEventListener(FormEventListener listener)
    {
      mFormEventListener = listener;
    }

}

class AgeCategory
{
	private int mId;
	private String mText;
	
	
	public AgeCategory (int id, String text)
	{
		mId = id;
		mText = text;
	}
	
	public String toString ()
	{
		return mText;
	}
	
	public int getId()
	{
		return mId;
	}
}

