# Beecrowd - Problema 1186 - Abaixo da Diagonal Secundária
# Autor: Caio Vinicius Corsini Filho

# Constantes
TAM = 12
N_ELEM_ABAIXO = 66

# Funcao para realizar a soma.
def somar_elem(matriz):
    soma = 0
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            if i+j > TAM-1:
                soma = soma + matriz[i][j]
    return soma

# Declaracao de variaveis
M = [[0 for _ in range(TAM)] for _ in range(TAM)]  # Declarando matriz 12x12
O = input()  # Input usuario da operacao

# Preenchendo a variavel com inputs do usuario
for i in range(len(M)):
    for j in range(len(M[i])):
        M[i][j] = float(input())

# Variavel para armazenar o resultado da soma
soma = somar_elem(M)

# Se o caracter for 'S' será feita a soma dos elementos abaixo da diagonal
if O == "S":
    print(round(soma,1))  # Impressao formatada em uma casa decimal da soma
elif O == "M":  # Se o caracter for 'M' será feita a media dos elementos abaixo da diagonal
    media = soma/N_ELEM_ABAIXO  # Divide por 66 pois abaixo da diagonal secundaria de uma matriz 12x12 temos 66 elementos
    print(round(media,1))  # Impressao formatada em uma casa decimal da media
else:
    print("0.0")  # Imprime zero caso o valor da variavel O seja invalido

"""
1. Seu main deve ser do tipo int (nao void) senao nao funciona no beecrowd no C99
2. Em termos de otimização, iterar linhas colunas eh melhor que iterar colunas linhas devido a forma como matrizes ficam na memoria
3. Para qualquer operacao com float, lembre-se de colocar o ".x" para que o numero original nao seja convertido para int (dividir por 66.0 por exemplo ao inves de 66)
4. Lembre-se de nunca colocar mensagens nos seus scanfs quando estiver fazendo exercicios do Beecrowd!
"""