package Main.Frame;

import GlobalValue.GlobalValue;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Font;

import javax.swing.*;
// java.awt �� javax.swing�� �׷��� ���̺귯��

public class MainFrame extends JFrame implements ActionListener,MouseListener{
	private int nWidth;
	private int nHeight;
	private JLabel Label_ID,Label_Password, Label_Image, Label_PName;
	private ImageIcon Label_ImageIcon;
	private JTextField TextField_ID,TextField_Password;
	private JPanel LoginPanel;
	private JButton Button1;
	private String Input_ID;
	private String Input_Password;
	
	
	public MainFrame() {
		this.setTitle("Log-In");
		this.setPreferredSize(new Dimension(GlobalValue.nLoginFrameWidth,GlobalValue.nLoginFrameHeight));
		this.setBackground(Color.black);
		this.setVisible(true);
		this.setResizable(false);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �������� ũ�⸦ ����
		// �������� ������ ����
		// �������� ���ϲ��� �Ⱥ��ϲ��� ����
		// �������� x��ư�� ������ ��� �Ҳ��� ����
		
		
		LoginPanel = new JPanel();
		LoginPanel.setLayout(null);
		LoginPanel.setBackground(Color.WHITE);
		//������������ ����� �г��� �����Ѵ�.
		Label_ImageIcon = new ImageIcon("image/logo.jpg");
		Label_Image = new JLabel(Label_ImageIcon);
		Label_Image.setBounds(GlobalValue.nButtonx+25,10,250,250);
		LoginPanel.add(Label_Image);
		
		Label_PName = new JLabel("���� ����");
		Label_PName.setFont(GlobalValue.Font_PName);
		Label_PName.setBounds(GlobalValue.nButtonx+100,GlobalValue.nButtony-160,100,50);
		LoginPanel.add(Label_PName);
		
		Label_ID = new JLabel("���̵�(�й�)");
		Label_ID.setFont(GlobalValue.Font_Label);
		Label_ID.setBounds(GlobalValue.nButtonx,GlobalValue.nButtony-100,100,50);
		LoginPanel.add(Label_ID);
		
		TextField_ID = new JTextField(10);
	//	TextField_ID.addMouseListener(this);
		TextField_ID.setBounds(GlobalValue.nButtonx + 100,GlobalValue.nButtony-100,200,50);
		LoginPanel.add(TextField_ID);
		//�ؽ�Ʈ������ ���� �гο� �߰��Ѵ�.

		
		Label_Password = new JLabel("��й�ȣ");
		Label_Password.setFont(GlobalValue.Font_Label);
		Label_Password.setBounds(GlobalValue.nButtonx+30,GlobalValue.nButtony-50,100,50);
		LoginPanel.add(Label_Password);
		
		TextField_Password = new JPasswordField(10);
		TextField_Password.setBounds(GlobalValue.nButtonx+100,GlobalValue.nButtony-50,200,50);
		LoginPanel.add(TextField_Password);
		
		//�ؽ�Ʈ������ ���� �гο� �߰��Ѵ�.
		
		Button1 = new JButton("�α���");
		Button1.setBounds(GlobalValue.nButtonx,GlobalValue.nButtony+20,300,50);
		Button1.addActionListener(this);
		Button1.setFont(GlobalValue.Font_Button);
		Button1.setBackground(Color.DARK_GRAY);
		Button1.setForeground(Color.WHITE);
		LoginPanel.add(Button1);

		this.add(LoginPanel);
		//�г��� �����ӿ� �߰��Ѵ�.
			
		this.pack();
	}
	public void actionPerformed(ActionEvent event) {
		Input_ID = TextField_ID.getText();
		System.out.println(Input_ID);
		Input_Password = TextField_Password.getText();
		System.out.println(Input_Password);
	}
	public void mouseDragged(MouseEvent event) {}
	public void mouseMoved(MouseEvent event) {}
	public void mousePressed(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mouseClicked(MouseEvent event) {
	//	TextField_ID.setText(null);
	}

	
}