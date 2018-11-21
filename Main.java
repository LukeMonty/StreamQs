package streamExercises;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	
	static List<String> listOfStrings = Arrays.asList("Hello","it's","Luke");
	static List<String> listOfCapitals;
	static List<Integer> listOfNumbers = Arrays.asList(10, 7, 3, 9, 1, 123, 179, 16, 13, 11, 181);
	static List<Integer> primeNumberInOrder;
	static List<String> listOfWords = Arrays.asList("Hello","it's","Luke");
	static String sentence;
	
	static List<Integer> evenSum = Arrays.asList(1,2,3,4,5,6,7,8,9);
	static int sumOfEven;
	int num;
	String one, two;
	
	public static void main(String[] args) {
		
		capitaliseWords();
		findPrimeNumbers();
		listIntoString();
		sumOfEvenNumbers();
		
	}
	
	public static void capitaliseWords() {
		
		listOfCapitals = listOfStrings.stream()
				.map(word -> word.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(listOfCapitals);
		
	}
	
	public static void findPrimeNumbers() {
		
		primeNumberInOrder = listOfNumbers.stream()
				.filter(number -> isPrime(number))
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(primeNumberInOrder);
	}
	
	public static boolean isPrime(int num) {
		
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
		
	}
	
	public static void listIntoString() {
		
		sentence = listOfWords.stream().collect(Collectors.joining(" "));
		System.out.println(sentence);
	}
	
	public static void sumOfEvenNumbers() {
		
		sumOfEven = evenSum.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(sumOfEven);
	}
	
}
