#### Beecrowd - Problema 1186 - Abaixo da Diagonal Secundária
##### Autor: Caio Vinicius Corsini Filho

****

**Matriz Real** *M* 12x12  
**Caracter** *O* <- lerDoUsuario  
**Inteiro** *i*, *j* <- 0  

Para cada *linha* em *M*:  
&nbsp;&nbsp;&nbsp;&nbsp; Para cada *coluna* em *M*:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *M*[*linha*][*coluna*] <- lerDoUsuario  

**Real** *soma* <- 0  
Para cada *linha* em *M*:  
&nbsp;&nbsp;&nbsp;&nbsp; Para cada *coluna* em *M*:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Se *linha* + *coluna* > 11:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *soma* <- *soma* + *M*[*linha*][*coluna*]  

Se *O* for 'S':  
&nbsp;&nbsp;&nbsp;&nbsp; Imprimir(*soma*)  
Senão Se *O* for 'M':  
&nbsp;&nbsp;&nbsp;&nbsp; **Real** *média* <- *soma* / 66  
&nbsp;&nbsp;&nbsp;&nbsp; Imprimir(*média*)  
Senão:  
&nbsp;&nbsp;&nbsp;&nbsp; Imprimir(0.0)
