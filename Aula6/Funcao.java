package Aula6;

public class Funcao {

	public static double[] calcularRaizes(double a, double b, double c) {


		double delta = (Math.pow(b, 2)) - (4 * a * c);
		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
		}else if (delta == 0){
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			return new double[]{x1};
		}else{
			return new double[]{Double.NaN};
		}

	}
	public static String gerarEquacao(double x1, double x2) {
		double soma = x1 + x2;
		double produto = x1 * x2;

		String termoSoma = "";
		if (soma != 0) {
			String somaFormatada;
			if( soma == (int) soma && Math.abs(soma) == 1){
				somaFormatada = "";
			}else if (soma == (int) soma) {
				somaFormatada = String.format("%.0f", Math.abs(soma));
			} else {
				somaFormatada = String.format("%.2f", Math.abs(soma));
			}

			if (soma > 0) {
				termoSoma = String.format(" - %sx", somaFormatada);
			} else {
				termoSoma = String.format(" + %sx", somaFormatada);
			}
		}
		String termoProduto = "";
		if (produto != 0) {
			String produtoFormatado;
			if (produto == (int) produto) {
				produtoFormatado = String.format("%.0f", Math.abs(produto));
			} else {
				produtoFormatado = String.format("%.2f", Math.abs(produto));
			}

			if (produto > 0) {
				termoProduto = String.format(" + %s", produtoFormatado);
			} else {
				termoProduto = String.format(" - %s", produtoFormatado);
			}
		}

        return String.format("x^2%s%s = 0", termoSoma, termoProduto);
	}
}
