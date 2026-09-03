# VibeMuSiC

## Projeto em Java utilizado na disciplina de gestão da qualidade de software do UniBH Vepasiano
Prof. Fabricio Valadares -- Projeto baseado no problema proposto pela Professora Rafaela Moreira.

O objetivo é revisar os conceitos de básicos da programação orientada a objetos e da linguagem de programação Java.

**1.1. Projeto: Motor de playlist da VibeMuSiC**

Vocês estão participando do processo seletivo para uma vaga de Engenheiros de Software
da VibeMuSiC, uma startup de streaming de áudio que promete revolucionar o mercado.
A equipe de qualidade (QA) e Produto já mapeou as necessidades dos ouvintes em
formato de histórias de usuário e, na primeira versão, será necessário criar e administrar
as próprias playlists para organizar suas músicas favoritas.

Sua tarefa é implementar o sistema, garantindo que todos os critérios de aceite sejam
rigorosamente cumpridos.

**1.2. Backlog do Produto**

Essa seção apresenta as histórias de usuários que serão implementadas.

**1.2.1. US01 – Adicionar música**

Como usuário apaixonado por música, quero adicionar faixas à minha playlist para que
eu possa organizar e personalizar minha experiência musical.

**Critérios de aceite:**

- A música deve ser armazenada na playlist.
- O título e o artista não podem estar em branco.

**1.2.2. US02 – Listar músicas**

Como usuário organizando uma festa, quero visualizar todas as músicas cadastradas e o
tempo total de duração da playlist, para que eu saiba se tenho música suficiente para o
evento.

**Critérios de aceite:**
- A lista deve apresentar as músicas formatadas de forma legível (ex: **1.Comfortably Numb - Pink Floyd (6.35 min)**).
- A duração total deve ser exibida ao final da lista.

**1.2.3. US03 – Remover música**

Como ouvinte que muda de gosto rapidamente, quero remover uma música buscando
apenas pelo seu título, para que manter minha playlist atualizada.

**Critérios de aceite:**
- A busca para remoção deve ignorar se o usuário digitou letras maiúsculas ou
minúsculas.

**1.3. Requisitos técnicos e entrega**

A solução deve utilizar as boas práticas da programação orientada a objetos, como
encapsulamento, responsabilidade única e baixo acoplamento. As músicas serão
armazenadas em um ArrayList<Musica> e a interface do usuário implementada na
classe Main.java. O código fonte deve ser disponibilizado em repositório público do
github, e inserido no campo próprio do Ulife.