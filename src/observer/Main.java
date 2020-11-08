package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable p = new Covid19Pacient("Aitor", 35);
		PacientObserverGUI pCUI = new PacientObserverGUI((Covid19Pacient) p);
		PacientSymptomGUI f = new PacientSymptomGUI((Covid19Pacient) p);
		PacientThermometerGUI pt = new PacientThermometerGUI((Covid19Pacient) p);
		SemaphorGUI s = new SemaphorGUI((Covid19Pacient) p);

		
		
		
	}


}
