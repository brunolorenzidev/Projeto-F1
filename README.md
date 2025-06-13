SOBRE O PROJETO

Esse projeto é um sistema simples, feito em Java, que roda direto no terminal. A ideia foi criar uma forma de gerenciar informações de uma temporada de Fórmula 1, como pilotos, engenheiros, equipes e corridas.

usando o padrão MVC e também entender como funciona a persistência de dados (gravar em arquivos .txt).

O que dá pra fazer:
- Cadastrar pilotos, engenheiros, equipes e corridas
- Ver os dados cadastrados de forma organizada
- Gerar relatórios, como o ranking de pilotos
- Salvar tudo em arquivos .txt, pra não perder nada ao fechar o programa
- Registrar todas as ações em um log

ESTRUTURA DO PROJETO

A gente dividiu o código em pacotes, pra deixar mais fácil de entender e mexer depois:

model/
- Pessoa: é a classe base
- Trabalhador: Interface 
- Piloto e Engenheiro: herdam Pessoa
- Equipe: tem uma lista de pilotos e engenheiros
- Corrida: representa cada etapa da F1 e se conecta com os pilotos e equipes participantes

controller/
Aqui fica a lógica do sistema — o que acontece por trás das ações do usuário:
- Um controller pra cada tipo: piloto, engenheiro, equipe e corrida

view/
Essa parte mostra os menus e o que aparece no terminal:
- Menus principais e específicos pra cada tipo de dado
- Relatórios, como o ranking de pilotos, também aparecem aqui

util/
São as funções que ajudam o sistema a rodar melhor:
- ArquivoSalvos: cuida de salvar e carregar os dados nos arquivos .txt
- Logger: registra tudo que acontece no sistema em um log
- InputHelper: ajuda na hora de ler as entradas do usuário

Relações entre as classes:
- Piloto e Engenheiro herdam de Pessoa
- Uma Equipe é composta por um piloto e engenheiro
- Uma Corrida associa 3 pilotos para registrar os resultados

COMO EXECUTAR O PROJETO

1. Cadastre um Piloto(minimo 3), Engenheiro, Equipe(dentro da equipe, você coloca os Pilotos e Engenheiros cadastrados)
2. Cadastra Corrida( quantas quiser)
3. MenuRanking - ao puxar MenuRanking voce coloca os pilotos em cada posiçao do ranking e depois puxa a corrida aonde foi feita a disputa

COMO O CHATGPT AJUDOU NO DESENVOLVIMENTO

Durante o desenvolvimento, usamos o ChatGPT como apoio em algumas partes do projeto. Ele ajudou com:

- Criar a classe ArquivoSalvos
- Ter ideias de estrutura: usamos o ChatGPT pra pensar melhor em como dividir as classes, quais relações usar (como herança e composição) e como isso faria sentido num contexto de Fórmula 1
- Implementar o link de Ranking aos pilotos
