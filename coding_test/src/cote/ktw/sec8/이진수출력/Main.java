package cote.ktw.sec8.이진수출력;

import java.util.*;

public class Main {
	
	public void dfs(int n) {
		if (n == 0) return;
		else {
			dfs(n/2);
			System.out.print(n%2 + " ");
		}
	}
	
	public static void main(String[] args) {	
		Main sol = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sol.dfs(n);
	}
	
}
