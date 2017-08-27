/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LoginForm.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: ����4:46:15
*/
package cn.xysfxy.di_02.lab.singleresponsibilityprinciple;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {
	public static final String imageurl = "D:\\image\\";
	private static final long serialVersionUID = 1L;
	JLabel label_sname;
	JLabel label_spassword;
	JLabel label_warn;
	TextField text_sname;
	TextField text_spassword;
	JButton button_ok;
	JButton button_cancel;

	public LoginForm() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension screen = tool.getScreenSize();
		this.setBounds((screen.width - 680) / 2, (screen.height - 400) / 2, 680,
				400);

		label_sname = new JLabel("�û���");
		label_spassword = new JLabel("����");
		label_warn = new JLabel("�������ݽ�Ϊ����");
		button_ok = new JButton("��¼");
		button_cancel = new JButton("�˳�");
		text_sname = new TextField("");
		text_sname.transferFocus();
		text_spassword = new TextField("");
		text_spassword.setEchoChar('*');

		Font f1 = new Font("���Ŀ���", Font.BOLD, 18);
		label_sname.setFont(f1);
		label_sname.setForeground(Color.black);
		label_spassword.setFont(f1);
		label_spassword.setForeground(Color.black);

		Font f2 = new Font("����", Font.CENTER_BASELINE, 17);
		label_warn.setFont(f2);
		label_warn.setForeground(Color.red);
		button_ok.setFont(f2);
		button_cancel.setFont(f2);

		Font f3 = new Font("����", Font.CENTER_BASELINE, 15);
		text_sname.setFont(f3);
		text_spassword.setFont(f3);

		display();
	}
	public void display() {

		ImageIcon icon = new ImageIcon(imageurl + "2.jpg");
		JLabel label = new JLabel(icon);
		label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		this.setIconImage(icon.getImage());
		JPanel j = (JPanel) this.getContentPane();
		j.setOpaque(false);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);

		this.add(panel);
		this.setVisible(true);
		this.setResizable(false);
		label_sname.setBounds(50, 90, 70, 30);
		label_sname.setOpaque(false);
		label_spassword.setBounds(50, 130, 70, 30);
		label_warn.setBounds(85, 170, 150, 30);
		text_sname.setBounds(125, 90, 135, 30);
		text_spassword.setBounds(125, 130, 135, 30);

		button_ok.setBounds(90, 250, 70, 30);
		button_cancel.setBounds(205, 250, 70, 30);
		button_ok.addActionListener(this);
		button_cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		this.setLayout(null);
		panel.add(label_sname);
		panel.add(label_spassword);
		panel.add(label_warn);
		panel.add(text_sname);
		panel.add(text_spassword);
		panel.add(button_ok);
		panel.add(button_cancel);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowEventHandler());
		this.setVisible(true);

	}
	public void exit() {
		int j = JOptionPane.showConfirmDialog(this, "ȷ��Ҫ�˳���¼��", "ϵͳ��ʾ",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (j == JOptionPane.OK_OPTION)
			System.exit(0);
	}
	public void actionPerformed(ActionEvent e) {
		UserDAO usrd = new UserDAO();
		String sname = text_sname.getText();
		String spassword = text_spassword.getText();
//		System.out.println(sname+" "+spassword);
		if (DataValidateUtil.validate(sname)
				&& DataValidateUtil.validate(spassword)) {
			if (usrd.findUser(sname, spassword))
				JOptionPane.showMessageDialog(null, "��ϲ����¼�ɹ�");
			else
				JOptionPane.showMessageDialog(null, "�Բ����û�������������");
		} else {
			JOptionPane.showMessageDialog(null, "�û���������������������������", "ϵͳ��ʾ",
					JOptionPane.OK_OPTION);
			text_sname.setText("");
			text_spassword.setText("");
		}

	}

	class WindowEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			exit();
		}
	}
}
