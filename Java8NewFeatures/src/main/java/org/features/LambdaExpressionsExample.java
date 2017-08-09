package org.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

@FunctionalInterface // Lambda expression with return keyword
interface Sayable1{
	String say(String name);
}

@FunctionalInterface // Lambda expression without return keyword
interface Sayable2{
	String say(String name);
}
public class LambdaExpressionsExample {
	
	public static int sumAll(List<Integer> numbers,Predicate<Integer> p){
		int total = 0;
		for(int num: numbers){
			
			if(p.test(num)){
				total+=num;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		
		Sayable1 sayable1 = (name) ->{
			return "Hello " + name;
		};
		
		System.out.println(sayable1.say("Sreeni"));
		
		Sayable2 sayable2 = (name) ->("Hello " +name);
		
		System.out.println(sayable2.say("Sreenivas"));
		
		
		List<Integer> numbers = Arrays.asList(1, 6, 3, 4, 5, 2,6);
		
		sumAll(numbers,n -> true);
		System.out.println(sumAll(numbers,n -> n % 2 == 0 ));
			
		Integer[] arr = (Integer[]) numbers.toArray();
		
		Arrays.sort(arr, (Integer m,Integer n) -> n - m);
		
				
		Arrays.asList(arr).forEach(m -> System.out.println("Number::" + m));
		
		Stream<Integer> stream = numbers.stream().sorted((m,n) -> n - m);
		stream.forEach(n -> System.out.println("Item::" + n));
		
		numbers.stream().sorted((m,n) -> n - m)
						.filter(n -> n > 2)
						.distinct()
		                .forEach(n -> System.out.println("Direct Iteration ::" + n));

	}

}
