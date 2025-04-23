# Employee Payment System - OOP Java 💰

![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)
![OOP](https://img.shields.io/badge/OOP-Implemented-success)
![License](https://img.shields.io/badge/License-MIT-green)

Projeto em Java desenvolvido para praticar conceitos avançados de orientação a objetos como herança, polimorfismo e sobrescrita de métodos em um sistema de pagamento de funcionários.

## 📌 Visão Geral

Sistema de gerenciamento de pagamentos que demonstra:
- Hierarquia de classes de funcionários
- Cálculos de pagamento polimórficos
- Boas práticas de encapsulamento
- Design extensível para novos tipos de funcionários

## 🚀 Funcionalidades Principais

✔️ Cadastro de diferentes tipos de funcionários  
✔️ Cálculo automático de pagamentos  
✔️ Geração de relatórios de pagamento  
✔️ Implementação dos 4 pilares da OOP  

### Tipos de Funcionários Implementados
- **Assalariados** (salário fixo)
- **Gerentes** (salário + bônus)
- **Vendedores** (comissão por vendas)

## 🛠️ Tecnologias Utilizadas

| Categoria       | Tecnologias/Conceitos                          |
|-----------------|-----------------------------------------------|
| Linguagem       | Java 17+                                      |
| Paradigma       | Programação Orientada a Objetos               |
| Princípios OOP  | Herança, Polimorfismo, Encapsulamento, Abstração |
| Ferramentas     | JUnit (testes), Git (controle de versão)      |

## 🗂️ Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/
│   │   ├── model/
│   │   │   ├── Employee.java          # Classe base abstrata
│   │   │   ├── SalariedEmployee.java  # Assalariados
│   │   │   ├── Manager.java           # Gerentes
│   │   │   └── SalesPerson.java       # Vendedores
│   │   ├── service/
│   │   │   └── PaymentService.java    # Lógica de cálculo
│   │   └── Main.java                  # Aplicação principal
│   └── resources/
└── test/
    ├── java/
    │   └── unit/                      # Testes unitários
    └── resources/
