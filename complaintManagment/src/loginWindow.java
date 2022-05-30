import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.JButton;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;

public class loginWindow extends JFrame {
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private int isLoggedIn = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWindow frame = new loginWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginWindow() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
				int loggedIN = DBConnection.loginUser(username, password);
				if (loggedIN == 1) {
					isLoggedIn = 1;
				}
			}
		});

		JLabel lblNewLabel = new JLabel("New label");

		JLabel lblNewLabel_1 = new JLabel("New label");

		passwordField = new JPasswordField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap(283, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 101,
										GroupLayout.PREFERRED_SIZE)
								.addGap(45))
						.addGroup(gl_panel.createSequentialGroup().addGap(46)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1))
								.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(passwordField)
										.addComponent(textField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(83)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
				.addGap(24)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(30)));
		panel.setLayout(gl_panel);
		tabbedPane.setEnabledAt(0, true);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		tabbedPane.setEnabledAt(1, true);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel lblNewLabel_2 = new JLabel("Username");

		JLabel lblNewLabel_3 = new JLabel("Password");

		JLabel lblNewLabel_4 = new JLabel("Confirm Password");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		passwordField_1 = new JPasswordField();

		passwordField_2 = new JPasswordField();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(320, Short.MAX_VALUE)
						.addComponent(btnNewButton).addGap(20))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(33)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3).addComponent(lblNewLabel_4))
						.addGap(109)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false).addComponent(textField_2)
								.addComponent(passwordField_2).addComponent(passwordField_1))
						.addContainerGap(155, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_1
				.createSequentialGroup().addGap(26)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2).addComponent(
						textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3).addComponent(
						passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4).addComponent(
						passwordField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE).addComponent(btnNewButton)
				.addContainerGap()));
		panel_1.setLayout(gl_panel_1);
	}

	public JLabel getLblNewLabel_2() {
		return getLblNewLabel_2();
	}

	public int getLoginStatus() {
		// TODO Auto-generated method stub
		return isLoggedIn;
		// return 1;
	}
}
