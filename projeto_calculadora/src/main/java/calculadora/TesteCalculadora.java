package calculadora;

/**
 * <p><strong>Classe de Teste para a Calculadora</strong></p>
 *
 * <p>Esta classe contém o método principal responsável por demonstrar
 * o uso da classe {@link Calculadora}. São realizados testes de todas as
 * operações básicas (soma, subtração, multiplicação e divisão), incluindo
 * cenários de exceção para divisão por zero e operador inválido.</p>
 *
 * <p>Este exemplo é utilizado para mostrar:</p>
 * <ul>
 *   <li>Uso de métodos puros em Java</li>
 *   <li>Tratamento de exceções</li>
 *   <li>Aplicação prática da classe Calculadora</li>
 *   <li>Boa documentação utilizando Javadoc</li>
 * </ul>
 *
 * @autor Isabela Jacob
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal da aplicação. Aqui são instanciados objetos da classe
     * {@link Calculadora}, e diversas operações são executadas para demonstrar
     * o funcionamento dos métodos e o tratamento de erros.</p>
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));   // 5
        System.out.println(calc.calcular(10, 4, "-"));  // 6
        System.out.println(calc.calcular(3, 5, "*"));   // 15
        System.out.println(calc.calcular(8, 2, "/"));   // 4

        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
