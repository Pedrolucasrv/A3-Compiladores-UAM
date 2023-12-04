grammar Gramatica2;

raiz_programa:estoria EOF;

estoria: EOF | (declaracao PONTO_E_VIRGULA)*;

declaracao:INICIO pessoa TEXTO1 PONTO_E_VIRGULA
           (consequencia2 |
           consequencia);

consequencia:  pessoa ACAO INT ITENS CONECTOR CONSEQUENCIA;
consequencia2: pessoa ACAO UMACINCO ITENS;

INICIO: 'O' | 'A';
TEXTO1: 'foi ao mercado';
CONECTOR: 'e'|'E';
CONSEQUENCIA: 'ficou pobre';
CONDICAO: 'Se';
pessoa:PESSOA;
ACAO: 'comprou';
ESPACO: [ \t\r\n]+ -> skip;
PESSOA: [A-Z][a-z]+;
ITENS: [a-z]+;
PROPRIEDADE: ESPACO 'pesa' ESPACO;
UMACINCO: [1-5];
INT: [1-9][0-9]*;
PONTO_E_VIRGULA: ';';

