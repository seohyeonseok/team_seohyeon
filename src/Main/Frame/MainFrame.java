package Main.Frame;

import GlobalValue.GlobalValue;

import java.awt.*;
import javax.swing.*;
// java.awt �� javax.swing�� �׷��� ���̺귯��

public class MainFrame extends JFrame {
	private int nWidth;
	private int nHeight;
	private JLabel Label_ID,Label_Password;
	private JTextField TextField_ID,TextField_Password;
	private JPanel LabelPanel;
	
	public MainFrame() {
		this.setTitle("Log-In");
		this.setPreferredSize(new Dimension(GlobalValue.nLoginFrameWidth,GlobalValue.nLoginFrameHeight));
		this.setBackground(Color.black);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �������� ũ�⸦ ����
		// �������� ������ ����
		// �������� ���ϲ��� �Ⱥ��ϲ��� ����
		// �������� x��ư�� ������ ��� �Ҳ��� ����
		
		
		LabelPanel = new JPanel();
		//������������ ����� �г��� �����Ѵ�.
		
		Label_ID = new JLabel("�й� :");
		Label_ID.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(Label_ID);
		//���� ���� �гο� �߰��Ѵ�.
		
		TextField_ID = new JTextField(10);
		TextField_ID.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(TextField_ID);
		//�ؽ�Ʈ������ ���� �гο� �߰��Ѵ�.
		
		Label_Password = new JLabel("��� :");
		Label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(Label_Password);
		//���� ���� �гο� �߰��Ѵ�.
		
		TextField_Password = new JTextField(10);
		TextField_Password.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(TextField_Password);
		//�ؽ�Ʈ������ ���� �гο� �߰��Ѵ�.
		
		this.add(LabelPanel);
		//�г��� �����ӿ� �߰��Ѵ�.
			
		this.pack();
	}
	
	
}