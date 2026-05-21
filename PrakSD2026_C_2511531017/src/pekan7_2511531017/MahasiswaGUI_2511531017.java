package pekan7_2511531017;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MahasiswaGUI_2511531017 extends JFrame {

    private ArrayList<Mahasiswa_2511531017> data_1017 = new ArrayList<>();
    private JTextField namaField_1017;
    private JTextField nimField_1017;
    private JTextField prodiField_1017;
    private JButton tambahButton_1017;
    private JButton hapusButton_1017;
    private JButton sortingButton_1017;
    private JButton langkahButton_1017;
    private JButton resetButton_1017;
    private JComboBox<String> comboSorting_1017;
    private JTable table_1017;
    private DefaultTableModel model_1017;
    private JTextArea prosesArea_1017;

    private int i_1017 = 0;
    private int j_1017 = 0;
    private boolean sorting_1017 = false;

    public MahasiswaGUI_2511531017() {
        setTitle("Sorting Mahasiswa 2511531017");
        setSize(950, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel_1017 = new JPanel(new FlowLayout());
        namaField_1017 = new JTextField(10);
        nimField_1017 = new JTextField(10);
        prodiField_1017 = new JTextField(10);

        tambahButton_1017 = new JButton("Tambah");
        hapusButton_1017 = new JButton("Hapus");
        sortingButton_1017 = new JButton("Mulai Sorting");
        langkahButton_1017 = new JButton("Langkah Selanjutnya");
        resetButton_1017 = new JButton("Reset");

        langkahButton_1017.setEnabled(false);
        comboSorting_1017 = new JComboBox<>();
        comboSorting_1017.addItem("Insertion Sort");
        comboSorting_1017.addItem("Selection Sort");
        comboSorting_1017.addItem("Bubble Sort");

        inputPanel_1017.add(new JLabel("Nama"));
        inputPanel_1017.add(namaField_1017);
        inputPanel_1017.add(new JLabel("NIM"));
        inputPanel_1017.add(nimField_1017);
        inputPanel_1017.add(new JLabel("Prodi"));
        inputPanel_1017.add(prodiField_1017);
        
        inputPanel_1017.add(tambahButton_1017);
        inputPanel_1017.add(hapusButton_1017);
        inputPanel_1017.add(comboSorting_1017);
        inputPanel_1017.add(sortingButton_1017);
        inputPanel_1017.add(langkahButton_1017);
        inputPanel_1017.add(resetButton_1017);

        add(inputPanel_1017, BorderLayout.NORTH);

        model_1017 = new DefaultTableModel();
        model_1017.addColumn("Nama");
        model_1017.addColumn("NIM");
        model_1017.addColumn("Prodi");
        
        table_1017 = new JTable(model_1017);
        JScrollPane tableScroll_1017 = new JScrollPane(table_1017);
        add(tableScroll_1017, BorderLayout.CENTER);
        prosesArea_1017 = new JTextArea();
        prosesArea_1017.setEditable(false);
        JScrollPane prosesScroll_1017 = new JScrollPane(prosesArea_1017);
        add(prosesScroll_1017, BorderLayout.EAST);

        tambahButton_1017.addActionListener(e -> tambahData_1017());
        hapusButton_1017.addActionListener(e -> hapusData_1017());
        sortingButton_1017.addActionListener(e -> mulaiSorting_1017());
        langkahButton_1017.addActionListener(e -> langkahSorting_1017());
        resetButton_1017.addActionListener(e -> reset_1017());
    }

    private void tambahData_1017() {
        String nama_1017 = namaField_1017.getText();
        String nim_1017 = nimField_1017.getText();
        String prodi_1017 = prodiField_1017.getText();
        if (nama_1017.isEmpty()||nim_1017.isEmpty()||prodi_1017.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Input tidak boleh kosong!");
            return;
        }

        Mahasiswa_2511531017 mhs_1017 = new Mahasiswa_2511531017(nama_1017,nim_1017,prodi_1017);
        data_1017.add(mhs_1017);
        model_1017.addRow(new Object[]{nama_1017,nim_1017,prodi_1017
        });

        namaField_1017.setText("");
        nimField_1017.setText("");
        prodiField_1017.setText("");
    }

    private void hapusData_1017() {
        int row_1017 = table_1017.getSelectedRow();
        if (row_1017 >= 0) {
            data_1017.remove(row_1017);
            model_1017.removeRow(row_1017);
        } else {
            JOptionPane.showMessageDialog(this,"Pilih data yang ingin dihapus!");
        }
    }

    private void mulaiSorting_1017() {
        i_1017 = 0;
        sorting_1017 = true;
        prosesArea_1017.setText("");
        langkahButton_1017.setEnabled(true);
        JOptionPane.showMessageDialog(this,"Klik tombol Langkah Selanjutnya");
    }

    private void langkahSorting_1017() {
        String pilihan_1017 = comboSorting_1017.getSelectedItem().toString();
        if (pilihan_1017.equals("Insertion Sort")) {
        	langkahInsertion_1017();
        } else if (pilihan_1017.equals("Selection Sort")) {
            langkahSelection_1017();
        } else {
            langkahBubble_1017();
        }
        refreshTable_1017();
    }
    private void langkahInsertion_1017() {
        prosesArea_1017.append( "=== INSERTION SORT ===\n");
        if (i_1017 < data_1017.size()) {
            Mahasiswa_2511531017 key_1017 = data_1017.get(i_1017);
            j_1017 = i_1017 - 1;
            while (j_1017 >= 0 && data_1017.get(j_1017).getNama_1017().compareToIgnoreCase(key_1017.getNama_1017()) > 0) {
                data_1017.set(j_1017 + 1,data_1017.get(j_1017));
                j_1017--;
            }
            data_1017.set(j_1017 + 1,key_1017);
            prosesArea_1017.append("Langkah "+ i_1017+ " : "+ data_1017+ "\n");
            i_1017++;
        } else {
            selesai_1017();
        }
    }

    private void langkahSelection_1017() {
        prosesArea_1017.append("=== SELECTION SORT ===\n");
        if (i_1017 < data_1017.size()) {
            int minIndex_1017 = i_1017;
            for (int j_1017 = i_1017 + 1;j_1017 < data_1017.size();j_1017++) {
                if (data_1017.get(j_1017).getNama_1017().compareToIgnoreCase(data_1017.get(minIndex_1017).getNama_1017()) < 0) {
                    minIndex_1017 = j_1017;
                }
            }
            Mahasiswa_2511531017 temp_1017 = data_1017.get(i_1017);
            data_1017.set(i_1017,data_1017.get(minIndex_1017));
            data_1017.set(minIndex_1017,temp_1017);
            prosesArea_1017.append( "Pass "+ (i_1017 + 1)+ " : "+ data_1017+ "\n");
            i_1017++;
        } else {
            selesai_1017();
        }
    }

    private void langkahBubble_1017() {
        prosesArea_1017.append( "=== BUBBLE SORT ===\n");
        if (i_1017 < data_1017.size()) {
            for (int j_1017 = 0;j_1017 < data_1017.size()- i_1017 - 1;j_1017++) {
                if (data_1017.get(j_1017).getNama_1017().compareToIgnoreCase( data_1017.get(j_1017 + 1).getNama_1017()) > 0) {
                    Mahasiswa_2511531017 temp_1017 = data_1017.get(j_1017);
                    data_1017.set(j_1017, data_1017.get(j_1017 + 1));
                    data_1017.set(j_1017 + 1,temp_1017);
                }
            }
            prosesArea_1017.append("Pass "+ (i_1017 + 1)+ " : "+ data_1017+ "\n");
            i_1017++;
        } else {
            selesai_1017();
        }
    }

    private void selesai_1017() {
        sorting_1017 = false;
        langkahButton_1017.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Sorting selesai!");
    }

    private void refreshTable_1017() {
        model_1017.setRowCount(0);
        for (Mahasiswa_2511531017 mhs_1017: data_1017) {
            model_1017.addRow(new Object[]{
                    mhs_1017.getNama_1017(),
                    mhs_1017.getNim_1017(),
                    mhs_1017.getProdi_1017()
            });
        }
    }

    private void reset_1017() {
        data_1017.clear();
        model_1017.setRowCount(0);
        prosesArea_1017.setText("");
        namaField_1017.setText("");
        nimField_1017.setText("");
        prodiField_1017.setText("");
        langkahButton_1017.setEnabled(false);
        i_1017 = 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MahasiswaGUI_2511531017 gui_1017 = new MahasiswaGUI_2511531017();
            gui_1017.setVisible(true);
        });
    }
}
