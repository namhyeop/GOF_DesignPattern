package com.example.designpattern.bookExampleCode.designpatterns.iterator.implicit;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
