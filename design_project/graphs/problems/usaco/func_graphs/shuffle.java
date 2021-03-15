//created by Tanish Tyagi
import java.util.*;
import java.io.*;

public class shuffle {

	public static int n;
	public static int[] parent;
	public static int[] currStatus; // 0 is not-visited, 1 is visited, 2 is part of cycle

	public static void count(int i) {
		HashSet<Integer> there = new HashSet<Integer>();
		while (currStatus[i] == 0) {
			there.add(i);
			currStatus[i] = 1;
			i = parent[i];
		}

		//cycle is found, mark all nodes that are part of cycle
		if (there.contains(i)) {
			int savei = i;
			do {
				currStatus[i] = 2;
				i = parent[i];
			} while (i != savei);
		}
	}

	public static void main(String[] args) throws Exception {
		// Read in the parenting array.
		BufferedReader stdin = new BufferedReader(new FileReader("shuffle.in"));
		StringTokenizer tok = new StringTokenizer(stdin.readLine());
		n = Integer.parseInt(tok.nextToken());
		StringTokenizer line = new StringTokenizer(stdin.readLine());
		
		parent = new int[n];
		for (int i=0; i<n; i++)
			parent[i] = Integer.parseInt(line.nextToken())-1;

		currStatus = new int[n];
		for (int i=0; i<n; i++)
			if (currStatus[i] == 0)
				count(i);

		// get length of cycle and return
		int res = 0;
		for (int i=0; i<n; i++)
			if (currStatus[i] == 2)
				res++;
		System.out.println(res);
		stdin.close();
	}	
}