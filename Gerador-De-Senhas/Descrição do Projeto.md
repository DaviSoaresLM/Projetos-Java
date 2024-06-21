## Descrição do Projeto: Gerador de Senhas em Java

**Objetivo:**
O projeto "Gerador de Senhas em Java" tem como objetivo criar um programa que gera senhas aleatórias com base no tamanho especificado pelo usuário. Utiliza-se a classe `SecureRandom` para garantir a aleatoriedade dos caracteres gerados, incluindo letras maiúsculas e minúsculas, números e alguns caracteres especiais como '@', '#', '$', '%', '&' para aumentar a complexidade das senhas.

**Funcionalidades:**
- **Definição do Tamanho da Senha:** O usuário pode inserir o tamanho desejado para a senha.
- **Geração de Senha Aleatória:** Com base no tamanho especificado, o programa utiliza caracteres aleatórios para criar a senha.
- **Exibição da Senha Gerada:** Após a geração, a senha é exibida na tela para o usuário.

**Componentes do Projeto:**

**Classes Utilizadas:**
- `SecureRandom`: Utilizada para gerar números aleatórios seguros.
- `Scanner`: Utilizada para capturar a entrada do usuário a partir do console.

**Estrutura do Código:**
- **Método `gerarSenha(int tamanho)`:** Implementa a lógica para gerar uma senha aleatória com o tamanho especificado.
  - Utiliza um conjunto predefinido de caracteres para compor a senha.
  - Itera sobre o tamanho fornecido para adicionar caracteres aleatórios à senha.
- **Método `main(String[] args)`:** Ponto de entrada do programa onde a interação com o usuário e a chamada ao método de geração de senha são realizadas.

**Benefícios do Projeto:**
- **Utilidade Prática:** Oferece uma solução simples e eficiente para gerar senhas seguras.
- **Aprendizado de Conceitos:** Ajuda a praticar conceitos como manipulação de strings, geração de números aleatórios e estruturas de repetição.
- **Aplicação de Segurança:** Demonstra a importância de usar métodos seguros para geração de senhas em aplicações reais.

**Possíveis Extensões e Melhorias:**
- **Personalização Avançada:** Adição de opções para incluir mais caracteres especiais ou restringir tipos específicos de caracteres.
- **Integração com Interfaces Gráficas:** Desenvolvimento de uma interface gráfica para uma experiência mais amigável ao usuário.
- **Armazenamento Seguro de Senhas:** Implementação de métodos para armazenar senhas de forma segura, considerando boas práticas de segurança de dados.

