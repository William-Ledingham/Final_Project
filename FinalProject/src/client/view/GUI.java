package client.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Provides data members and methods to create the GUI for the Student Records program. 
 * 
 * @author William Ledingham
 * @version 2.0
 * @since 2020-04-03
 *
 */
public class GUI extends JFrame {

	/**
	 * Title at top of the panel.
	 */
	private JLabel programTitle = new JLabel("An Application to Maintain Student Records");
	/**
	 * Title of course catalogue text area.
	 */
	private JLabel courseCatTitle = new JLabel("Course Catalogue");
	/**
	 * Title of student courses text area.
	 */
	private JLabel studentCoursesTitle = new JLabel("Student Classes");
	/**
	 * Text Area in the middle of the panel to display the course catalogue.
	 */
	private JTextArea courseCatTextArea = new JTextArea("");
	/**
	 * Scroll bar for the text area to view all courses in course catalogue
	 */
	private JScrollPane courseCatscrollPane = new JScrollPane(courseCatTextArea);
	/**
	 * Text Area in the middle of the panel to display all of a students courses.
	 */
	private JTextArea studentCoursesTextArea = new JTextArea("");
	/**
	 * Scroll bar for the text area to view all students courses.
	 */
	private JScrollPane studentCoursesScrollPane = new JScrollPane(studentCoursesTextArea);
	/**
	 * Button to refresh the contents of the two text areas.
	 */
	private JButton refreshButton = new JButton("Refresh");
	/**
	 * Button to search course catalogue and display results
	 */
	private JButton searchCatButton = new JButton("Search Catalogue");
	/**
	 * Button to add course to students course list.
	 */
	private JButton addCourseButton = new JButton("Add Course");
	/**
	 * Button to remove course from students course list.
	 */
	private JButton removeCourseButton = new JButton("Remove Course");
	/**
	 * JFrame used to collect information from user to add a course to students course list.
	 */
	private AddCoursePanel addCoursePanel;
	/**
	 * JFrame used to collect information from user to remove a course from students course list.
	 */
	private RemoveCoursePanel removeCoursePanel;
	/**
	 * JFrame used to collect information from user to search the course catalogue.
	 */
	private SearchCatPanel searchCatPanel;
	
	/**
	 * Constructs the GUI with all components.
	 */
	public GUI()
	{
		super("Student Records");
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel northPanel = new JPanel(new GridLayout(2, 0));
		
		JPanel northBottomPanel = new JPanel(new GridLayout(0, 2));
		JPanel northTopPanel = new JPanel(new FlowLayout());
		northTopPanel.add(programTitle);
		
		northBottomPanel.add(courseCatTitle);
		northBottomPanel.add(studentCoursesTitle);
		northPanel.add(northTopPanel);
		northPanel.add(northBottomPanel);
	
		JPanel centerPanel = new JPanel(new GridLayout(0, 2));
		

		
		courseCatscrollPane.setBounds(10, 60, 780, 500);
		courseCatscrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		courseCatTextArea.setEditable(false);
		centerPanel.add(courseCatscrollPane);
		
		
		studentCoursesScrollPane.setBounds(10, 60, 780, 500);
		studentCoursesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		studentCoursesTextArea.setEditable(false);
		centerPanel.add(studentCoursesScrollPane);
		
		JPanel southPanel = new JPanel(new FlowLayout());
		
		southPanel.add(searchCatButton);
		southPanel.add(refreshButton);
		southPanel.add(addCourseButton);
		southPanel.add(removeCourseButton);

		add(mainPanel);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		
		addCoursePanel = new AddCoursePanel();
		removeCoursePanel = new RemoveCoursePanel();
		searchCatPanel = new SearchCatPanel();
	}
	
	/**
	 * Makes the AddCourse window visible.
	 */
	public void openAddCourseFrame()
	{
		addCoursePanel.setVisible(true);
	}
	/**
	 * Makes the RemoveCourse window visible.
	 */
	public void openRemoveCourseFrame()
	{
		removeCoursePanel.setVisible(true);
	}
	/**
	 * Makes the SearchCatalogue window visible.
	 */
	public void openSearchCatPanel()
	{
		searchCatPanel.setVisible(true);
	}
	
	/**
	 * Sets the text in the course catalogue text area.
	 * @param s String to be printed to text area.
	 */
	public void printToCourseCatTextArea(String s)
	{
		courseCatTextArea.setText(s);
	}
	/**
	 * Sets the text in the student courses text area.
	 * @param s String to be printed to text area.
	 */
	public void printToStudentCoursesTextArea(String s)
	{
		studentCoursesTextArea.setText(s);
	}
	
	
	/**
	 * Prompts user with a dialog box for a students id.
	 * @return A string of the student id entered.
	 */
	public String inputDialogBoxStudentID()
	{
		return JOptionPane.showInputDialog("Please enter the student id:");
	}

	
	/**
	 * Shows message dialog box with specific string.
	 * @param s Message to be printed in message box.
	 */
	public void outputCourseInfo(String s)
	{
		JOptionPane.showMessageDialog(this, s);
	}
	
	/**
	 * Adds listener to the searchCatButton.
	 * @param actionListener
	 */
	public void addSearchCatButtonListener(ActionListener actionListener)
	{
		searchCatButton.addActionListener(actionListener);
	}
	/**
	 * Adds listener to the refreshButton.
	 * @param actionListener
	 */
	public void addRefreshButtonListener(ActionListener actionListener)
	{
		refreshButton.addActionListener(actionListener);
	}
	/**
	 * Adds listener to the addCourseButton.
	 * @param actionListener
	 */
	public void addAddCourseButtonListener(ActionListener actionListener)
	{
		addCourseButton.addActionListener(actionListener);
	}
	/**
	 * Adds listener to the removeCourseButton.
	 * @param actionListener
	 */
	public void addRemoveCourseButtonListener(ActionListener actionListener)
	{
		removeCourseButton.addActionListener(actionListener);
	}
	/**
	 * Adds listener to the Add Course button on the AddCoursePanel.
	 * @param actionListener
	 */
	public void addAddCoursePanelButtonListener(ActionListener actionListener)
	{
		addCoursePanel.addAddCoursePanelActionListener(actionListener);
	}
	/**
	 * Adds listener to the Remove Course button on the RemoveCoursePanel.
	 * @param actionListener
	 */
	public void addRemoveCoursePanelButtonListener(ActionListener actionListener)
	{
		removeCoursePanel.addRemoveCoursePanelActionListener(actionListener);
	}
	/**
	 * Adds listener to the Search Catalogue button on the SearchCatPanel.
	 * @param actionListener
	 */
	public void addSearchCatPanelButtonListener(ActionListener actionListener)
	{
		searchCatPanel.addSearchPanelActionListener(actionListener);
	}
	
	/**
	 * Gets AddCoursePanel to access information gathered by it.
	 * @return AddCoursePanel
	 */
	public AddCoursePanel getAddCoursePanel()
	{
		return addCoursePanel;
	}
	/**
	 * Gets RemoveCoursePanel to access information gathered by it.
	 * @return
	 */
	public RemoveCoursePanel getRemoveCoursePanel()
	{
		return removeCoursePanel;
	}
	/**
	 * Gets SearchCatPanel to access information gathered by it.
	 * @return
	 */
	public SearchCatPanel getSearchCatPanel()
	{
		return searchCatPanel;
	}
	
	

	
	
}