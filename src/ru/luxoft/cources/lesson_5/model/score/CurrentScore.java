package ru.luxoft.cources.lesson_5.model.score;

import ru.luxoft.cources.lesson_5.model.score.DebetScore;
import ru.luxoft.cources.lesson_5.model.money.Money;
import ru.luxoft.cources.lesson_5.model.account.Account;
import ru.luxoft.cources.lesson_5.model.account.Account;

public class CurrentScore extends Score
{
	private DebetScore debetScore;

	public CurrentScore(Money balance, Account owner, Integer number, DebetScore debetScore)
	{
		super(balance, owner, number);
		this.debetScore = debetScore;
	}

	@Override
	public void addMoney(Money money)
	{
		if (money.getValue() > 1000000)
		{
			Money moneyToDebet = new Money(2000, money.getCurrency().getName());
			debetScore.addMoney(moneyToDebet);
		}

		super.addMoney(money);
	}

	@Override
	public Money getMoney(double balanceLess)
	{
		if (this.getBalance().getValue() - balanceLess <= 0)
		{
			System.out.println("No money!");
			return null;
		}

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
