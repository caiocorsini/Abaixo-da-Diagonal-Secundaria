#### Beecrowd - Problema 1186 - Abaixo da Diagonal Secundária**
##### Autor: Caio Vinicius Corsini Filho

****
**Matriz Real** *M* 12x12
**Caracter** *O* <- lerDoUsuario
**Inteiro** *i*,*j* <- 0

Para cada *linha* em *M*:
_ Para cada *coluna* em *M*:
__ *M*[*linha*][*coluna*] <- lerDoUsuario

**Real** *soma* <- 0
Para cada *linha* em *M*:
_ Para cada *coluna* em *M*:
__ Se *linha* + *coluna* > 11:
___ *soma* <- *soma* + *M*[*linha*][*coluna*]

Se *O* for 'S':
_ Imprimir(*soma*)
Senão Se *O* for 'M':
_ **Real** *média* <- *soma*/66
_ imprimir(*média*)
Senão:
_ imprimir(0.0)