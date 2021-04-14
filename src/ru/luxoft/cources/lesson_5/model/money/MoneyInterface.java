package ru.luxoft.cources.lesson_5.model.money;

public interface MoneyInterface
{
	void addMoney(Money money);
	Money getMoney(double balanceLess);
	Money getMoneyWithoutLess();
}
