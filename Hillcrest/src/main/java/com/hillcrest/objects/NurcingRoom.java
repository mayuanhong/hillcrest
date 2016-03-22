package com.hillcrest.objects;

//@Entity
public class NurcingRoom {

	private String title;
	private String name;

	public NurcingRoom(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	@Override
	public String toString() {
		return "nroom [title=" + title + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}