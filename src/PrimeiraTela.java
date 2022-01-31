import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.DropMode;

public class PrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField cx1;
	private JTextField cx2;
	private JTextField cxresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
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
	public PrimeiraTela() {
		setResizable(false);
		setTitle("Opera\u00E7\u00F5es matem\u00E1ticas b\u00E1sicas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 569, 396);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o primeiro n\u00FAmero:");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel.setBounds(80, 82, 213, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o segundo n\u00FAmero:");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel_1.setBounds(80, 132, 200, 22);
		panel.add(lblNewLabel_1);
		
		cx1 = new JTextField();
		cx1.setForeground(Color.DARK_GRAY);
		cx1.setFont(new Font("Poppins", Font.BOLD, 12));
		cx1.setToolTipText("");
		cx1.setBackground(Color.WHITE);
		cx1.setBounds(294, 83, 186, 22);
		panel.add(cx1);
		cx1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//limpar as caixas de texto
				cx1.setText(" ");
				cx2.setText(" ");
				cxresultado.setText(" ");
				
				//voltar cursor do mouse
				cx1.requestFocus();
			}
		});
		btnNewButton_1.setFont(new Font("Poppins", Font.BOLD, 12));
		btnNewButton_1.setBounds(162, 246, 252, 31);
		panel.add(btnNewButton_1);
		
		cx2 = new JTextField();
		cx2.setFont(new Font("Poppins", Font.BOLD, 12));
		cx2.setBackground(Color.WHITE);
		cx2.setBounds(294, 133, 186, 22);
		panel.add(cx2);
		cx2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(0, 0, 569, 60);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Calculadora");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 0, 569, 60);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Poppins", Font.BOLD, 18));
		
		JButton btnsoma = new JButton("Soma");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1;
				double numero2;
				double resposta;
				
				if((cx1.getText().equals("") || cx2.getText().equals("")) || 
						(cx1.getText().equals(" ") || cx2.getText().equals(" "))){
					JOptionPane.showMessageDialog(null, "Campo vazio.", "ERRO: Campo vazio.",
							JOptionPane.ERROR_MESSAGE);
				} else {
					numero1 = Double.parseDouble(cx1.getText());
					numero2 = Double.parseDouble(cx2.getText());
					
					resposta = numero1 + numero2;
					cxresultado.setText(String.valueOf(resposta));
				}
			}
		});
		btnsoma.setFont(new Font("Poppins", Font.BOLD, 12));
		btnsoma.setBounds(31, 184, 121, 31);
		panel.add(btnsoma);
		
		JButton btnsub = new JButton("Subtra\u00E7\u00E3o");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1;
				double numero2;
				double resposta;
				
				if((cx1.getText().equals("") || cx2.getText().equals("")) || 
						(cx1.getText().equals(" ") || cx2.getText().equals(" "))) {
					JOptionPane.showMessageDialog(null, "Campo vazio.", "ERRO: Campo vazio.",
							JOptionPane.ERROR_MESSAGE);
				} else {
				numero1 = Double.parseDouble(cx1.getText());
				numero2 = Double.parseDouble(cx2.getText());
				
				resposta = numero1 - numero2;
				cxresultado.setText(String.valueOf(resposta));
				}
			}
		});
		btnsub.setFont(new Font("Poppins", Font.BOLD, 12));
		btnsub.setBounds(162, 184, 121, 31);
		panel.add(btnsub);
		
		JButton btnmulti = new JButton("Multiplica\u00E7\u00E3o");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1;
				double numero2;
				double resposta;
				
				if((cx1.getText().equals("") || cx2.getText().equals("")) || 
						(cx1.getText().equals(" ") || cx2.getText().equals(" "))) {
					JOptionPane.showMessageDialog(null, "Campo vazio.", "ERRO: Campo vazio.",
							JOptionPane.ERROR_MESSAGE);
				} else {
				numero1 = Double.parseDouble(cx1.getText());
				numero2 = Double.parseDouble(cx2.getText());
				
				resposta = numero1 * numero2;
				cxresultado.setText(String.valueOf(resposta));
				}
			}
		});
		btnmulti.setFont(new Font("Poppins", Font.BOLD, 12));
		btnmulti.setBounds(293, 184, 121, 31);
		panel.add(btnmulti);
		
		JButton btndiv = new JButton("Divis\u00E3o");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1;
				double numero2;
				double resposta;
				
				if((cx1.getText().equals("") || cx2.getText().equals("")) || 
						(cx1.getText().equals(" ") || cx2.getText().equals(" "))){
					JOptionPane.showMessageDialog(null, "Campo vazio.", "ERRO: Campo vazio.",
							JOptionPane.ERROR_MESSAGE);
				} else {
				numero1 = Double.parseDouble(cx1.getText());
				numero2 = Double.parseDouble(cx2.getText());
				
					if(numero1 <= 0 || numero2 <= 0) {
						JOptionPane.showMessageDialog(null, "Divisor inválido, tente novamente.", "ERRO: Número inválido.",
								JOptionPane.ERROR_MESSAGE);
						
						cx1.setText(" ");
						cx2.setText(" ");
						cxresultado.setText(" ");
						
						cx1.requestFocus();
					} else {
						resposta = numero1 / numero2;
						cxresultado.setText(String.valueOf(resposta));
					}
				}
			}
		});
		btndiv.setFont(new Font("Poppins", Font.BOLD, 12));
		btndiv.setBounds(424, 184, 121, 31);
		panel.add(btndiv);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(25, 25, 112));
		panel_2.setBounds(0, 300, 569, 95);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		cxresultado = new JTextField();
		cxresultado.setHorizontalAlignment(SwingConstants.CENTER);
		cxresultado.setBackground(new Color(25, 25, 112));
		cxresultado.setForeground(Color.WHITE);
		cxresultado.setFont(new Font("Poppins", Font.BOLD, 24));
		cxresultado.setBounds(293, 10, 250, 75);
		panel_2.add(cxresultado);
		cxresultado.setEditable(false);
		cxresultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(130, 2, 146, 93);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Poppins", Font.BOLD, 20));
	}
}
