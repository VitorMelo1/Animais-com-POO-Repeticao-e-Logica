# 🐾 Cadastro de Animais

Este projeto é um sistema simples de cadastro de animais desenvolvido em Java. Ele permite registrar informações sobre cachorros e gatos, armazenando seus nomes, raças e idades.

## 🚀 Funcionalidades

- Solicita a quantidade de animais a serem cadastrados.
- Permite inserir nome, raça e idade dos animais.
- Diferencia entre cães e gatos.
- Exibe as informações cadastradas de maneira organizada.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Scanner**: Utilizado para capturar entrada do usuário.

## 📂 Estrutura do Projeto

```
Praticando/
├── Animais.java       # Classe base para os animais
├── Cachorro.java      # Classe específica para cachorros
├── Gato.java          # Classe específica para gatos
├── Apresentacao.java  # Exibe mensagem inicial e obtém a quantidade de animais
└── AnimalMain.java    # Classe principal que gerencia o cadastro
```

## 🎯 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd Praticando
   ```
3. Compile os arquivos Java:
   ```bash
   javac *.java
   ```
4. Execute o programa:
   ```bash
   java AnimalMain
   ```

## 📸 Exemplo de Uso

```
Seja bem-vindo ao cadastro de animais!
Quantos animais deseja cadastrar?
>> 2

Digite o nome do animal: Thor
Digite a raça do animal (Gato ou Cachorro): Cachorro
Digite a idade do animal: 4

Nome: Thor
Raça: Cachorro
Idade: 4
Seu cachorro Thor está cadastrado!

Digite o nome do animal: Luna
Digite a raça do animal (Gato ou Cachorro): Gato
Digite a idade do animal: 2

Nome: Luna
Raça: Gato
Idade: 2
Seu gato Luna está cadastrado!
```

## 🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias! Basta fazer um fork do repositório e abrir um pull request com suas alterações.

---

