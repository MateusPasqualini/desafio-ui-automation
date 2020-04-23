## Planejamento
|  Testes de aceitação |
|:--------------------:|
| Tabelas de Decisões  |

| Perfil PF Mensal              | Caso de Teste 1 | Caso de Teste 2  | Caso de Teste 3   | Caso de Teste 4    |
|-------------------------------|-----------------|------------------|-------------------|--------------------|
| Entradas                      |        1        |         2        |         3         |          4         |
| Valor minimo >20 para aplicação |       não       |        Sim       |        Sim        |         Sim        |
| Valor minimo >20 para poupar  |        x        |        Não       |        Sim        |         Sim        |
| Tempo de poupança             |        x        |         x        |        Não        |         Sim        |
| Saída                         | Valor inválido  | Valor Inválido   | Valor Obrigatório | Simulação efetuada |
|-------------------------------|-----------------|------------------|-------------------|--------------------|

| Perfil PJ Mensal              | Caso de Teste 1 | Caso de Teste 2  | Caso de Teste 3   | Caso de Teste 4    |
|-------------------------------|-----------------|------------------|-------------------|--------------------|
| Entradas                      |        1        |         2        |         3         |          4         |
| Valor minimo >20 para aplicação |       não       |        Sim       |        Sim        |         Sim        |
| Valor minimo >20 para poupar  |        x        |        Não       |        Sim        |         Sim        |
| Tempo de poupança             |        x        |         x        |        Não        |         Sim        |
| Saída                         | Valor inválido  | Valor Inválido   | Valor Obrigatório | Simulação efetuada |
|-------------------------------|-----------------|------------------|-------------------|--------------------|

| Perfil PF Anual               | Caso de Teste 1 | Caso de Teste 2  | Caso de Teste 3   | Caso de Teste 4    |
|-------------------------------|-----------------|------------------|-------------------|--------------------|
| Entradas                      |        1        |         2        |         3         |          4         |
| Valor minimo >20 para aplicaão |       não       |        Sim       |        Sim        |         Sim        |
| Valor minimo >20 para poupar  |        x        |        Não       |        Sim        |         Sim        |
| Tempo de poupança             |        x        |         x        |        Não        |         Sim        |
| Saída                         | Valor inválido  | Valor Inválido   | Valor Obrigatório | Simulação efetuada |
|-------------------------------|-----------------|------------------|-------------------|--------------------|

| Perfil PJ Anual               | Caso de Teste 1 | Caso de Teste 2  | Caso de Teste 3   | Caso de Teste 4    |
|-------------------------------|-----------------|------------------|-------------------|--------------------|
| Entradas                      |        1        |         2        |         3         |          4         |
| Valor minimo >20 para aplicãção |       não       |        Sim       |        Sim        |         Sim        |
| Valor minimo >20 para poupar  |        x        |        Não       |        Sim        |         Sim        |
| Tempo de poupança             |        x        |         x        |        Não        |         Sim        |
| Saída                         | Valor inválido  | Valor Inválido   | Valor Obrigatório | Simulação efetuada |
|-------------------------------|-----------------|------------------|-------------------|--------------------|

## Cenários desenvolvidos
```
Cenário 1 
Titulo:  Simulação - Efetuar Simulação Pessoa física Mensal
Pré-condição: Selecionar o radial “Para você” e Selecionar a opção “Mensal”.

Dado que como pessoa física eu queira simular uma poupança Sicredi
Quando aplico um valor entre de R$20,00 e R$9999999.00 
E  insiro o número de meses que desejo guardar
Então deve ser efetuada a simulação e deve exibir o valor acumulado de acordo com os meses inseridos
Reprodução:
Selecionar opção “Para você”
No Campo: “Qual o valor que você quer aplicar?” inserir um valor entre  R$20,00 e R$9999999.00 
No Campo: “Quanto você quer poupar todo mês?” inserir um valor entre R$20,00 e R$9999999.00 
No Campo: “Por quanto tempo você quer poupar?” inserir um valor entre 1 e 999
Clicar no botão “Simular
Resultado Esperado: Deve carregar uma nova página exibindo o valor acumulado de acordo com o número de meses
inseridos, e uma lista com outras opções de simulações exibindo tempo em meses e valores possíveis.

Cenário 2
Titulo:  Simulação - Efetuar Simulação Pessoa física Anual
Pré-condição: Selecionar o radial “Para você” e Selecionar a opção “Anual”.

Dado que como pessoa física eu queira simular uma poupança Sicredi
Quando aplico um valor entre de R$20,00 e R$9999999.00 
E  insiro o número de meses que desejo guardar
Então deve ser efetuada a simulação e deve exibir o valor acumulado de acordo com os anos 
inseridos, convertidos para meses

Reprodução:
Selecionar opção “Para você”
No Campo: “Qual o valor que você quer aplicar?” inserir um valor entre  R$20,00 e R$9999999.00 
No Campo: “Quanto você quer poupar todo mês?” inserir um valor entre R$20,00 e R$9999999.00 
No Campo: “Por quanto tempo você quer poupar?” inserir um valor entre 1 e 999
Clicar no botão “Simular
Resultado Esperado: Deve carregar uma nova página exibindo o valor acumulado de acordo c
om o número de anos inseridos, convertidos para meses e uma lista com outras opções de simulações exibindo 
tempo em meses e valores possíveis.

Cenário 3
Titulo:  Simulação - Efetuar Simulação Pessoa Jurídica Mensal
Pré-condição: Selecionar o radial Para sua empresa ou agronegócio” e Selecionar a opção “Mensal”.

Dado que como pessoa jurídica eu queira simular uma poupança Sicredi
Quando aplico um valor entre de R$20,00 e R$9999999.00 
E  insiro o número de meses que desejo guardar
Então deve ser efetuada a simulação e deve exibir o valor acumulado de acordo com os meses inseridos
Reprodução:
Selecionar opção “Para você”
No Campo: “Qual o valor que você quer aplicar?” inserir um valor entre  R$20,00 e R$9999999.00 
No Campo: “Quanto você quer poupar todo mês?” inserir um valor entre R$20,00 e R$9999999.00 
No Campo: “Por quanto tempo você quer poupar?” inserir um valor entre 1 e 999
Clicar no botão “Simular
Resultado Esperado: Deve carregar uma nova página exibindo o valor acumulado de acordo com o número de meses
inseridos, e uma lista com outras opções de simulações exibindo tempo em meses e valores possíveis.

Cenário 4
Titulo:  Simulação - Efetuar Simulação Pessoa Jurídica Anual
Pré-condição: Selecionar o radial “Para sua empresa ou agronegócio” e Selecionar a opção “Anual”.

Dado que como pessoa jurídica eu queira simular uma poupança Sicredi
Quando aplico um valor entre de R$20,00 e R$9999999.00 
E  insiro o número de meses que desejo guardar
Então deve ser efetuada a simulação e deve exibir o valor acumulado de acordo com os anos inseridos, 
convertidos para meses

Reprodução:
Selecionar opção “Para você”
No Campo: “Qual o valor que você quer aplicar?” inserir um valor entre  R$20,00 e R$9999999.00 
No Campo: “Quanto você quer poupar todo mês?” inserir um valor entre R$20,00 e R$9999999.00 
No Campo: “Por quanto tempo você quer poupar?” inserir um valor entre 1 e 999
Clicar no botão “Simular
Resultado Esperado: Deve carregar uma nova página exibindo o valor acumulado de acordo com o número de anos inseridos,
convertidos para meses e uma lista com outras opções de simulações exibindo tempo em meses e valores possíveis.

Cenário 5
Titulo:  Simulação - Valor de aplicação abaixo de R$20,00
Pré-condição: Não há pré-condições

Dado que eu queira simular uma poupança Sicredi
Quando aplico um valor abaixo de R$20,00
Então deve ser exibido uma mensagem de erro informando: “Valor mínimo de 20.00”

Reprodução:
No Campo: “Qual o valor que você quer aplicar?” inserir um valor abaixo de R$20,00
desfazer a seleção do campo, clicando tab
Resultado Esperado: deve exibir uma mensagem de erro informando que o valor mínimo é de R$20,00

Cenário 6
Titulo: Simulação - Valor mensal abaixo de R$20,00
Pré-condição: Não há pré-condições

Dado que eu queira simular uma poupança Sicredi
Quando aplico um valor de aplicação mensal abaixo de R$20,00
Então deve ser exibido uma mensagem de erro informando: “Valor mínimo de 20.00”

Reprodução:
No Campo: “Qual o valor que você quer aplicar?” inserir um valor abaixo de R$20,00
desfazer a seleção do campo, clicando tab
Resultado Esperado: deve exibir uma mensagem de erro informando que o valor mínimo é de R$20,00

```

## Pré-requisitos
[Java 8+](https://www.oracle.com/technetwork/pt/java/javase/downloads/jre8-downloads-2133155.html)
   
[Maven](https://maven.apache.org/)

[docker](https://www.docker.com/)* 

[docker-compose](https://github.com/docker/compose)*

*necessários para visualizar os Reports

## Utilizando
Para rodar os testes basta utilizar o comando Maven abaixo
```
mvn clean test
```
Ao rodar os testes, automaticamente é criado um report com as informações dos testes
rodados.
Para visualizar esses reports é necessário utilizar docker-compose com o comando abaixo
```
docker-compose up allure
```
Isso criara um container que servirá para exibir o report criado.

Para acessar as evidencias dos testes acesse este link após o container estiver 
pronto [localhost:4040](http://localhost:4040/index.html)

## Configurando Suite de testes
É possível alterar algumas configurações parametrizadas da suite de testes 
através do arquivo de configuração do testng (testng.xml).
- Habilitar/Desabilitar teste: Para habilitar ou desabilitar os testes basta mudar a flag
"enabled" que se encontra na tag < test>. true para habilitar e false para desabilitar

- Paralelização: é possível alterar o tipo de parelização e o número de threads que 
irão rodar os testes. Para alterar o tipo de parelilzação mude o atributo "parallel" e
 para alterar o número de threads mude o atributo "thread-count" dentro da tag
   < test>

Por default a opção de navegador headless está desativado. Para poder ativar é necessário 
acessar a classe OptionsManager e descomentar* as linhas de códigos
```
//        chromeOptions.addArguments("--headless");
```
Para o FireFox:
```
//        geckoOptions.addArguments("--headless");
```
*Para descomentar basta remover as barras no ínicio da linha

## Link para Teste automatizado da API disponibilizada
[Desafio-api-automation](https://github.com/MateusPasqualini/desafio-api-automation)
