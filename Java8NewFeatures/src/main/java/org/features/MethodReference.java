package org.features;

@FunctionalInterface
// For static method reference
interface Talkable1 {
	String talk(String name);
}

@FunctionalInterface
// For static method reference
interface Talkable2 {
	String talk(String name);
}

public class MethodReference {

	// static method reference
	public static String saySomething1(String name) {

		return "Hello " + name;
	}

	// non-static method reference
	public String saySomething2(String name) {

		return "Hello " + name;
	}

	public static void main(String[] args) {

		// Method reference for Static Method
		Talkable1 talk1 = MethodReference::saySomething1;
		System.out.println(talk1.talk("Sreeni"));

		Talkable2 talk2 = new MethodReference()::saySomething2;
		System.out.println(talk2.talk("Sreenivas"));

	}

}
