// Beecrowd - Problema 1186 - Abaixo da Diagonal Secundária
// Autor: Caio Vinicius Corsini Filho

import java.util.Scanner; // Importa a classe Scanner, usada para inputs
public class Main {
    // Constantes
    // Final eh para impedir que elas sejam modificadas
    static final int TAM = 12;
    static final double N_ELEM_ABAIXO = 66.0;

    // Funcao para realizar a soma.
    public static double somarElem(double matriz[][], int n){
        double soma = 0.0;
        for(int i=0; i<TAM; i++){ // Itero linhas no laco exterior e colunas no interior
            for(int j=0; j<TAM; j++)
                if(i+j>TAM-1) soma+=matriz[i][j];   
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in); // Instanciando Scanner para pegar inputs do usuario

        // Declaracao de variaveis
        double[][] M = new double[TAM][TAM]; // Matriz 12x12
        char O = '\0'; // Caracter da operacao
        String strInput = inputUser.nextLine(); // Input usuario
        O = strInput.charAt(O);

        // Preenchendo a variavel com inputs do usuario
        for(int i=0; i<TAM; i++){
            for(int j=0; j<TAM; j++)
                M[i][j] = inputUser.nextDouble();
        }

        // Variavel para armazenar o resultado da soma
        double soma = somarElem(M, TAM);

        // Se o caracter for 'S' será feita a soma dos elementos abaixo da diagonal
        if(O=='S')
            System.out.printf("%.1f\n", soma); // Impressao formatada em uma casa decimal da soma
        else if (O=='M'){ // Se o caracter for 'M' será feita a media dos elementos abaixo da diagonal
            double media = soma/N_ELEM_ABAIXO; // Divide por 66 pois abaixo da diagonal secundaria de uma matriz 12x12 temos 66 elementos
            System.out.printf("%.1f\n", media); // Impressao formatada em uma casa decimal da media
        } else 
            System.out.printf("0.0\n"); // Imprime zero caso o valor da variavel O seja invalido
        inputUser.close(); // Fecha o scanner aberto. Necessario em Java
    }
}

/* PONTOS IMPORTANTES
1. Seu main deve ser do tipo int (nao void) senao nao funciona no beecrowd no C99
2. Em termos de otimização, iterar linhas colunas eh melhor que iterar colunas linhas devido a forma como matrizes ficam na memoria
3. Para qualquer operacao com float, lembre-se de colocar o ".x" para que o numero original nao seja convertido para int (dividir por 66.0 por exemplo ao inves de 66)
4. Lembre-se de nunca colocar mensagens nos seus scanfs quando estiver fazendo exercicios do Beecrowd!
*/