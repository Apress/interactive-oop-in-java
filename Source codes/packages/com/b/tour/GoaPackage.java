package com.b.tour;

public class GoaPackage 
{
	int basic_price=15000;
	int serviceTax=2000;
	public void ShowTariff()
	{
		int forTwoPerson=basic_price*2 +serviceTax;
		int forFourPerson=basic_price*4 +serviceTax;
		System.out.println("***Tariff for Goa tour in Company B***" );
		System.out.println("In Company A:For two person , Goa tour package is Rs. "+ forTwoPerson);
		System.out.println("In Company A:For four person , Goa tour package is Rs. "+ forFourPerson );
		System.out.println("****************" );
	}
}
