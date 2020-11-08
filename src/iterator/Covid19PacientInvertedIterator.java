package iterator;

import java.util.Iterator;
import java.util.List;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator {
	List<Symptom> symptoms;
	int position=0;

	public Covid19PacientInvertedIterator(List<Symptom> s) {
		
		this.symptoms = s;
	}

	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position>=0;
	}

	@Override
	public void goLast() {
		position = symptoms.size()-1;
		
	}
}
