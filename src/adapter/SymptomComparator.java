package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomComparator implements Comparator {


	public int compare(Object s1, Object s2) {
		String sname1=((Symptom) s1).getName();
		String sname2=((Symptom) s2).getName();

		return sname1.compareTo(sname2);
		

	}
}


