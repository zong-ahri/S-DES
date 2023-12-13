package Report;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sDES {

	private JFrame frame;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	int p10[] = {3,5,2,7,4,10,1,9,8,6};
	int p8[] = {6,3,7,4,8,5,10,9};
	int ip[] = {2,6,3,1,4,8,5,7};
	int ip1[] = {4,1,3,5,7,2,8,6};
	int ep[] = {4,1,2,3,2,3,4,1};
	int s0[][] = {{1,0,3,2}, {3,2,1,0}, {0,2,1,3}, {3,1,3,2}};
	int s1[][] = {{0,1,2,3}, {2,0,1,3}, {3,0,1,0}, {2,1,0,3}};
	int p4[] = {2,4,3,1};
	int input[] = new int[10];
	int temp[] = new int[10];
	int temp2[] = new int[10];
	int temp3[] = new int[10];
	int k1[] = new int[8];
	int k2[] = new int[8];
	int k = 0, l = 0, l1 = 0;
	
	int P10[] = new int[10];
	int P81[] = new int[8];
	int P82[] = new int[8];
	int LS11[] = new int[5];
	int LS12[] = new int[5];
	int LS21[] = new int[5];
	int LS22[] = new int[5];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sDES window = new sDES();
					window.frame.setTitle("16110083 ÃÖÁ¾¿ø (S-DES)");
					window.frame.setResizable(false);
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sDES() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uB3D9\uBA85\uB300\uD559\uAD50 \uCEF4\uD4E8\uD130\uACF5\uD559\uACFC 16110083 \uCD5C\uC885\uC6D0");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 516, 450, 40);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel key = new JPanel();
		key.setBackground(Color.GRAY);
		key.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "key", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
		key.setBounds(472, 10, 500, 500);
		frame.getContentPane().add(key);
		key.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("10-bit key");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(100, 10, 300, 20);
		key.add(lblNewLabel_2);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(Color.BLACK);
		textField_10.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(175, 40, 150, 20);
		key.add(textField_10);
		
		JLabel lblP_2 = new JLabel("P10 = ( 3, 5, 2, 7, 4, 10, 1, 9, 8, 6 )");
		lblP_2.setForeground(Color.WHITE);
		lblP_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblP_2.setBounds(100, 70, 300, 20);
		key.add(lblP_2);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(Color.BLACK);
		textField_11.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(175, 100, 150, 20);
		key.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setForeground(Color.BLACK);
		textField_12.setColumns(5);
		textField_12.setBounds(313, 160, 150, 20);
		key.add(textField_12);
		
		JLabel lblLeftshiftLeft_1_1 = new JLabel("LeftShift-1 ( left 5-bit )");
		lblLeftshiftLeft_1_1.setForeground(Color.WHITE);
		lblLeftshiftLeft_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftshiftLeft_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblLeftshiftLeft_1_1.setBounds(288, 130, 200, 20);
		key.add(lblLeftshiftLeft_1_1);
		
		JLabel lblLeftshiftLeft_2 = new JLabel("LeftShift-1 ( left 5-bit )");
		lblLeftshiftLeft_2.setForeground(Color.WHITE);
		lblLeftshiftLeft_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftshiftLeft_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblLeftshiftLeft_2.setBounds(12, 130, 200, 20);
		key.add(lblLeftshiftLeft_2);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setForeground(Color.BLACK);
		textField_13.setColumns(5);
		textField_13.setBounds(37, 160, 150, 20);
		key.add(textField_13);
		
		JLabel lblP_1_3 = new JLabel("P8 = ( 6, 3, 7, 4, 8, 5, 10, 9 )");
		lblP_1_3.setForeground(Color.WHITE);
		lblP_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblP_1_3.setBounds(100, 190, 300, 20);
		key.add(lblP_1_3);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setForeground(Color.BLACK);
		textField_14.setColumns(8);
		textField_14.setBounds(175, 220, 150, 20);
		key.add(textField_14);
		
		JLabel lblP_1_1_2 = new JLabel("Sub Key-1");
		lblP_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP_1_1_2.setForeground(Color.BLUE);
		lblP_1_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblP_1_1_2.setBounds(100, 250, 300, 20);
		key.add(lblP_1_1_2);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setForeground(Color.BLACK);
		textField_15.setColumns(8);
		textField_15.setBounds(175, 280, 150, 20);
		key.add(textField_15);
		
		JLabel lblLeftshiftlsLeft_1_1 = new JLabel("LeftShift-2(LS-1) ( left 5-bit )");
		lblLeftshiftlsLeft_1_1.setForeground(Color.WHITE);
		lblLeftshiftlsLeft_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftshiftlsLeft_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblLeftshiftlsLeft_1_1.setBounds(288, 310, 200, 20);
		key.add(lblLeftshiftlsLeft_1_1);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setForeground(Color.BLACK);
		textField_16.setColumns(5);
		textField_16.setBounds(313, 340, 150, 20);
		key.add(textField_16);
		
		JLabel lblLeftshiftlsLeft_2 = new JLabel("LeftShift-2(LS-1) ( left 5-bit )");
		lblLeftshiftlsLeft_2.setForeground(Color.WHITE);
		lblLeftshiftlsLeft_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeftshiftlsLeft_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblLeftshiftlsLeft_2.setBounds(12, 310, 200, 20);
		key.add(lblLeftshiftlsLeft_2);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setForeground(Color.BLACK);
		textField_17.setColumns(5);
		textField_17.setBounds(37, 340, 150, 20);
		key.add(textField_17);
		
		JLabel lblP_1_2_1 = new JLabel("P8 = ( 6, 3, 7, 4, 8, 5, 10, 9 )");
		lblP_1_2_1.setForeground(Color.WHITE);
		lblP_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP_1_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblP_1_2_1.setBounds(100, 370, 300, 20);
		key.add(lblP_1_2_1);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setForeground(Color.BLACK);
		textField_18.setColumns(8);
		textField_18.setBounds(175, 400, 150, 20);
		key.add(textField_18);
		
		JLabel lblP_1_1_1_1 = new JLabel("Sub Key-2");
		lblP_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP_1_1_1_1.setForeground(Color.BLUE);
		lblP_1_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblP_1_1_1_1.setBounds(100, 430, 300, 20);
		key.add(lblP_1_1_1_1);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setForeground(Color.BLACK);
		textField_19.setColumns(8);
		textField_19.setBounds(175, 460, 150, 20);
		key.add(textField_19);
		
		JPanel sDES = new JPanel();
		sDES.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "S-DES", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(255, 255, 255)));
		sDES.setBackground(Color.GRAY);
		sDES.setBounds(10, 10, 450, 500);
		frame.getContentPane().add(sDES);
		sDES.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter a 10bit key ( 0 ~ 1023 )");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 60, 200, 40);
		sDES.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField.setBounds(240, 60, 100, 40);
		sDES.add(textField);
		textField.setColumns(10);
		
		JButton btnKey = new JButton("Key");
		btnKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Encrypytion
				if(e.getSource()==btnKey){
					String bnum = Integer.toBinaryString(Integer.parseInt(textField.getText()));
					
					textField_10.setText(bnum);
					String pw = textField_10.getText();
					if(bnum.length()<10) {
						for(int i=0; i<10-bnum.length(); i++) {
							input[i] = 0;
						}
						for(int i=10-bnum.length(), j=0; i<10; i++, j++) {
							char pw1 = pw.charAt(j);
							input[i] = Integer.parseInt(String.valueOf(pw1));
						}
					}else {
						for(int i=0; i<10; i++){
							char pw1 = pw.charAt(i);
							input[i] = Integer.parseInt(String.valueOf(pw1));
						}
					}
					// Encrypytion Function
					key(); 
					
					// P10
					String pw6[] = new String[10];
					
					for(int i=0; i<10; i++) {
						pw6[i] = Integer.toString(P10[i]);
					}
					
					for(int i=0; i<10; i++) {
						textField_11.setText(textField_11.getText() + pw6[i]);
					}
					
					// Shift-1
					String pw4[] = new String[5];
					String pw5[] = new String[5];
					
					for(int i=0; i<5; i++){
						pw4[i] = Integer.toString(LS11[i]);
						pw5[i] = Integer.toString(LS12[i]);
					}
					
					for(int i=0; i<5; i++) {
						textField_13.setText(textField_13.getText() + pw4[i]);
						textField_12.setText(textField_12.getText() + pw5[i]);
					}
					
					// P8-1
					String pw7[] = new String[8];
					
					for(int i=0; i<8; i++) {
						pw7[i] = Integer.toString(P81[i]);
					}
					
					for(int i=0; i<8; i++) {
						textField_14.setText(textField_14.getText() + P81[i]);
					}

					// K1
					String pw2[] = new String[8];
					
					for(int i=0; i<8; i++){
						pw2[i] = Integer.toString(k1[i]);
					}
					
					for(int i=0; i<8; i++){
						textField_1.setText(textField_1.getText() + pw2[i]);
						textField_15.setText(textField_15.getText() + pw2[i]);
					}
					
					// Shift-2
					String pw8[] = new String[5];
					String pw9[] = new String[5];
					
					for(int i=0; i<5; i++){
						pw8[i] = Integer.toString(LS21[i]);
						pw9[i] = Integer.toString(LS22[i]);
					}
					
					for(int i=0; i<5; i++) {
						textField_17.setText(textField_17.getText() + pw8[i]);
						textField_16.setText(textField_16.getText() + pw9[i]);
					}
					
					// P8-2
					String pw10[] = new String[8];
					
					for(int i=0; i<8; i++) {
						pw10[i] = Integer.toString(P82[i]);
					}
					
					for(int i=0; i<8; i++) {
						textField_18.setText(textField_18.getText() + P82[i]);
					}
					
					// K2
					String pw3[] = new String[8];
					
					for(int i=0; i<8; i++){
						pw3[i] = Integer.toString(k2[i]);
					}
					
					for(int i=0; i<8; i++){
						textField_2.setText(textField_2.getText() + pw3[i]);
						textField_19.setText(textField_19.getText() + pw3[i]);
					}
				}
			}
		});
		btnKey.setForeground(Color.WHITE);
		btnKey.setBackground(Color.LIGHT_GRAY);
		btnKey.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnKey.setBounds(350, 60, 90, 40);
		sDES.add(btnKey);
		
		JLabel lblSubKey = new JLabel("Sub Key-1");
		lblSubKey.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubKey.setForeground(Color.WHITE);
		lblSubKey.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblSubKey.setBounds(10, 110, 200, 40);
		sDES.add(lblSubKey);
		
		JLabel lblSubKey_1 = new JLabel("Sub Key-2");
		lblSubKey_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubKey_1.setForeground(Color.WHITE);
		lblSubKey_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblSubKey_1.setBounds(240, 110, 200, 40);
		sDES.add(lblSubKey_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 160, 200, 40);
		sDES.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(240, 160, 200, 40);
		sDES.add(textField_2);
		
		JLabel lblPlaintextA = new JLabel("Plaintext ( A ~ Z, a ~ z )");
		lblPlaintextA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaintextA.setForeground(Color.WHITE);
		lblPlaintextA.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblPlaintextA.setBounds(10, 260, 200, 40);
		sDES.add(lblPlaintextA);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(10, 310, 200, 40);
		sDES.add(textField_3);
		
		JButton btnEncrypytion = new JButton("Encrypytion");
		btnEncrypytion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Encrypytion
				if(e.getSource()==btnEncrypytion){
					String pw = textField_3.getText();
					char pw1 = pw.charAt(0);
					
					pw = Integer.toBinaryString(pw1);

					for(int i=0; i<8; i++){
						if(i==0)
							input[i] = 0;
						else{
							pw1 = pw.charAt(i-1);
							input[i] = Integer.parseInt
								(String.valueOf(pw1));
						}
					}
					// Encrypytion Function
					ip();
					ep();
					xor_k1();
					s0s1();
					p4();
					ipp4();
					sw();
					ep();
					xor_k2();
					s0s1();
					p4();
					ipp4();
					ip_1();
					
					String pw2[] = new String[8];
					
					for(int i=0; i<8; i++)
						pw2[i] = Integer.toString(temp3[i]);
					for(int i=0; i<8; i++)
						textField_4.setText(textField_4.getText()+pw2[i]);
					for(int i=0; i<8; i++)
						textField_5.setText(textField_5.getText()+pw2[i]);
				}
			}
		});
		btnEncrypytion.setForeground(Color.WHITE);
		btnEncrypytion.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnEncrypytion.setBackground(Color.LIGHT_GRAY);
		btnEncrypytion.setBounds(10, 360, 200, 40);
		sDES.add(btnEncrypytion);
		
		JButton btnDecryption = new JButton("Decryption");
		btnDecryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Decryption
				if(e.getSource()==btnDecryption){
					String pw = textField_5.getText();

					for(int i=0; i<8; i++){
							char pw1 = pw.charAt(i);
							input[i] = Integer.parseInt
								(String.valueOf(pw1));
					}
					// Decryption Function
					ip();
					ep();
					xor_k2();
					s0s1();
					p4();
					ipp4();
					sw();
					ep();
					xor_k1();
					s0s1();
					p4();
					ipp4();
					ip_1();
					
					String pw2[] = new String[8];
					
					for(int i=0; i<8; i++)
						pw2[i] = Integer.toString(temp3[i]);
					for(int i=0; i<8; i++)
						textField_6.setText(textField_6.getText()+pw2[i]);
				}
			}
		});
		btnDecryption.setForeground(Color.WHITE);
		btnDecryption.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnDecryption.setBackground(Color.LIGHT_GRAY);
		btnDecryption.setBounds(240, 360, 200, 40);
		sDES.add(btnDecryption);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 410, 200, 40);
		sDES.add(textField_4);
		
		JLabel lblPlaintextA_1 = new JLabel("Plaintext ( A ~ Z, a ~ z )");
		lblPlaintextA_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlaintextA_1.setForeground(Color.WHITE);
		lblPlaintextA_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblPlaintextA_1.setBounds(240, 260, 200, 40);
		sDES.add(lblPlaintextA_1);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(240, 310, 200, 40);
		sDES.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.BLACK);
		textField_6.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(240, 410, 200, 40);
		sDES.add(textField_6);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Reset
				if(e.getSource()==btnReset){
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_10.setText("");
					textField_11.setText("");
					textField_12.setText("");
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
				}
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(647, 516, 150, 40);
		frame.getContentPane().add(btnReset);
		
		JButton btnEnd = new JButton("End");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// End
				if(e.getSource()==btnEnd){
					System.exit(0);
				}
			}
		});
		btnEnd.setForeground(Color.WHITE);
		btnEnd.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnEnd.setBackground(Color.LIGHT_GRAY);
		btnEnd.setBounds(822, 516, 150, 40);
		frame.getContentPane().add(btnEnd);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Help
				if(e.getSource()==btnHelp) {
					String instruction = "---------------------------------------------------------16110083 ÃÖÁ¾¿ø---------------------------------------------------------\n"
										+"1. ¿ÞÂÊ S-DES ÆÐ³Î¿¡ key(0~1023) ¼ýÀÚ¸¦ ÀÔ·Â ÈÄ key ¹öÆ° Å¬¸¯\n"
										+"2. ¿ÞÂÊ S-DES ÆÐ³Î¿¡ Plaintext(Æò¹®) ´Ü¾î(A~Z,a~z) Áß ÇÏ³ª¸¦ ÀÔ·Â ÈÄ Encrypytion(¾ÏÈ£È­) ¹öÆ° Å¬¸¯\n"
										+"3. ¿ÞÂÊ S-DES ÆÐ³Î¿¡ Decryption(º¹È£È­) ¹öÆ° Å¬¸¯\n"
										+"4. ´Ù¸¥ key·Î Àç½ÇÇà ÇÏ°í½ÍÀ¸½Ã¸é Reset ¹öÆ° Å¬¸¯\n"
										+"5. Á¾·áÇÏ½Ã·Á¸é exit ¹öÆ° Å¬¸¯\n"
										+"-------------------------------------------------------------°¨»çÇÕ´Ï´Ù-------------------------------------------------------------";
					JOptionPane hText = new JOptionPane();
					hText.showMessageDialog(null, instruction, "Help", JOptionPane.QUESTION_MESSAGE);
				}
			}
		});
		btnHelp.setForeground(Color.WHITE);
		btnHelp.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnHelp.setBackground(Color.LIGHT_GRAY);
		btnHelp.setBounds(472, 516, 150, 40);
		frame.getContentPane().add(btnHelp);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 984, 562);
		frame.getContentPane().add(panel);
	}
	
	// Encryption
	public void key(){
		//P10
		for(int i=0; i<10; i++){
			k = p10[i];
			P10[i] = temp[i] = input[k-1];
		}
		//P10 shift
		int x=temp[0], y=temp[5];		
		for(int i=0; i<5; i++){
			if(i==4){
				LS11[4] = temp[4] = x;
				LS12[4] = temp[9] = y;
			}
			else{
				LS11[i] = temp[i] = temp[i+1];
				LS12[i] = temp[i+5] = temp[i+6];
			}
		}
		// K1
		for(int i=0; i<8; i++){
			k = p8[i];
			P81[i] = k1[i] = temp[k-1];
		}
		// K2
		for(int j=0; j<2; j++){
			x=temp[0]; y=temp[5];
			for(int i=0; i<5; i++){
				if(i==4){
					LS21[4] = temp[4] = x;
					LS22[4] = temp[9] = y;
				}
				else{
					LS21[i] = temp[i] = temp[i+1];
					LS22[i] = temp[i+5] = temp[i+6];
				}
			}
		}
		for(int i=0; i<8; i++){
			k = p8[i];
			P82[i] = k2[i] = temp[k-1];
		}
	}
	
	// Decryption
	// IP
	public void ip(){
		for(int i=0; i<8; i++){
			k = ip[i];
			temp[i] = input[k-1];
		}
	}
	// E/P
	public void ep(){
		for(int i=0; i<8; i++){
			k = ep[i];
			temp2[i] = temp[k-1];
		}
	}
	// k1_XRO
	public void xor_k1(){
		for(int i=0; i<8; i++){
			k = k1[i] + temp2[i];
	
			if(k==1)
				temp3[i] = 1;
			else
				temp3[i] = 0;
		}
	}
	// s0_s1_2bit
	public void s0s1(){
		l = temp3[0]*2 + temp3[3];
		l1 = temp3[1]*2 + temp3[2];
		
		k = s0[l][l1];
		
		temp2[0] = k/2;
		temp2[1] = k%2;
		
		l = temp3[4]*2 + temp3[7];
		l1 = temp3[5]*2 + temp3[6];
		
		k = s1[l][l1];
		
		temp2[2] = k/2;
		temp2[3] = k%2;
	}
	// P4
	public void p4(){
		for(int i=0; i<4; i++){
			k = p4[i];
			temp3[i] = temp2[k-1];
		}
	}
	// P4_IP_4bit_XOR
	public void ipp4(){
		for(int i=0; i<4; i++){
			k = temp[i] + temp3[i];
			
			if(k==1)
				temp2[i] = 1;
			else
				temp2[i] = 0;
		}
	}
	// Switch
	public void sw(){
		for(int i=0; i<8; i++){
			if(i<4)
				temp[i] = temp[i+4];
			else
				temp[i] = temp2[i-4];
		}
	}
	// k2_XOR
	public void xor_k2(){
		for(int i=0; i<8; i++){
			k = k2[i] + temp2[i];
	
			if(k==1)
				temp3[i] = 1;
			else
				temp3[i] = 0;
		}
	}
	// IP-1
	public void ip_1(){
		for(int i=0; i<4; i++){
			temp[i] = temp2[i];
		}
		
		for(int i=0; i<8; i++){
			k = ip1[i];
			temp3[i] = temp[k-1];
		}
	}
}
