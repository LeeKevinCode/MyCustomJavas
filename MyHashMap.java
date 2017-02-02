package com.nexwah;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap<K, V> extends HashMap<K, V>{
	private static final long serialVersionUID = 1L;
	private static final char LEFT = '[';
	private static final char RIGHT = ']';
	private static final char COMMA = ',';
    
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(LEFT);
		for (Map.Entry<K, V> entry : this.entrySet()) {
// same as sb.append("" + QUOTE + entry.getKey() + QUOTE + ":"  + QUOTE + entry.getValue() + QUOTE);
			sb.append(LEFT);
			sb.append(entry.getKey());
			sb.append(COMMA);
			sb.append(entry.getValue());
			sb.append(RIGHT);
			sb.append(COMMA);
		}
		sb.append(RIGHT);
		return sb.toString();
	}
}
