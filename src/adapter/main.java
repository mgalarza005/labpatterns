package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("s1", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 10, 7), 2);
		p.addSymptom(new Symptom("s3", 10, 5), 3);
		p.addSymptom(new Symptom("s4", 10, 3), 4);
		p.addSymptom(new Symptom("s5", 10, 1), 5);
		
		Iterator i1 = Sorting.sortedIterator(p.invertedIterator(), new SymptomComparator());
		System.out.println("Symptoms sorted by name: ");
		while(i1.hasNext() ) {
		
			System.out.println(i1.next());
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		Iterator i2 = Sorting.sortedIterator(p.invertedIterator(), new SeverityIndexComparator());
		
		System.out.println("Symptoms sorted by Severity iIndex: ");
		while(i2.hasNext() ) {
			System.out.println(i2.next());
		}
	}
	
	

}
