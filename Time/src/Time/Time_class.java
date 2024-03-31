package Time;

public class Time_class {
	int h,m,s;
	
	Time_class() {
		
	}
	
	void setTimeH(int a) {
		h = a;
	}
	
	void setTimeM(int a) {
		m = a;
	}
	
	void setTimeS(int a) {
		s = a;
	}
	
	void cnvert() {
		
		if(h > 0) {
			int Ht = h / 60;
			m = h%60;
			if(h%60 != 0) {
				int Mt = m / 60;
				s = m%60;
				if(m%60 != 0) {
					int St = s / 60;
					}
			}
		}
				
	}
	
}
