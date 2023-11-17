grammar Gramatica2;

raiz_programa:estoria EOF;

estoria: EOF | (declaracao PONTO_E_VIRGULA)*;

declaracao:INICIO personagem CONECTOR personagem | 
           personagem ACAO VARIAS VEZES |            
           CONDICAO declaracao2 ESPACO CONSEQUENCIA |
           declaracao2;


declaracao2: personagem PROPRIEDADE VARIAS;


INICIO: 'Era uma vez';
personagem:NOME;
NOME: [A-Z][a-z]*;
CONECTOR: 'e'|'E';
ACAO: 'andou'|'pulou';
PROPRIEDADE: ESPACO 'pesa' ESPACO;
VEZES: 'vezes';
VARIAS: [1-9][0-9]*;
CONDICAO: 'Se' ESPACO;
CONSEQUENCIA: 'FERROU';
PONTO_E_VIRGULA: ';';
ESPACO: [ \t\r\n]+ -> skip;
