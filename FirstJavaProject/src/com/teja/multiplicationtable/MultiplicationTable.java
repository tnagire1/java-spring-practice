package com.teja.multiplicationtable;

public class MultiplicationTable {

	public void multiplicationTablePrint() {
		multiplicationTablePrint(5);

	}

	public void multiplicationTablePrint(int n) {
		multiplicationTablePrint(n, 1, 10);
	}

	public void multiplicationTablePrint(int n, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("%d * %d = %d", n, i, n * i).println();
		}
	}

}
