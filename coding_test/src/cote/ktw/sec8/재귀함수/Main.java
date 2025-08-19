package cote.ktw.sec8.재귀함수;

import java.util.*;

public class Main {
	
	public void dfs(int n) {
		
		if (n == 0) return; // n = 3 -> 2 -> 1 -> 0 
		else { 
//			System.out.print(n); // n = 3 -> 2 -> 1
			dfs(n-1); // dfs(2) -> dfs(1) -> dfs(0)
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Main sol = new Main();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sol.dfs(n);
		
	}
}
