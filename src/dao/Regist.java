package dao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Regist extends JFrame {

	private JPanel contentPane;
	private JTextField IDtextField;
	private JTextField PWtextField;
	private JTextField PWtextField2;
	private JTextField AdrtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regist frame = new Regist();
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
	public Regist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("회원가입");
		label.setFont(new Font("Dialog", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(172, 38, 322, 80);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(171, 142, 59, 18);
		contentPane.add(lblNewLabel);

		JLabel label_1 = new JLabel("비밀번호");
		label_1.setBounds(159, 187, 59, 18);
		contentPane.add(label_1);

		JLabel label_1_1 = new JLabel("비밀번호확인");
		label_1_1.setBounds(136, 219, 153, 45);
		contentPane.add(label_1_1);

		JLabel lblNewLabel_1 = new JLabel("주소");
		lblNewLabel_1.setBounds(171, 281, 59, 18);
		contentPane.add(lblNewLabel_1);

		IDtextField = new JTextField();
		IDtextField.setBounds(232, 140, 114, 22);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);

		PWtextField = new JTextField();
		PWtextField.setColumns(10);
		PWtextField.setBounds(232, 185, 114, 22);
		contentPane.add(PWtextField);

		PWtextField2 = new JTextField();
		PWtextField2.setColumns(10);
		PWtextField2.setBounds(232, 230, 114, 22);
		contentPane.add(PWtextField2);

		AdrtextField = new JTextField();
		AdrtextField.setColumns(10);
		AdrtextField.setBounds(232, 279, 114, 22);
		contentPane.add(AdrtextField);

		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
            boolean reID = false;
				
				
				String id = IDtextField.getText();
				String pw = PWtextField.getText();
				String pw2 = PWtextField2.getText();
				String Adr = AdrtextField.getText();

				
					
				
				if(pw == null && pw.equals("")) {
					JOptionPane.showMessageDialog(contentPane, "비밀번호가 같습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				  reID = true;	
				 
				}else
					JOptionPane.showMessageDialog(contentPane, "비밀번호를 같게 입력하세요", "경고", JOptionPane.WARNING_MESSAGE);
				
			
				
				
				
				
			}
		});
		btnNewButton.setBounds(389, 137, 105, 162);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("돌아가기");
		btnNewButton_1.setBounds(136, 326, 358, 80);
		contentPane.add(btnNewButton_1);
	}

}
