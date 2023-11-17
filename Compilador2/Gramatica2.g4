grammar Gramatica2;

raiz_programa:estoria EOF;

estoria: declaracao (PONTO_E_VIRGULA declaracao) |;

declaracao:INICIO personagem CONECTOR personagem | 
           personagem ACAO VARIAS VEZES;
personagem:NOME;

VEZES: 'vezes';
ACAO: 'andou';
VARIAS: [1-9][0-9]*;
INICIO: 'Era uma vez';
CONECTOR: 'e'|'E';
NOME: [A-Z_][a-z]*;
PONTO_E_VIRGULA: ';';
ESPACO: [ \t\r\n]+ -> skip;