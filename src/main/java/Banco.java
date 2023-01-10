
public class Banco {

    public static String formula = "confiabilidade * valor / 2";

    public static double calcularEmprestimo(Double valor, Double confiabilidade) {
        String expressao;
        expressao = formula.replace("valor", Double.toString(valor));
        expressao = expressao.replace("confiabilidade", Double.toString(confiabilidade));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
