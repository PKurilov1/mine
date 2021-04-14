package ru.luxoft.cources.lesson_5.model.score;

import ru.luxoft.cources.lesson_5.model.score.CreditScore;
import ru.luxoft.cources.lesson_5.model.money.Money;
import ru.luxoft.cources.lesson_5.model.account.Account;
import ru.luxoft.cources.lesson_5.model.account.Account;

public class DebetScore extends Score
{
	private CreditScore creditScore;

	public DebetScore(Money balance, Account owner, Integer number, CreditScore creditScore)
	{
		super(balance, owner, number);
		this.creditScore = creditScore;
	}

	@Override
	public void addMoney(Money money)
	{
		if (creditScore.getMoneyWithoutLess().getValue() < 20000)
		{
			System.out.println("No money on Credit Score!");
			return;
		}

		super.addMoney(money);
	}

	@Override
	public Money getMoney(double balanceLess)
	{
		if (creditScore.getMoneyWithoutLess().getValue() < 20000)
		{
			System.out.println("No money on Credit Score!");
			return null;
		}

		if (this.getBalance().getValue() <= 0)
		{
			System.out.println("No money!");
			return null;
		}

		return super.getMoney(balanceLess);
	}

	@Override
	public Money getMoneyWithoutLess()
	{
		if (creditScore.getMoneyWithoutLess().getValue() < 20000)
		{
			System.out.println("No money on Credit Score!");
			return null;
		}

		return super.getMoneyWithoutLess();
	}

	@Override
	boolean checkBefore()
	{
		return true;
	}
}