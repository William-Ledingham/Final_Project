package client.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Provides data members and methods to create a JFrame that is meant to be auxiliary to the main GUI frame.
 * Provides TextFields to enter information for a course to be removed from a students course list.
 * 
 * @author William Ledingham
 * @version 1.0
 * @since 2020-04-10
 *
 */
public class RemoveCoursePanel extends JFrame{

	/**
	 * Title at top of the panel.
	 */
	private JLabel title = new JLabel("Remove Course");
	
	/**
	 * Label for the Faculty TextField.
	 */
	private JLabel facultyLabel = new JLabel("Faculty:");
	/**
	 * TextField for the course Faculty.
	 */
	private JTextField facultyTextField = new JTextField(10);
	/**
	 * Label for the course id TextField
	 */
	private JLabel courseIdLabel = new JLabel("Course ID:");
	/**
	 * TextField for the course id.
	 */
	private JTextField courseIdTextField = new JTextField(10);
	/**
	 * Label for the section number TextField.
	 */
	private JLabel sectionLabel = new JLabel("Section Number:");
	/**
	 * TextField for the section number.
	 */
	private JTextField sectionTextField = new JTextField(10);
	/**
	 * Button for remove the course from the students course list.
	 */
	private JButton removeCourseButton = new JButton("Remove Course");
	/**
	 * Return to Main Button that starts action close this InsertPanel.
	 */
	private JButton returnToMainButton = new JButton("Return to Main Window");
	
	/**
	 * Constructs InserPanel with all components
	 */
	public RemoveCoursePanel()
	{
		super("Remove Course");

		JPanel insertPanel = new JPanel(new BorderLayout());
		setSize(400, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel northPanel = new JPanel(new FlowLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel = new JPanel(new FlowLayout());
		
		northPanel.add(title);
		centerPanel.add(facultyLabel);
		centerPanel.add(facultyTextField);
		centerPanel.add(courseIdLabel);
		centerPanel.add(courseIdTextField);
		centerPanel.add(sectionLabel);
		centerPanel.add(sectionTextField);
		
		southPanel.add(removeCourseButton);
		southPanel.add(returnToMainButton);
		
		add(insertPanel);
		insertPanel.add(northPanel, BorderLayout.NORTH);
		insertPanel.add(centerPanel, BorderLayout.CENTER);
		insertPanel.add(southPanel, BorderLayout.SOUTH);
		
		
		returnToMainButton.addActionListener((ActionEvent e) -> {
			
			this.dispose();
			
		});
		
	}
	
	/**
	 * Adds Listener to the Insert Button.
	 * @param actionListener Action Listener for the button.
	 */
	public void addRemoveCoursePanelActionListener(ActionListener actionListener)
	{
		removeCourseButton.addActionListener(actionListener);
	}

	/**
	 * Gets the faculty entered in the faculty TextField.
	 * @return String of the faculty.
	 */
	public String getFaculty()
	{
		return facultyTextField.getText();
	}
	/**
	 * Gets the course id entered in the course id TextField.
	 * @return Integer of course id.
	 */
	public int getCourseId()
	{
		return Integer.parseInt(courseIdTextField.getText());
	}
	/**
	 * Gets the section number entered in the section number TextField.
	 * @return
	 */
	public int getSection()
	{
		return Integer.parseInt(sectionTextField.getText());
	}
	
}