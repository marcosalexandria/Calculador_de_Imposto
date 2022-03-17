
public class Imposto {

	public static void main(String[] args) {
		/*
		 Pagador de impostos anual
		 Dado um valor de salário anual, mostre quanto de imposto será pago
		 
		 salario de 0 a 34.712 imposto de 9.70%
		 salario de 34.712 a 68.507 imposto de 37.35%
		 salario acima de 68.507 imposto de 49.50%
		*/
		
		double salarioAnual = 69.589;
		double salarioMaximo1 = 34.712;
		double imposto1 = 9.70;
		
		double salarioMaximo2 = 68.507;
		double imposto2 = 37.35;
		
		double imposto3 = 49.50;
		
		double impostoAnual;
		
		if(salarioAnual >= 0 && salarioAnual <= salarioMaximo1) {
			impostoAnual = salarioAnual * imposto1 / 100;
			System.out.println("Seu salário anual é de: R$ "+salarioAnual+" e seu imposto anual é de R$: "+impostoAnual+", que corresponde \na "+imposto1+"% do seu salário anual!");
			
		}else if(salarioAnual > salarioMaximo1 && salarioAnual <= salarioMaximo2) {
			impostoAnual = salarioAnual * imposto2 / 100;
			System.out.println("Seu salário anual é de: R$ "+salarioAnual+" e seu imposto anual é de R$: "+impostoAnual+", que corresponde \na "+imposto2+"% do seu salário anual!");
		}else {
			impostoAnual = salarioAnual * imposto3 / 100;
			System.out.println("Seu salário anual é de R$: "+salarioAnual+" e seu imposto anual é de R$: "+impostoAnual+", que corresponde \na "+imposto3+"% do seu salário anual!");
		}

	}

}
