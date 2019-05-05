package com.oop.golife;

public class Main {

	public static void main(String[] args) {
		Bicycle speda = new Bicycle();
		Motorbike motor = new Motorbike();
		Bus bis = new Bus();

		//TODO : INHERIT
		speda.speda();
		motor.motor();
		bis.bis();
		
		//TODO : POLYMORPH
		Polymorph poly = new Polymorph();
		poly.motor();
		
		//TODO : ENCAPSUL
		Encapsul encapsul = new Encapsul();
		encapsul.setBicylce("InI Sepeda Lho");
		encapsul.setBus("Ini Bus Sekolah Lho");
		encapsul.setMotorbike("Ini Motor nganu Lho");
		
		System.out.println(encapsul.getBicylce());
		System.out.println(encapsul.getBus());
		System.out.println(encapsul.getMotorbike());
	}

}
