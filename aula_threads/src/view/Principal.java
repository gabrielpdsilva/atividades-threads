package view;

import controller.ThreadCalc;
import controller.ThreadId;

public class Principal {
	
	public static void main(String[] args) {
//		for(int idThread = 0; idThread < 5; idThread++){
//			
//			//iteracao do for eh tao rapida q eh como se
//			//as threads fossem startadas simultaneamente
//			Thread t = new ThreadId(idThread);
//			t.start();
//		}
		
		int a = 10;
		int b = 2;
		for(int op = 0; op < 4; op++){
			Thread tc = new ThreadCalc(a, b, op);
			tc.start();
		}			
	}

}
