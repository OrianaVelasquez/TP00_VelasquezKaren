package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	 private int n1;
	 private int n2;
	 public Calculadora (){
		 // TODO Auto-generated constructor stub
	 }
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int sumaNumero() {
		return n1 + n2;
	}
	public int restaNumero() {
		return n1 - n2;
	}
	public int divisionNumero() {
		if (n2>0) {
			return n1 / n2;
		}else {
			return 0;
		}
		
	}
	public int multiplicacionNumero() {
		return n1 * n2;
}
	public int potenciaNumero() {
	      int resultadoP = calculatePower(n1, n2);
	      return resultadoP;
	  }

	  static int calculatePower(int num, int power) {
	      int answer = 1;
	      if (num > 0 && power == 0) {
	          return answer;
	      } else if (num == 0 && power >= 1) {
	          return 0;
	      } else {
	          for (int i = 1; i <= power; i++) {
	              answer = answer * num;
	          }
	          return answer;
         }
 }
	  public int raizNumero() {
			double resultadoraiz= Math.sqrt((double)this.n1);
			return (int) resultadoraiz;	
		}
		
		public double raizn() {
			double resultadoraizn=Math. pow((double)this.n1,(double)1/this.n2);
			return resultadoraizn;	
		}	  
}