package com.teja.fp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class OddNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {

		return t % 2 == 0;
	}

}

class forEach<T> implements Consumer<T> {

	@Override
	public void accept(T t) {
		System.out.println(t);

	}

}

class squareApply implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {

		return t * t;
	}

}

public class FpBehinftheScenes {

	public static void main(String[] args) {

		List<Integer> listOfCubes = new ArrayList<>();

		List<Integer> listinteger = List.of(1, 2, 3, 4, 5, 11, 14);
		List<Double> listdouble = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 11.0, 14.0);
		listinteger.stream().filter(new OddNumberPredicate()).map(new squareApply()).forEach(new forEach<Integer>());
		listdouble.stream().forEach(new forEach<>());

	}

}
