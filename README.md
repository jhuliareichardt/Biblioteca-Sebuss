📚 *SEBUS*

Sebus é uma biblioteca simples que modela um sistema com Pessoas e Livros. O código define as classes Pessoa, Livro, e a interface Publicacao. A biblioteca permite interagir com essas entidades, criando objetos e manipulando suas propriedades de maneira intuitiva.

🚀 *Funcionalidades principais*

👤 *Pessoa*: Armazena informações de indivíduos, como nome, idade e sexo. Permite criar novas pessoas, obter e alterar essas informações, além de fazer o cálculo de idade com o método fazerNiver().

📖 *Livro*: Representa um livro, incluindo título, autor, total de páginas e status de leitura. Permite abrir, fechar, folhear e navegar pelas páginas.

📄 *Publicacao*: Interface que define métodos obrigatórios para interagir com livros, como abrir, fechar, folhear, avançar ou voltar páginas.
📝 Descrição das classes e métodos:

👤 *Pessoa:*

*Atributos*: nome, idade, sexo.

*Métodos principais:*

fazerNiver(): Incrementa a idade da pessoa.

Métodos de acesso para os atributos (getters e setters).

📖 *Livro:*

Atributos: titulo, autor, totPag (total de páginas), pagAtual (página atual), aberto (status do livro), leitor (pessoa que está lendo o livro).

Métodos principais:

detalhes(): Exibe as informações do livro e do leitor.

abrir(), fechar(): Métodos para abrir e fechar o livro.

folhear(int p): Folheia até a página especificada.

avancarPag(), voltarPag(): Navega entre as páginas do livro.

📄*Publicacao (Interface):*

A interface Publicacao define métodos que devem ser implementados por qualquer classe que represente uma publicação, como livros. Ela inclui métodos para abrir, fechar, folhear, e navegar pelas páginas do livro.

*Feito por: Jhulia Reichardt*
