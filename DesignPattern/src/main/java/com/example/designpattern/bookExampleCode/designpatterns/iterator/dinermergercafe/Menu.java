package com.example.designpattern.bookExampleCode.designpatterns.iterator.dinermergercafe;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
