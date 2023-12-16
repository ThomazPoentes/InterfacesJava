# InterfacesJava
Segue uma explicação rápida e exemplos práticos sobre as poderosas interfaces e como podemos implementálas.

Neste exemplo, a classe Pessoa representa uma entidade. A interface PessoaService representa o serviço responsável pela lógica da aplicação. A classe PessoaServiceImpl implementa a interface PessoaService.
A classe PessoaController é o controlador da aplicação que utiliza o serviço para realizar as operações de soma e subtração.
A classe App é a classe principal da aplicação que instancia o serviço e o controlador e realiza as operações de soma e subtração.
A ideia aqui é mostrar como podemos usar extends e implements para criar camadas independentes na aplicação, permitindo assim a troca de implementações facilmente e o cumprimento do princípio da responsabilidade única.

A interface é um conceito fundamental em Java. É um tipo de dado abstrato que representa um contrato entre a classe que a implementa e as classes que interagem com essa classe.
Quando uma classe implementa uma interface, ela é obrigada a fornecer uma implementação para todos os métodos declarados na interface. 
A implementação deve coincidir exatamente com a assinatura dos métodos na interface, incluindo os tipos de retorno, nomes dos métodos e os parâmetros.
Uma classe pode implementar várias interfaces ao mesmo tempo. Para implementar uma interface, você precisa usar a palavra-chave implements. Aqui está um exemplo de como implementar uma interface:
