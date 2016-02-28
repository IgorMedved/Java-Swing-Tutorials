package javaswing010_011_textfields_labels_gridbaglayout;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel
{
	private JLabel mLblName;
	private JLabel mLblOccupation;
	
	private JTextField mTxtFldName;
	private JTextField mTxtFldOccupation;
	
	private JButton mBtnOk;
	
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
		gc.weighty = 2;
		
		gc.gridx=1;
		gc.gridy=2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(mBtnOk, gc);
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		
		
		
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
	}
}
