package com.java.project;

import java.io.Serializable;

public class Client implements Serializable{
	private String pizza;
	private String tacos;
	private String sandwish;
	private String coffe;
	private String milk;
	private String juice;
	private String nbr1;
	private String nbr2;
	private String nbr3;
	private String nbr4;
	private String nbr5;
	private String nbr6;
	public Client () {};
	public Client(String pizza, String tacos, String sandwish, String coffe, String milk, String juice, String nbr1,
			String nbr2, String nbr3, String nbr4, String nbr5, String nbr6) {
		super();
		this.pizza = pizza;
		this.tacos = tacos;
		this.sandwish = sandwish;
		this.coffe = coffe;
		this.milk = milk;
		this.juice = juice;
		this.nbr1 = nbr1;
		this.nbr2 = nbr2;
		this.nbr3 = nbr3;
		this.nbr4 = nbr4;
		this.nbr5 = nbr5;
		this.nbr6 = nbr6;
	}
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	public String getTacos() {
		return tacos;
	}
	public void setTacos(String tacos) {
		this.tacos = tacos;
	}
	public String getSandwish() {
		return sandwish;
	}
	public void setSandwish(String sandwish) {
		this.sandwish = sandwish;
	}
	public String getCoffe() {
		return coffe;
	}
	public void setCoffe(String coffe) {
		this.coffe = coffe;
	}
	public String getMilk() {
		return milk;
	}
	public void setMilk(String milk) {
		this.milk = milk;
	}
	public String getJuice() {
		return juice;
	}
	public void setJuice(String juice) {
		this.juice = juice;
	}
	public String getNbr1() {
		return nbr1;
	}
	public void setNbr1(String nbr1) {
		this.nbr1 = nbr1;
	}
	public String getNbr2() {
		return nbr2;
	}
	public void setNbr2(String nbr2) {
		this.nbr2 = nbr2;
	}
	public String getNbr3() {
		return nbr3;
	}
	public void setNbr3(String nbr3) {
		this.nbr3 = nbr3;
	}
	public String getNbr4() {
		return nbr4;
	}
	public void setNbr4(String nbr4) {
		this.nbr4 = nbr4;
	}
	public String getNbr5() {
		return nbr5;
	}
	public void setNbr5(String nbr5) {
		this.nbr5 = nbr5;
	}
	public String getNbr6() {
		return nbr6;
	}
	public void setNbr6(String nbr6) {
		this.nbr6 = nbr6;
	}
	
	
	

}
