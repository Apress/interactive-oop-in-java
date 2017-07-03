package packages.examples;

//For company a packages
/*
import com.a.tour.GoaPackage;
import com.a.tour.KeralaPackage;
//or, simply use the following statement*/
import com.a.tour.*;
//For company b packages
import com.b.tour.*;

public class PackageEx {
	public static void main(String args[])
	{
		System.out.println("***Package Example Demo***");
		// Only CompanyA has KeralaPackage
		KeralaPackage keralaPackageInA=new KeralaPackage();
		keralaPackageInA.ShowPrice();
		//Only CompanyB has AndamanPackage
		AndamanPackage companyBAndamanPackage=new AndamanPackage();
		companyBAndamanPackage.ShowTariff();
		//Company A and B both have package for Goa.
		com.a.tour.GoaPackage companyAGoaPackage=new com.a.tour.GoaPackage();	
		companyAGoaPackage.ShowPrice();

		com.b.tour.GoaPackage companyBGoaPackage=new com.b.tour.GoaPackage();
		companyBGoaPackage.ShowTariff();
	}
}

