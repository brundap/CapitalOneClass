package com.capitalone.beans;

import java.util.ArrayList;
import java.util.List;

public class Fruitname implements Comparable<Fruitname> {

	private String name;
	private int rating;
	private String color;
	
//	List<Integer> myarr = new ArrayList();
	

	public Fruitname() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruitname(String name, int rating, String color) {
		super();
		this.name = name;
		this.rating = rating;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruitname [name=" + name + ", rating=" + rating + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruitname other = (Fruitname) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	public int compareTo(Fruitname o) {
		return this.rating - o.rating;
	}

}