# RPG Character Classifier ⚔️🎯

Este é um sistema desenvolvido em Java projetado para realizar a leitura, filtragem e categorização de personagens de jogos a partir de um arquivo de banco de dados fictício em formato `.csv`. O projeto demonstra a aplicação prática de conceitos fundamentais da Orientação a Objetos, como herança e polimorfismo, ao segregar classes derivadas baseando-se no comportamento e atributos do personagem.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (Versão 17 ou superior recomendado)
* **Paradigma:** Orientação a Objetos (Herança com a classe abstrata/base `Personagem` e Polimorfismo nos métodos `toString`)
* **Estrutura de Dados:** Coleções genéricas (`List` e `ArrayList`)
* **Manipulação de Arquivos:** Processamento de streams textuais com `BufferedReader` e `FileReader`

## 📊 Regras de Negócio e Estrutura de Dados
O sistema realiza a leitura do arquivo `personagens_db.csv` localizado no diretório interno do projeto. Cada linha do arquivo deve ser separada por ponto e vírgula (`;`) e iniciar com um identificador de classe:

1. **Lutador Corpo a Corpo (`L`):** Personagens identificados pela inicial 'L'. Além dos atributos base (Nome e Força), possuem uma **Arte Marcial** específica.
2. **Atirador (`A`):** Personagens identificados pela inicial 'A'. Além dos atributos base, contam com uma **Arma Principal** definida.

## 📁 Exemplo do Arquivo de Entrada (`personagens_db.csv`)
O arquivo de leitura deve seguir o padrão abaixo para ser processado corretamente pelo método `menuInterface`:
```text
L;Lee Sin;85;Muay Thai
A;Caitlyn;70;Rifle de Precisão
L;Riven;90;Esgrima
A;Jinx;75;Metralhadora Pow-Pow
