package ru.luxoft.cources.lesson_4.hierarchy;
import ru.luxoft.cources.lesson_4.*;

public class Stock
{
	private long number;
	private Emmitent emmitent;

	public Stock(long number)
	{
		this.number = number;
	}

	public Stock(long number, Emmitent emmitent)
	{
		this.number = number;
		this.emmitent = emmitent;
	}

	public long getNumber()
	{
		return number;
	}

	public void setNumber(long number)
	{
		this.number = number;
	}

	public Emmitent getEmmitent()
	{
		return emmitent;
	}

	public void setEmmitent(Emmitent emmitent)
	{
		this.emmitent = emmitent;
	}
}