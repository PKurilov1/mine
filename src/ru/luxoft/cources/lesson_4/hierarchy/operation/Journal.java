package ru.luxoft.cources.lesson_4.hierarchy.operation;

import java.util.*;
import ru.luxoft.cources.lesson_4.*;

public class Journal
{
	private List<Operation> operations;

	public Journal()
	{
		operations = new ArrayList<Operation>();
	}

	public List<Operation> getOperations()
	{
		return operations;
	}
}
