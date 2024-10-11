// Beecrowd - Problema 1186 - Abaixo da Diagonal Secundária
// Autor: Caio Vinicius Corsini Filho

// Bibliotecas
#include <stdio.h>

// Constantes
#define DIMENSAO_MATRIZ 12
#define N_ELEMENTOS_ABAIXO 66.0
 
int main() {
 
    // Declaracao de variaveis
    float M[DIMENSAO_MATRIZ][DIMENSAO_MATRIZ]; // Matriz 12x12
    char O; // Caracter da operacao
    scanf(" %c", &O); // Input usuario
    
    // Preenchendo a variavel com inputs do usuario
    for(int i=0; i<DIMENSAO_MATRIZ; i++){
        for(int j=0; j<DIMENSAO_MATRIZ; j++)
            scanf("%f", &M[i][j]);
    }
    
    // Se o caracter for 'S' será feita a soma dos elementos abaixo da diagonal
    if(O=='S'){
        float soma = 0.0;
        for(int i=0; i<DIMENSAO_MATRIZ; i++){
            for(int j=0; j<DIMENSAO_MATRIZ; j++){
                if(i+j>DIMENSAO_MATRIZ-1) soma+=M[i][j];
            }
        }
        printf("%.1f\n", soma); // Impressao formatada em uma casa decimal da soma
    } else if (O=='M'){ // Se o caracter for 'M' será feita a media dos elementos abaixo da diagonal
        float soma = 0.0;
        for(int i=0; i<DIMENSAO_MATRIZ; i++){
            for(int j=0; j<DIMENSAO_MATRIZ; j++){
                if(i+j>DIMENSAO_MATRIZ-1) soma+=M[i][j]; // Somando os elementos
            }
        }
        float media = soma/N_ELEMENTOS_ABAIXO; // Divide por 66 pois abaixo da diagonal secundaria de uma matriz 12x12 temos 66 elementos
        printf("%.1f\n", media); // Impressao formatada em uma casa decimal da media
    } else 
        printf("0.0\n"); // Imprime zero caso o valor da variavel O seja invalido
    
    return 0;
}


/* PONTOS IMPORTANTES
1. Seu main deve ser do tipo int (nao void) senao nao funciona no beecrowd no C99
2. Em termos de otimização, iterar linhas colunas eh melhor que iterar colunas linhas devido a forma como matrizes ficam na memoria
3. Para qualquer operacao com float, lembre-se de colocar o ".x" para que o numero original nao seja convertido para int (dividir por 66.0 por exemplo ao inves de 66)
*/