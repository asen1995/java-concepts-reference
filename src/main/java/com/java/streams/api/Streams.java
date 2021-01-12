package com.java.streams.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

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
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		return null;
	}

	
}