package friendslist;

import java.util.*;

import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.List;

import com.cloudgarden.resource.*;

/**
 * This code was generated using CloudGarden's Jigloo SWT/Swing GUI Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose whatever) then you should purchase a license for each developer using
 * Jigloo. Please visit www.cloudgarden.com for details. Use of Jigloo implies acceptance of these licensing terms.
 * ************************************* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED for this machine, so Jigloo or this code cannot be used legally
 * for any corporate or commercial purpose. *************************************
 */
public class MainWindow extends org.eclipse.swt.widgets.Composite {

	private ArrayList<Friend> friends = new ArrayList<Friend>();
	
	private Menu menu1;

	private MenuItem aboutMenuItem;

	private MenuItem contentsMenuItem;

	private Menu helpMenu;

	private MenuItem helpMenuItem;

	private MenuItem exitMenuItem;

	private MenuItem closeFileMenuItem;

	private MenuItem saveFileMenuItem;

	private MenuItem newFileMenuItem;

	private MenuItem openFileMenuItem;

	private Text txtFirstName;

	private Button btnAdd;

	private List lstFriends;

	private Label label3;

	private Text txtLastName;

	private Label label2;

	private Label label1;

	private Menu fileMenu;

	private MenuItem fileMenuItem;

	{
		// Register as a resource user - SWTResourceManager will
		// handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	public MainWindow(Composite parent, int style) {
		super(parent, style);
		initGUI();
		getShell().setImage(new Image(getDisplay(), "eclipse.gif"));
	}

	/**
	 * Initializes the GUI.
	 */
	private void initGUI() {
		try {
			this.setSize(new org.eclipse.swt.graphics.Point(400, 300));
			this.setBackground(SWTResourceManager.getColor(236, 233, 213));
			this.setLayout(null);
			{
				menu1 = new Menu(getShell(), SWT.BAR);
				getShell().setMenuBar(menu1);
				{
					fileMenuItem = new MenuItem(menu1, SWT.CASCADE);
					fileMenuItem.setText("File");
					{
						fileMenu = new Menu(fileMenuItem);
						{
							openFileMenuItem = new MenuItem(fileMenu, SWT.CASCADE);
							openFileMenuItem.setText("Open");
						}
						{
							newFileMenuItem = new MenuItem(fileMenu, SWT.CASCADE);
							newFileMenuItem.setText("New");
						}
						{
							saveFileMenuItem = new MenuItem(fileMenu, SWT.CASCADE);
							saveFileMenuItem.setText("Save");
						}
						{
							closeFileMenuItem = new MenuItem(fileMenu, SWT.CASCADE);
							closeFileMenuItem.setText("Close");
						}
						{
							exitMenuItem = new MenuItem(fileMenu, SWT.CASCADE);
							exitMenuItem.setText("Exit");
							exitMenuItem.addSelectionListener(new SelectionAdapter() {
								public void widgetSelected(SelectionEvent evt) {
									exitMenuItemWidgetSelected(evt);
								}
							});
						}
						fileMenuItem.setMenu(fileMenu);
					}
				}
				{
					helpMenuItem = new MenuItem(menu1, SWT.CASCADE);
					helpMenuItem.setText("Help");
					{
						helpMenu = new Menu(helpMenuItem);
						{
							contentsMenuItem = new MenuItem(helpMenu, SWT.CASCADE);
							contentsMenuItem.setText("Contents");
						}
						{
							aboutMenuItem = new MenuItem(helpMenu, SWT.CASCADE);
							{
								label1 = new Label(this, SWT.NONE);
								label1.setText("First Name");
								label1.setBounds(8, 18, 83, 20);
							}
							{
								label2 = new Label(this, SWT.NONE);
								label2.setText("All Friends");
								label2.setBounds(7, 88, 75, 19);
							}
							{
								txtFirstName = new Text(this, SWT.BORDER);
								txtFirstName.setBounds(97, 22, 195, 21);
							}
							{
								txtLastName = new Text(this, SWT.BORDER);
								txtLastName.setBounds(97, 53, 195, 22);
							}
							{
								label3 = new Label(this, SWT.NONE);
								label3.setText("Last Name");
								label3.setBounds(7, 48, 75, 19);
							}
							{
								lstFriends = new List(this, SWT.BORDER);
								lstFriends.setBounds(97, 87, 285, 194);
							}
							{
								btnAdd = new Button(this, SWT.PUSH | SWT.CENTER);
								btnAdd.setText("Add");
								btnAdd.setBounds(317, 45, 60, 28);
								btnAdd.addSelectionListener(new SelectionAdapter() {
									public void widgetSelected(SelectionEvent evt) {
										btnAddWidgetSelected(evt);
									}
								});
							}
							aboutMenuItem.setText("About");
						}
						helpMenuItem.setMenu(helpMenu);
					}
				}
			}
			this.layout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Auto-generated main method to display this org.eclipse.swt.widgets.Composite inside a new Shell.
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		MainWindow inst = new MainWindow(shell, SWT.NULL);
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		shell.layout();
		if (size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			shell.setSize(shellBounds.width, shellBounds.height);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

	private void btnAddWidgetSelected(SelectionEvent evt) {
		Friend friend = new Friend(txtFirstName.getText(), txtLastName.getText()); 
		friends.add(friend);
		lstFriends.add(friend.toString());
	}
	
	private void exitMenuItemWidgetSelected(SelectionEvent evt) {
		getShell().dispose();
	}

}
