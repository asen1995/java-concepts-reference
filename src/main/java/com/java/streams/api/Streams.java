package com.java.streams.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.model.Book;

public class Streams {

	public static void iterate() {
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		Object[] array = streamIterated.toArray();

	}

	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

	public Stream<String> streamOfCollection() {
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		return streamOfCollection;
	}

	public Stream<String> streamOfCollectionBuilder() {
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		return null;
	}

	public Stream<String> differentFilteringExamples() {

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "a1", "a2");

		System.out.println("start with c:");
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("to UpperCase:");
		myList.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println();
		System.out.println("to ends with 1:");
		myList.stream().sorted().filter(s -> s.endsWith("1")).forEach(System.out::println);

		System.out.println();
		System.out.println("find first");
		Optional<String> findFirst = myList.stream().findFirst();
		if (findFirst.isPresent())
			System.out.println(findFirst.get());
		else
			System.out.println("no find first");

		System.out.println();
		System.out.println("distinct");
		myList.stream().distinct().forEach(System.out::println);

		System.out.println();
		System.out.println("concatenate Asen to every String");
		myList.stream().map(s -> s.concat("asen")).forEach(System.out::println);

		List<Book> books = Arrays.asList(new Book("kniga1", 2014, "sd"), new Book("kniga2", 2015, "sd"),
				new Book("kniga2", 2066, "sd"));

		System.out.println();
		System.out.println("List to Map");
		Map<Integer, String> booksmap = books.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName));
		System.out.println(booksmap);

		System.out.println();
		System.out.println("to Set");
		Set<Book> setbooks = books.stream().collect(Collectors.toSet());
		System.out.println(setbooks);

		System.out.println();
		System.out.println("find atleast one");
		Stream<String> sampleStream = Stream.of("d2", "a2", "b1", "b3", "c");

		String result = sampleStream.filter(string -> string.equalsIgnoreCase("b14")).findAny().orElse(null);
		System.out.println(result);

		List<String> anotherList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "a1", "a2");

		System.out.println();
		System.out.println("create another list with specific strings - contains 1");

		List<String> anotherList2 = anotherList.stream().filter(string -> string.contains("1")).sorted()
				.collect(Collectors.toList());
		System.out.println(anotherList2);

		return myList.stream();
	}

}