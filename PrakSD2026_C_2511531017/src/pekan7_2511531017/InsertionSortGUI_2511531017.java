package pekan7_2511531017;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511531017 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_1017;
	private JLabel[] labelArray_1017;
	JButton stepButton_1017;
	private JButton resetButton_1017;
	JButton setButton_1017;
	private JTextField inputField_1017;
	private JPanel panelArray_1017;
	private JTextArea stepArea_1017;
	
	private int i_1017 = 1, j_1017;
	private boolean sorting_1017 =false;
	private int stepCount_1017 = 1;

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511531017() {
		setTitle("Isertion Sort Langakh per Langkah");
		setSize(750,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel inputPanel_1017 = new JPanel(new FlowLayout());
		inputField_1017 = new JTextField(30);
        setButton_1017 = new JButton("Set Array");
        inputPanel_1017.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_1017.add(inputField_1017);
        inputPanel_1017.add(setButton_1017);
        
        panelArray_1017 = new JPanel();
        panelArray_1017.setLayout(new FlowLayout());
        
        JPanel controlPanel_3023 = new JPanel();
        stepButton_1017 = new JButton ("Langkah Selanjutnya ");
        resetButton_1017 = new JButton ("Reset");
        stepButton_1017.setEnabled(false);
        controlPanel_3023.add(stepButton_1017);
        controlPanel_3023.add(resetButton_1017);
        
        stepArea_1017 = new JTextArea(8, 60);
        stepArea_1017.setEditable(false);
        stepArea_1017.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_1017);

        add(inputPanel_1017, BorderLayout.NORTH);
        add(panelArray_1017, BorderLayout.CENTER);
        add(controlPanel_3023, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        setButton_1017.addActionListener(e -> setArrayFromInput_1017());
        stepButton_1017.addActionListener(e -> performStep_1017());
        resetButton_1017.addActionListener(e -> reset_1017());
       

	}


	private void setArrayFromInput_1017() {
		String text_1017 = inputField_1017.getText().trim();
		if(text_1017.isEmpty()) return;
		String[]  parts_1017 = text_1017.split(",");
		array_1017 = new int [parts_1017.length];
		try {
			for (int k = 0; k < parts_1017.length; k++) {
				array_1017[k] = Integer.parseInt(parts_1017[k].trim());}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukan hanya angka dipisahkan "+ "dengan koma!", "Error",
						JOptionPane.ERROR_MESSAGE);
				return; }
		i_1017 = 1;
		stepCount_1017 = 1;
		sorting_1017 = true;
		stepButton_1017.setEnabled(true);
		stepArea_1017.setText("");
		panelArray_1017.removeAll();
		labelArray_1017 = new JLabel [array_1017.length];
		for (int k = 0; k < array_1017.length; k++) {
			labelArray_1017[k] = new JLabel(String.valueOf(array_1017[k]));
			labelArray_1017[k].setFont(new Font("Arial",Font.BOLD,24));
			labelArray_1017[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1017[k].setPreferredSize(new Dimension (50,50));
			labelArray_1017[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1017.add(labelArray_1017[k]);
			}
		panelArray_1017.revalidate();
		panelArray_1017.repaint();
		
	}
	private void performStep_1017() {
		if (i_1017 < array_1017.length && sorting_1017) {
			int key_1017 = array_1017[i_1017];
			j_1017 = i_1017 - 1;
			
			StringBuilder stepLog_1017 = new StringBuilder();
			stepLog_1017.append("Langkah").append(stepCount_1017).append(": Memasukkan ").append(key_1017).append("\n");
			
			while (j_1017 >= 0 && array_1017[j_1017] > key_1017) {
				array_1017[j_1017 + 1] = array_1017[j_1017];
				j_1017--;
			}
			array_1017[j_1017 + 1] = key_1017;
			
			updateLabels_1017();
			stepLog_1017.append("Hasil: ").append(arrayToString_1017(array_1017)).append("\n\n");
			
			i_1017++;
			stepCount_1017++;
			
			if (i_1017 == array_1017.length) {
				sorting_1017 = false;
				stepButton_1017.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
			
			}
		}
	private void updateLabels_1017() {
		for (int k = 0; k < array_1017.length; k++) {
			labelArray_1017[k].setText(String.valueOf(array_1017[k]));
		}
	}
	
	private void reset_1017() {
		inputField_1017.setText("");
		panelArray_1017.removeAll();
		panelArray_1017.revalidate();
		panelArray_1017.repaint();
		stepArea_1017.setText("");
		stepButton_1017.setEnabled(false);
		sorting_1017 = false;
		i_1017 = 1;
		stepCount_1017 = 1;
	}
	
	private String arrayToString_1017(int[] arr_1017) {
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < arr_1017.length; k++) {
			sb.append(arr_1017[k]);
			if (k < arr_1017.length - 1) sb.append(", ");
		}
		return sb.toString();
	}
	public static void main(String [] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionSortGUI_2511531017 gui_1017 = new InsertionSortGUI_2511531017();
			gui_1017.setVisible(true);
		});
	}
	}