# Questão 1
# Documentação das Classes Ingresso e IngressoVip

## Ingresso

### Atributos:
- `valor`: Representa o valor do ingresso.

### Métodos:
- `Ingresso(Double valor)`: Construtor que inicializa o valor do ingresso.
- `getValor()`: Retorna o valor do ingresso.
- `toString()`: Retorna uma representação em string do objeto Ingresso.

## IngressoVip

### Atributos:
- `valorAdicional`: Representa o valor adicional do ingresso VIP.

### Métodos:
- `IngressoVip(Double valor, Double valorAdicional)`: Construtor que inicializa o valor do ingresso comum e o valor adicional do ingresso VIP.
- `toString()`: Retorna uma representação em string do objeto IngressoVip. Sobrescreve o método toString da classe Ingresso, exibindo "Ingresso VIP" e a soma do valor com o valor adicional.

# Questão 2
# Documentação das Classes Empregado, Gerente e Vendedor

## Empregado

### Atributos:
- `nome`: Representa o nome do empregado.
- `salario`: Representa o salário do empregado.

### Métodos:
- `Empregado(String nome, Double salario)`: Construtor que inicializa o nome e o salário do empregado.
- `getNome()`: Retorna o nome do empregado.
- `setNome(String nome)`: Define o nome do empregado.
- `getSalario()`: Retorna o salário do empregado.
- `setSalario(Double salario)`: Define o salário do empregado.
- `toString()`: Retorna uma representação em string do objeto Empregado.

## Gerente

### Atributos:
- `departamento`: Representa o departamento do gerente.

### Métodos:
- `Gerente(String nome, Double salario, String departamento)`: Construtor que inicializa o nome, salário e departamento do gerente.
- `getDepartamento()`: Retorna o departamento do gerente.
- `setDepartamento(String departamento)`: Define o departamento do gerente.
- `toString()`: Retorna uma representação em string do objeto Gerente, incluindo o nome, salário e departamento.

## Vendedor

### Atributos:
- `percentualComissao`: Representa o percentual de comissão do vendedor.

### Métodos:
- `Vendedor(String nome, Double salario, Double percentualComissao)`: Construtor que inicializa o nome, salário e percentual de comissão do vendedor.
- `calcularSalario()`: Calcula o salário total do vendedor, incluindo a comissão.
- `toString()`: Retorna uma representação em string do objeto Vendedor, incluindo o percentual de comissão e o salário.

# Questão 3
# Documentação das Classes Passagem, Executiva, Economica e PrimeiraClasse

## Passagem

### Atributos:
- `valor`: Representa o valor da passagem.
- `horarioEmbarque`: Representa o horário de embarque da passagem.
- `data`: Representa a data da passagem.

### Métodos:
- `Passagem(Double valor, String horarioEmbarque, String data)`: Construtor que inicializa o valor, horário de embarque e data da passagem.
- `getValor()`: Retorna o valor da passagem.
- `setValor(Double valor)`: Define o valor da passagem.
- `getHorarioEmbarque()`: Retorna o horário de embarque da passagem.
- `setHorarioEmbarque(String horarioEmbarque)`: Define o horário de embarque da passagem.
- `getData()`: Retorna a data da passagem.
- `setData(String data)`: Define a data da passagem.
- `toString()`: Retorna uma representação em string do objeto Passagem.

## Executiva (Herda de Passagem)

### Atributos Adicionais:
- `valorExecutiva`: Representa o valor adicional da passagem executiva.

### Métodos Adicionais:
- `setValorExecutiva(Double valorAdicional)`: Define o valor adicional da passagem executiva.
- `valorPassagem()`: Calcula o valor total da passagem executiva.
- `acessoRefeicao()`: Exibe os itens de refeição disponíveis para a passagem executiva.
- `toString()`: Retorna uma representação em string do objeto Executiva, incluindo informações da passagem base e o valor adicional.

## Economica (Herda de Passagem)

### Métodos Adicionais:
- `toString()`: Retorna uma representação em string do objeto Economica.

## PrimeiraClasse (Herda de Passagem)

### Atributos Adicionais:
- `valorPrimeiraClasse`: Representa o valor adicional da passagem de primeira classe.

### Métodos Adicionais:
- `getValorPrimeiraClasse()`: Retorna o valor adicional da passagem de primeira classe.
- `setValorPrimeiraClasse(Double valorPrimeiraClasse)`: Define o valor adicional da passagem de primeira classe.
- `valorPassagem()`: Calcula o valor total da passagem de primeira classe.
- `acessoRefeicao()`: Exibe os itens de refeição disponíveis para a passagem de primeira classe.
- `toString()`: Retorna uma representação em string do objeto PrimeiraClasse, incluindo informações da passagem base e o valor adicional.
