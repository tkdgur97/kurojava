package java28;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	JButton b;

	public MyWindow() {
		setTitle("나의 그래픽");
		setSize(300, 300);
		b = new JButton("나를 눌러요.................");
		setLayout(new FlowLayout());
		
		add(b);
		
		ActionProcess action = new ActionProcess();
		b.addActionListener(action);
		//b.addActionListener(new ActionProcess());
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow my = new MyWindow();
	}
}
