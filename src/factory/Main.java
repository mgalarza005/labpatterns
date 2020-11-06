package factory;

import domain.*;


public class Main {

	public static void main(String[] args) {
		SymptomFactory f = new SymptomFactory();
		domain.Medicament m=new Medicament("Ibuprofeno",f);
		MedicalGUI mgui= new MedicalGUI(m);
	}

}
