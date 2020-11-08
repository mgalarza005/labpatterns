package adapter;

import domain.*;
import java.util.Comparator;

public class SeverityIndexComparator implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
		int severityIndex1=((Symptom) s1).getSeverityIndex();
		int severityIndex2=((Symptom) s2).getSeverityIndex();
		
		if( severityIndex1 >  severityIndex2) {
			return 1;
		}else if(severityIndex1 <  severityIndex2) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
