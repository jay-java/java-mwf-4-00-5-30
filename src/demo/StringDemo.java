package demo;

public class StringDemo {
	public static void main(String[] args) {
		String name = "TOPS technologies";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(12));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String name1="			 JAVA			";
		String name2="jAVA";
		System.out.println(name1.concat(name2));
		System.out.println(name1);
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareToIgnoreCase(name2));
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.isEmpty());
		System.out.println(name1);
		System.out.println(name1.trim());
	}
}
