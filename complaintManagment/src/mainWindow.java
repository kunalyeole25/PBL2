import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class mainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
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
	public mainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("First Name");

		JLabel lblNewLabel_1 = new JLabel("New label");

		JLabel lblNewLabel_2 = new JLabel("Address");

		JLabel lblNewLabel_3 = new JLabel("Complaint Subject");

		JLabel lblNewLabel_4 = new JLabel("Complaint");

		JButton btnNewButton = new JButton("Send");

		JButton btnNewButton_1 = new JButton("Reset");

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);

		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(27)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3).addComponent(lblNewLabel_2).addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
						.addPreferredGap(ComponentPlacement.RELATED, 358, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnNewButton_1)
										.addGap(18).addComponent(btnNewButton).addGap(59)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE).addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING,
								gl_contentPane.createSequentialGroup().addGap(16).addComponent(lblNewLabel).addGap(18)
										.addComponent(lblNewLabel_1).addGap(18).addComponent(lblNewLabel_2).addGap(18)
										.addComponent(lblNewLabel_3).addGap(29).addComponent(lblNewLabel_4)
										.addPreferredGap(ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnNewButton).addComponent(btnNewButton_1)))
						.addComponent(separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
				.addContainerGap()));

		JLabel lblNewLabel_5 = new JLabel("User:");

		JLabel lblNewLabel_6 = new JLabel("New label");

		JButton btnNewButton_2 = new JButton("Fetch my Complaints");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabel_5).addGap(18)
										.addComponent(lblNewLabel_6))
								.addComponent(btnNewButton_2))
						.addContainerGap(110, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(27)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6))
						.addPreferredGap(ComponentPlacement.RELATED, 356, Short.MAX_VALUE).addComponent(btnNewButton_2)
						.addContainerGap()));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public int getLoginStatus() {
		// TODO Auto-generated method stub
		return 0;
	}
}
