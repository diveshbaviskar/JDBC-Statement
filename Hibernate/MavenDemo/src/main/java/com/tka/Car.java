package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private String name;
	private String Number;
	private String speed;
	private int cost;
	private String colour;
	private String company;
	private int range;
	private String enginepower;

	public Car() {

	}

	public Car(String name, String number, String speed, int cost, String colour, String company, int range,
			String enginepower) {
		super();
		this.name = name;
		Number = number;
		this.speed = speed;
		this.cost = cost;
		this.colour = colour;
		this.company = company;
		this.range = range;
		this.enginepower = enginepower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getEnginepower() {
		return enginepower;
	}

	public void setEnginepower(String enginepower) {
		this.enginepower = enginepower;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", Number=" + Number + ", speed=" + speed + ", cost=" + cost + ", colour=" + colour
				+ ", company=" + company + ", range=" + range + ", enginepower=" + enginepower + "]";
	}

}
