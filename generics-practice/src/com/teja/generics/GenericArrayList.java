package com.teja.generics;

import java.util.ArrayList;

public class GenericArrayList<T> {

	ArrayList<T> list = new ArrayList<>();

	void addElement(T str) {
		list.add(str);
	}

	void removeElement(T str) {
		list.remove(str);
	}

	T getIndex(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return list.toString();
	}

}