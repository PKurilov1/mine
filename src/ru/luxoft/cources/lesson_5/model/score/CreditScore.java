package ru.luxoft.cources.lesson_5.model.score;

import ru.luxoft.cources.lesson_5.model.money.Money;
import ru.luxoft.cources.lesson_5.model.account.Account;

public class CreditScore extends Score
{
	public CreditScore(Money balance, Account owner, Integer number)
	{
		super(balance, owner, number);
	}

	@Override
	public void addMoney(Money money)
	{
		super.addMoney(money);
	}

	@Override
	public Money getMoney(double balanceLess)
	{
		return super.getMoney(balanceLess);
	}

	@Override
	public Money getMoneyWithoutLess()
	{
		return super.getMoneyWithoutLess();
	}

	@Override
	boolean checkBefore()
	{
		return true;
	}
}
