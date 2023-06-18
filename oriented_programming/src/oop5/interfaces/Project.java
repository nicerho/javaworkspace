package oop5.interfaces;

public class Project {
	public static void main(String[] args) {
		ComplexAlogorithm algorithm = new RealAlgorithm();
		algorithm.complexAlgorithm(10, 20);
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}
}
