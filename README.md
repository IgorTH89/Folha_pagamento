# Sistema de Folha de Pagamento

Este projeto é uma aplicação simples em Java desenvolvida para demonstrar conceitos fundamentais de Programação Orientada a Objetos (POO), 
como abstração, herança e polimorfismo, aplicados a um cenário real de gerenciamento de folha de pagamento de uma empresa.

# Funcionalidades

O sistema calcula e exibe o salário mensal de diferentes tipos de colaboradores, considerando suas regras de remuneração específicas:

- Gerente: Salário base + Bônus de performance.
- Desenvolvedor: Salário fixo + Bônus por projeto.
- Estagiário: Bolsa de estudos fixa.

# 🧠 Conceitos de POO aplicados

- Abstração: A classe funcionario define um molde geral (abstrato) para todos os colaboradores.
- Herança: As classes específicas (Gerente, Desenvolvedor, Estagiário) estendem a classe base funcionario.
- Polimorfismo: O método calcular_salario() é sobrescrito (@Override) em cada subclasse para fornecer um comportamento específico,
permitindo tratar diferentes objetos de forma genérica em uma lista de funcionários.

# Como Executar

1. Certifique-se de ter o JDK(Java Development Kit) instalado na sua máquina.
2. Clone este repositório -> git clone https://github.com/seu-usuario/nome-do-repositorio.git
3. Compile os arquivos -> javac *.java
4. Execute o programa -> java salarios_empresa
