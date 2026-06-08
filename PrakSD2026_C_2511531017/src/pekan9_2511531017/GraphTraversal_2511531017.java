package pekan9_2511531017;
import java.util.*;
public class GraphTraversal_2511531017 {
	private Map<String, List<String>> graph_1017 = new HashMap<>();
	
	public void addEdge_1017 (String node1_1017, String node2_1017) {
		graph_1017.putIfAbsent(node1_1017, new ArrayList<>());
		graph_1017.putIfAbsent(node2_1017, new ArrayList<>());
		graph_1017.get(node1_1017).add(node2_1017);
		graph_1017.get(node2_1017).add(node1_1017);
	}
	public void printGraph_1017() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node_1017 : graph_1017.keySet()) {
			System.out.print(node_1017 + " -> ");
			List<String> neighbors_1017 = graph_1017.get(node_1017);
			System.out.println(String.join(",",neighbors_1017));
		}
		System.out.println();
	}
	public void dfs_1017(String start_1017) {
		Set<String> visited_1017 = new HashSet<>();
		System.out.println("Penelusuran DFS:");
		dfsHelper_1017 (start_1017, visited_1017);
		System.out.println();
	}
	private void dfsHelper_1017(String current_1017, Set<String> visited_1017) {
		if (visited_1017.contains(current_1017)) return;
		visited_1017.add(current_1017);
		System.out.print(current_1017 + " ");
		for (String neighbor_1017 : graph_1017.getOrDefault(current_1017, new ArrayList<>())) {
			dfsHelper_1017(neighbor_1017, visited_1017);
		}
	}
	public void bfs_1017(String start_1017) {
		Set<String> visited_1017 = new HashSet<>();
		Queue<String> queue_1017 = new LinkedList<>();
		queue_1017.add(start_1017);
		visited_1017.add(start_1017);
		System.out.println("Penulusuran BFS:");
		while (!queue_1017.isEmpty()) {
			String current_1017 = queue_1017.poll();
			System.out.print(current_1017 + " ");
			for (String neighbor_1017 : graph_1017.getOrDefault(current_1017, new ArrayList<>())) {
				if (!visited_1017.contains(neighbor_1017)) {
					queue_1017.add(neighbor_1017);
					visited_1017.add(neighbor_1017);
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphTraversal_2511531017 graph_1017 = new GraphTraversal_2511531017();
		
		graph_1017.addEdge_1017("A", "B");
		graph_1017.addEdge_1017("A", "C");
		graph_1017.addEdge_1017("B", "D");
		graph_1017.addEdge_1017("B", "E");
		System.out.println("Graf Awal adalah: ");
		graph_1017.printGraph_1017();
		graph_1017.dfs_1017("A");
		graph_1017.bfs_1017("B");

	}

}