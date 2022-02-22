# AulasPraticas
![Diagrama UML - Ficha 3]![uml_elsa](https://user-images.githubusercontent.com/97111716/155182633-3a730028-f3c9-4b24-91cc-e8502ee1d403.jpg)

## Banco
Esta classe possui como atributos nome e as listas (de contas bancarias e de casas), que sao adicionadas ao banco. Tal como as funcoes de criaConta, que permite adicionar as contas ao banco e de criaCasa(), que permite adicionar as casas ao banco. Tem ainda como funcoes getConta(), que permite verificar, atraves do nome do titular, se a conta especificada pertence ao banco. removerCasa(), permite eliminar as casas da lista e a funcao getLucroPrevisto(), permite obter o lucro da venda de todas as casas pertencentes ao banco.
## ContaBancaria
Esta classe possui como atributos titular (nome do titular), saldo (da conta) e dataAbertura (data de abertura da conta). Por default o saldo inicialmente é 0 e a data de abertura é programada a data atual. Para alem dos gets e dos sets a classe possui as funcoes de getInformacaoConta(), que imprime a informacao do titular identificado. A funcao depositar(), altera o valor do saldo, de forma positiva e a funcao levantar(), altera valor do saldo, de forma negativa, sendo ainda impossivel de realizar se o valor a levantar desejado for superior ao valor do saldo atual.
## Casa
Esta classe possui como atributos morada e precos de custo (precoCusto) e de venda (precoVenda) da casa. Possui ainda as funcoes de getLucro(), que indica o valor de lucro obtido com a venda da casa. Tal como a funcao de getPercentMargemLucro(), que indica a percentagem de margem do lucro.