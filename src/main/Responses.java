package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import main.*;

public class Responses {

	public static void main(String[] args) throws ParseException, AgeCanNotBeNegativeException {
		// TODO Auto-generated method stub

		// 1.Write a program to iterate the HashMap ?(5)
		// Q1(hashmapSimple());

		// 2.Write a program to sort HashMap by keys ? (5)
		// Q2(hashmapSimple());

		// 3. Write a program to sort ArrayList in descending order?(5)
		// Q3a(listSample());
		// Q3b();

		// 4. Write a program to add element at particular index of ArrayList?(5)
		// Q4("addedfromQ4", listSample());

		// 5.Write a program to remove element from specified index of ArrayList?(5)
		// Q5(0,listSample());

		// 6.Write a program to convert LinkedList to ArrayList?(5)
		// Q6();

		// 7. Write a program to convert HashSet to Array? (5)
		// Q7();

		// Write a program to reverse ArrayList in java?(5)
		// Q8(listSample());

		// 9.Write a program to sort ArrayList using Comparable and Comparator?(5)
		// Q9aAndb();

		// 10.Write a program using StringBuilder/StringBuffer?(5)
		// Q10();

		// 11.Write a Difference between String, StringBuilder and StringBuffer?(4)
		// string is Immutable , whereas StringBuilder and StringBuffer mutable;

		// 12. What is the difference between List and set?(2)
		// List is an ordered collection whereas Set is an unordered collection
		// list allows duplicate entries whereas set doesn't allow duplicate entries
		// list allows multiple null values whereas set allows only one null value ;

		// 3. What is the difference between Array & ArrayList?(2)
		// arraylist has a dynamic length whereas array has a fixed length;

		// 14.What is the difference between HAshset and Treeset?(2)
		// HashSet allows null values. TreeSet doesn’t allow null values
		// HashSet are not ordered. TreeSet maintains order.

		// 15.Write a program to add the element and remove the element on both the
		// side?(5)
		// Q15();

		// 16.What is the difference between Comparable and Comparator? Explain using
		// short java programs.
		// Also list advantages and disadvantages of both.(5)
		// Comparable provides a single sorting sequence while Comparator provides
		// multiple sorting sequences.
		// Comparable provides compareTo() method to sort elements while Comparator
		// provides compare() method to sort elements.
		// see Q9aAndb();

		// 17.Write a class named Employee with fields name,age,salary,
		// joiningDate Write comparable to compare with age and Write comparators for
		// all other fields(5)
		// Q9aAndb();

		// 18.write a program that would compress the length of string, and compare the
		// length of the compressed string to the input string and return whichever one
		// is smaller.
		// Example would be: input string "aaabcccc" would be compressed to "a3b1c4".(5)
		// Q18();

		// 19.Format the input by using Scanner (5)
		// Q19();

		// 20. Convert Roman number into Integer (10)
		// Q20();

		// 21 customer Exception
		Q21();

	}// end main

	public static Map<Integer, String> hashmapSimple() {
		Map<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(1, "val1");
		hs.put(3, "val3");
		hs.put(4, "val4");
		hs.put(2, "val2");

		return hs;

	}// end hashmapSimple

	public static List<String> listSample() {

		ArrayList<String> ls = new ArrayList<String>();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");

		return ls;
	}// end listSample

	public static void Q1(Map<Integer, String> hs) {

		Iterator<Entry<Integer, String>> it = hs.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			System.out.println("key : " + set.getKey() + " === value : " + set.getValue());

		}

	}// end Q1

	public static void Q2(Map<Integer, String> hs) {

		hs.keySet().stream().sorted().forEach(key -> {
			System.out.println("key : " + key + " === value : " + hs.get(key));
		});

	}// end Q2

	public static void Q3a(List<String> ls) {
		Collections.sort(ls, Collections.reverseOrder());

		Iterator<String> it = ls.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}// end Q3a

	public static void Q3b() {
		int sum = 0;
		float averege = 0;
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(14);
		ls.add(15);

		Iterator<Integer> it = ls.iterator();
		while (it.hasNext()) {
			sum = sum + it.next();
		}

		System.out.println("Average list :" + sum / ls.size());

	}// end Q3b

	public static void Q4(String str, List<String> ls) {

		ls.add(0, str);
		System.out.println(ls);

	}// end Q4

	public static void Q5(int index, List<String> ls) {

		ls.remove(index);
		System.out.println(ls);

	}// end Q5

	public static void Q6() {

		LinkedList<String> lklist = new LinkedList<String>();
		lklist.add("V1");
		lklist.add("V2");
		lklist.add("V3");
		lklist.add("V4");
		lklist.add("V5");

		List<String> list = new ArrayList<String>(lklist);
		System.out.println(list.getClass());
		System.out.println(list);

	}// end Q6

	public static void Q7() {

		HashSet<String> hset = new HashSet<String>();

		hset.add("V1");
		hset.add("V2");
		hset.add("V3");
		hset.add("V4");
		hset.add("V5");

		String[] arr = new String[hset.size()];
		hset.toArray(arr);

		for (String el : arr) {

			System.out.println(el);
		}

	}// end Q7

	public static void Q8(List<String> ls) {
		Collections.reverse(ls);
		System.out.println(ls);

	}// end Q8

	public static void Q9aAndb() throws ParseException {
		Employee emp1 = new Employee("name1", 34, 2000, new SimpleDateFormat("MM-dd-yyyy").parse("11-20-2020"));
		Employee emp2 = new Employee("name2", 30, 3300, new SimpleDateFormat("MM-dd-yyyy").parse("11-20-2021"));
		Employee emp3 = new Employee("name3", 31, 4000, new SimpleDateFormat("MM-dd-yyyy").parse("11-20-2022"));
		Employee emp4 = new Employee("name4", 25, 5000, new SimpleDateFormat("MM-dd-yyyy").parse("11-20-2023"));

		List<Employee> lstoSortByAge = new ArrayList<Employee>();
		lstoSortByAge.add(emp2);
		lstoSortByAge.add(emp3);
		lstoSortByAge.add(emp1);
		lstoSortByAge.add(emp4);

		Collections.sort(lstoSortByAge);
		System.out.println(lstoSortByAge);

		List<Employee> ls = new ArrayList<Employee>();
		ls.add(emp2);
		ls.add(emp3);
		ls.add(emp1);
		ls.add(emp4);

		Collections.sort(ls, new NameSorter());
		System.out.println(ls);

		Collections.sort(ls, new SalarySorter());
		System.out.println(ls);

		Collections.sort(ls, new DateSorter());
		System.out.println(ls);

	}// end Q9aAndb

	public static void Q10() {

		String str1 = "Hello!";
		str1.concat("World");
		// str1=str1 + "Quantum";
		// System.out.println(str1);
		System.out.println("The final String ....! " + str1);

		StringBuffer str2 = new StringBuffer("Hello");
		str2.append(" world");
		System.out.println("The final String ....! " + str2);

		StringBuilder str3 = new StringBuilder("Hello");
		str3.append(" world");
		System.out.println("The final String ....! " + str3);

	}// end Q10

	public static void Q15() {

		LinkedList<String> lkList = new LinkedList<>();

		lkList.add("V1");
		lkList.add("V2");
		lkList.add("V3");
		lkList.add("V4");
		lkList.add("V5");

		lkList.addFirst("First");
		lkList.addLast("End");

		System.out.println(lkList);

		lkList.removeFirst();
		lkList.removeLast();

		System.out.println(lkList);

	}// end Q15

	public static void Q18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Compress :");
		String input = sc.next();

		StringBuilder stringBuilder = new StringBuilder();
		char[] charArray = input.toCharArray();
		int count = 1;
		char lastChar = 0;
		char nextChar = 0;
		lastChar = charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			nextChar = charArray[i];
			if (lastChar == nextChar) {
				count++;
			} else {
				stringBuilder.append(count).append(lastChar);
				count = 1;
				lastChar = nextChar;
			}
		}
		stringBuilder.append(count).append(lastChar);
		String compressed = stringBuilder.toString();
		System.out.println(compressed);

		String msg = (compressed.length() > input.length()) ? "compressed String is long than original"
				: "original String is long than compressed";
		System.out.println(msg);

	} // end of Q18

	public static void Q19() {

		String s1;
		int s2, spaceLenght = 0;

		String input1 = getInput();
		String input2 = getInput();
		String input3 = getInput();

		String[] tableStrings = { input1, input2, input3 };

		System.out.println("================================================");

		for (String Str : tableStrings) {

			String[] strpart = Str.split(" ", 2);
			s1 = strpart[0].trim();
			spaceLenght = 10 - (s1.length());
			s2 = Integer.parseInt(strpart[1].trim());

			System.out.format("%s", s1);

			for (int i = 0; i <= spaceLenght; i++) {
				System.out.print(" ");
			}

			System.out.format("%03d%n", s2);

		}

		System.out.println("================================================");

	}// end Q19

	private static String getInput() {
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		System.out.flush();

		try {
			return st.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}// end getInput

	private static void Q20() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman Number in Uppercase :");
		String input = sc.next();

		switch (input) {
		case ("I"):
			System.out.println(1);
			break;
		case ("V"):
			System.out.println(5);
			break;
		case ("X"):
			System.out.println(10);
			break;
		case ("L"):
			System.out.println(50);
			break;
		case ("C"):
			System.out.println(100);
			break;
		case ("D"):
			System.out.println(500);
			break;
		default:
			System.out.println("Invalid");

		}
	}// end of Q20

	public static void Q21() throws AgeCanNotBeNegativeException {
		// Customer(String name, int age, String ssn, String address, String city, long
		// zipcode)
		Customer c ;
		int age =23;
		if(age<0) throw new AgeCanNotBeNegativeException();
		else c = new Customer("Mohammed", age, "444-44-2345", "adresss", "city", 20712);

		System.out.println(c);

	}// end of Q21()

}// end Responses class
