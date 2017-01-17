package Main.Frame;

import GlobalValue.GlobalValue;

import java.awt.*;
import javax.swing.*;
// java.awt 랑 javax.swing은 그래픽 라이브러리

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
		// 프레임의 크기를 설정
		// 프레임의 배경색을 설정
		// 프레임을 보일껀지 안보일껀지 설정
		// 프레임의 x버튼을 누르면 어떻게 할껀지 설정
		
		
		LabelPanel = new JPanel();
		//프레임위에서 사용할 패널을 정의한다.
		
		Label_ID = new JLabel("학번 :");
		Label_ID.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(Label_ID);
		//라벨을 만들어서 패널에 추가한다.
		
		TextField_ID = new JTextField(10);
		TextField_ID.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(TextField_ID);
		//텍스트영역을 만들어서 패널에 추가한다.
		
		Label_Password = new JLabel("비번 :");
		Label_Password.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(Label_Password);
		//라벨을 만들어서 패널에 추가한다.
		
		TextField_Password = new JTextField(10);
		TextField_Password.setHorizontalAlignment(SwingConstants.CENTER);
		LabelPanel.add(TextField_Password);
		//텍스트영역을 만들어서 패널에 추가한다.
		
		this.add(LabelPanel);
		//패널을 프레임에 추가한다.
			
		this.pack();
	}
	
	
}