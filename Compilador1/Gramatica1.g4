grammar Gramatica1;

raiz_programa:comeco;

comeco:INICIO personagem CONECTOR personagem;
personagem:NOME;


INICIO: 'Era uma vez';
CONECTOR: 'e'|'E';
NOME: [A-Z_][a-z]*;
ESPACO: [ \t\r\n]+ -> skip;