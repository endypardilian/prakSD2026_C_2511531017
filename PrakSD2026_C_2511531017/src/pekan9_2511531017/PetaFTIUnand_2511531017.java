package pekan9_2511531017;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class PetaFTIUnand_2511531017 extends JFrame {

    private Map<String, Point> nodePositions_1017;
    private List<String> vertices_1017;
    private Map<String, List<String>> adjacencyList_1017;
    
    private JPanel visualizationPanel_1017;
    private JComboBox<String> startComboBox_1017;
    private JComboBox<String> goalComboBox_1017;
    private JTextArea resultArea_1017;
    private JLabel exploredCountLabel_1017;
    
    private List<String> path_1017;
    private List<String> visitedOrder_1017;
    private Set<String> visitedNodes_1017;
    private String algorithmUsed_1017 = "";

    public PetaFTIUnand_2511531017() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(1100, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initializeGraph_1017();
        initializeGUI_1017();
    }

    private void initializeGraph_1017() {
        vertices_1017 = Arrays.asList("Parkiran", "Pascasarjana", "Lab Teknik Komputer", "Lab Sistem Informasi", 
            "Seminar E", "PKM", "Dept Teknik Komputer", "Dept Sistem Informasi","Lab Informatika", "Lobby",
            "Dekanat", "Mushalla", "Dept Informatika");

        nodePositions_1017 = new HashMap<>();
        nodePositions_1017.put("Parkiran", new Point(350, 80));
        nodePositions_1017.put("Pascasarjana", new Point(120, 180));
        nodePositions_1017.put("Lab Teknik Komputer", new Point(350, 180));
        nodePositions_1017.put("Lab Sistem Informasi", new Point(580, 180));
        nodePositions_1017.put("Seminar E", new Point(800, 180));
        nodePositions_1017.put("PKM", new Point(120, 320));
        nodePositions_1017.put("Dept Teknik Komputer", new Point(350, 320));
        nodePositions_1017.put("Dept Sistem Informasi", new Point(580, 320));
        nodePositions_1017.put("Lab Informatika", new Point(800, 320));
        nodePositions_1017.put("Lobby", new Point(120, 480));
        nodePositions_1017.put("Dekanat", new Point(350, 480));
        nodePositions_1017.put("Mushalla", new Point(580, 480));
        nodePositions_1017.put("Dept Informatika", new Point(800, 480));
        
        adjacencyList_1017 = new HashMap<>();
        for (String v_1017 : vertices_1017) {
            adjacencyList_1017.put(v_1017, new ArrayList<>());
        }

        addEdge_1017("Parkiran", "Pascasarjana");
        addEdge_1017("Parkiran", "Lab Teknik Komputer");
        addEdge_1017("Pascasarjana", "PKM");
        addEdge_1017("Lab Teknik Komputer", "Dept Teknik Komputer");
        addEdge_1017("Lab Sistem Informasi", "Seminar E");
        addEdge_1017("Lab Sistem Informasi", "Dept Sistem Informasi");
        addEdge_1017("PKM", "Lobby");
        addEdge_1017("Dept Teknik Komputer", "Dept Sistem Informasi");
        addEdge_1017("Dept Teknik Komputer", "Dekanat");
        addEdge_1017("Dept Sistem Informasi", "Lab Informatika");
        addEdge_1017("Dept Sistem Informasi", "Mushalla");
        addEdge_1017("Lab Informatika", "Dept Informatika");
        addEdge_1017("Lab Informatika", "Seminar E");
        addEdge_1017("Lobby", "Dekanat");
        addEdge_1017("Dekanat", "Mushalla");
        addEdge_1017("Mushalla", "Dept Informatika");
    }
    
    private void addEdge_1017(String u_1017, String v_1017) {
        adjacencyList_1017.get(u_1017).add(v_1017);
        adjacencyList_1017.get(v_1017).add(u_1017); 
    }

    private void initializeGUI_1017() {
        setLayout(new BorderLayout());

        JPanel controlPanel_1017 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlPanel_1017.setBackground(new Color(240, 240, 240));
        
        startComboBox_1017 = new JComboBox<>(vertices_1017.toArray(new String[0]));
        goalComboBox_1017 = new JComboBox<>(vertices_1017.toArray(new String[0]));
        JButton btnBFS_1017 = new JButton("BFS");
        JButton btnDFS_1017 = new JButton("DFS");
        JButton btnReset_1017 = new JButton("RESET");
        
        btnBFS_1017.setBackground(new Color(70, 130, 180));
        btnBFS_1017.setForeground(Color.WHITE);
        btnDFS_1017.setBackground(new Color(34, 139, 34));
        btnDFS_1017.setForeground(Color.WHITE);
        btnReset_1017.setBackground(new Color(220, 20, 60));
        btnReset_1017.setForeground(Color.WHITE);
        
        controlPanel_1017.add(new JLabel("Lokasi Awal:"));
        controlPanel_1017.add(startComboBox_1017);
        controlPanel_1017.add(new JLabel("Lokasi Tujuan:"));
        controlPanel_1017.add(goalComboBox_1017);
        controlPanel_1017.add(btnBFS_1017);
        controlPanel_1017.add(btnDFS_1017);
        controlPanel_1017.add(btnReset_1017);
        add(controlPanel_1017, BorderLayout.NORTH);

        visualizationPanel_1017 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGraph_1017(g);
            }
        };
        visualizationPanel_1017.setBackground(Color.WHITE);
        add(visualizationPanel_1017, BorderLayout.CENTER);

        JPanel resultPanel_1017 = new JPanel(new BorderLayout());
        resultPanel_1017.setBorder(BorderFactory.createTitledBorder("Hasil Pencarian"));
        resultPanel_1017.setBackground(new Color(245, 245, 245));
        
        resultArea_1017 = new JTextArea();
        resultArea_1017.setEditable(false);
        resultArea_1017.setFont(new Font("Monospaced", Font.PLAIN, 13));
        resultArea_1017.setLineWrap(true);
        resultArea_1017.setWrapStyleWord(true);
        
        exploredCountLabel_1017 = new JLabel("Jumlah Node Dikunjungi: 0");
        exploredCountLabel_1017.setFont(new Font("Arial", Font.BOLD, 14));
        exploredCountLabel_1017.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        
        resultPanel_1017.add(new JScrollPane(resultArea_1017), BorderLayout.CENTER);
        resultPanel_1017.add(exploredCountLabel_1017, BorderLayout.EAST);

        resultPanel_1017.setPreferredSize(new Dimension(1000, 130));
        add(resultPanel_1017, BorderLayout.SOUTH);
        
        btnBFS_1017.addActionListener(e -> BFS_1017());
        btnDFS_1017.addActionListener(e -> DFS_1017());
        btnReset_1017.addActionListener(e -> resetGraph_1017());
    }

    public void displayGraph_1017() {
        visualizationPanel_1017.repaint();
    }
    
    private void drawGraph_1017(Graphics g) {
        Graphics2D g2d_1017 = (Graphics2D) g;
        g2d_1017.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d_1017.setColor(Color.LIGHT_GRAY);
        g2d_1017.setStroke(new BasicStroke(3));
        for (String u_1017 : adjacencyList_1017.keySet()) {
            Point p1_1017 = nodePositions_1017.get(u_1017);
            for (String v_1017 : adjacencyList_1017.get(u_1017)) {
                Point p2_1017 = nodePositions_1017.get(v_1017);
                g2d_1017.drawLine(p1_1017.x, p1_1017.y, p2_1017.x, p2_1017.y);
            }
        }

        if (path_1017 != null && path_1017.size() > 1) {
            g2d_1017.setColor(Color.RED);
            g2d_1017.setStroke(new BasicStroke(5));
            for (int i = 0; i < path_1017.size() - 1; i++) {
                Point p1_1017 = nodePositions_1017.get(path_1017.get(i));
                Point p2_1017 = nodePositions_1017.get(path_1017.get(i+1));
                g2d_1017.drawLine(p1_1017.x, p1_1017.y, p2_1017.x, p2_1017.y);
            }
            g2d_1017.setStroke(new BasicStroke(3));
        }

        int width_1017 = 130;
        int height_1017 = 50;
        
        for (String node_1017 : vertices_1017) {
            Point p_1017 = nodePositions_1017.get(node_1017);
            int x_1017 = p_1017.x - width_1017 / 2;
            int y_1017 = p_1017.y - height_1017 / 2;

            if (path_1017 != null && path_1017.contains(node_1017)) {
                g2d_1017.setColor(new Color(255, 100, 100));
            } else if (visitedNodes_1017 != null && visitedNodes_1017.contains(node_1017)) {
                g2d_1017.setColor(new Color(255, 220, 100)); 
            } else {
                g2d_1017.setColor(new Color(173, 216, 230));
            }

            g2d_1017.fillRoundRect(x_1017, y_1017, width_1017, height_1017, 10, 10);
            g2d_1017.setColor(Color.BLACK);
            g2d_1017.setStroke(new BasicStroke(2));
            g2d_1017.drawRoundRect(x_1017, y_1017, width_1017, height_1017, 10, 10);
            
            // Teks nama node
            FontMetrics fm_1017 = g2d_1017.getFontMetrics();
            int textWidth_1017 = fm_1017.stringWidth(node_1017);
            g2d_1017.drawString(node_1017, p_1017.x - textWidth_1017 / 2, p_1017.y + 5);
        }
    }

    public void BFS_1017() {
        String start_1017 = (String) startComboBox_1017.getSelectedItem();
        String goal_1017 = (String) goalComboBox_1017.getSelectedItem();
        
        if (start_1017.equals(goal_1017)) {
            resultArea_1017.setText("Lokasi awal dan tujuan sama!");
            return;
        }
        
        Queue<String> queue_1017 = new LinkedList<>();
        Map<String, String> parent_1017 = new HashMap<>();
        Set<String> visited_1017 = new LinkedHashSet<>();
        
        queue_1017.add(start_1017);
        visited_1017.add(start_1017);
        parent_1017.put(start_1017, null);
        
        boolean found_1017 = false;
        
        while(!queue_1017.isEmpty()) {
            String current_1017 = queue_1017.poll();
            if(current_1017.equals(goal_1017)) {
                found_1017 = true;
                break;
            }
            
            for(String neighbor_1017 : adjacencyList_1017.get(current_1017)) {
                if(!visited_1017.contains(neighbor_1017)) {
                    visited_1017.add(neighbor_1017);
                    parent_1017.put(neighbor_1017, current_1017);
                    queue_1017.add(neighbor_1017);
                }
            }
        }
        
        visitedOrder_1017 = new ArrayList<>(visited_1017);
        visitedNodes_1017 = visited_1017;
        exploredCountLabel_1017.setText("Jumlah Node Dikunjungi: " + visited_1017.size());
        algorithmUsed_1017 = "BFS";
        
        if(found_1017) {
            path_1017 = new ArrayList<>();
            String curr_1017 = goal_1017;
            while(curr_1017 != null) {
                path_1017.add(curr_1017);
                curr_1017 = parent_1017.get(curr_1017);
            }
            Collections.reverse(path_1017);
            displayPath_1017();
        } else {
            resultArea_1017.setText("Jalur tidak ditemukan!");
            path_1017 = null;
        }
        displayGraph_1017();
    }

    public void DFS_1017() {
        String start_1017 = (String) startComboBox_1017.getSelectedItem();
        String goal_1017 = (String) goalComboBox_1017.getSelectedItem();
        
        if (start_1017.equals(goal_1017)) {
            resultArea_1017.setText("Lokasi awal dan tujuan sama!");
            return;
        }
        
        Stack<String> stack_1017 = new Stack<>();
        Map<String, String> parent_1017 = new HashMap<>();
        Set<String> visited_1017 = new LinkedHashSet<>();
        
        stack_1017.push(start_1017);
        visited_1017.add(start_1017);
        parent_1017.put(start_1017, null);
        
        boolean found_1017 = false;
        
        while(!stack_1017.isEmpty()) {
            String current_1017 = stack_1017.pop();
            if(current_1017.equals(goal_1017)) {
                found_1017 = true;
                break;
            }
            
            for(String neighbor_1017 : adjacencyList_1017.get(current_1017)) {
                if(!visited_1017.contains(neighbor_1017)) {
                    visited_1017.add(neighbor_1017);
                    parent_1017.put(neighbor_1017, current_1017);
                    stack_1017.push(neighbor_1017);
                }
            }
        }
        
        visitedOrder_1017 = new ArrayList<>(visited_1017);
        visitedNodes_1017 = visited_1017;
        exploredCountLabel_1017.setText("Jumlah Node Dikunjungi: " + visited_1017.size());
        algorithmUsed_1017 = "DFS";
        
        if(found_1017) {
            path_1017 = new ArrayList<>();
            String curr_1017 = goal_1017;
            while(curr_1017 != null) {
                path_1017.add(curr_1017);
                curr_1017 = parent_1017.get(curr_1017);
            }
            Collections.reverse(path_1017);
            displayPath_1017();
        } else {
            resultArea_1017.setText("Jalur tidak ditemukan!");
            path_1017 = null;
        }
        displayGraph_1017();
    }

    public void displayPath_1017() {
        StringBuilder sb_1017 = new StringBuilder();
        sb_1017.append("Algoritma: ").append(algorithmUsed_1017).append("\n\n");
        sb_1017.append("Jalur:\n");
        if (path_1017 != null) {
            sb_1017.append(String.join(" -> ", path_1017)).append("\n\n");
        }
        sb_1017.append("Node Dikunjungi:\n");
        if (visitedOrder_1017 != null) {
            sb_1017.append(String.join(", ", visitedOrder_1017));
        }
        resultArea_1017.setText(sb_1017.toString());
    }

    public void resetGraph_1017() {
        path_1017 = null;
        visitedOrder_1017 = null;
        visitedNodes_1017 = null;
        algorithmUsed_1017 = "";
        exploredCountLabel_1017.setText("Jumlah Node Dikunjungi: 0");
        resultArea_1017.setText("");
        displayGraph_1017();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaFTIUnand_2511531017().setVisible(true);
        });
    }
}
