# Sistema de Pagamento de Funcionários - Java OOP 💼💰

![Java](https://img.shields.io/badge/Java-11%2B-blue?logo=java)
![OOP](https://img.shields.io/badge/OOP-Herança%2FPolimorfismo-success)
![License](https://img.shields.io/badge/License-MIT-green)

Sistema de cálculo de pagamentos para funcionários regulares e terceirizados, demonstrando conceitos de Programação Orientada a Objetos em Java.

## 📌 Visão Geral

Sistema que permite:
- Cadastro de funcionários (regulares e terceirizados)
- Cálculo automático de pagamentos
- Sobrescrita de métodos para cálculo especializado
- Listagem de pagamentos

## 🚀 Funcionalidades

✔️ Cadastro de funcionários regulares e terceirizados  
✔️ Cálculo polimórfico de pagamentos  
✔️ Diferença no cálculo para funcionários terceirizados (+10% na adicional)  
✔️ Listagem formatada dos pagamentos  

## 🛠️ Tecnologias Utilizadas

- **Java 11+**
- **POO Concepts**:
  - Herança (`OutsourcedEmployee extends Employee`)
  - Polimorfismo (`@Override` no método `payment()`)
  - Encapsulamento (atributos privados com getters/setters)
- **Entrada/Saída** com `Scanner` e `Locale`

## 🗂️ Estrutura do Projeto

```bash
src/
├── entities/
│   ├── Employee.java            # Classe base de funcionário
│   └── OutsourcedEmployee.java  # Funcionário terceirizado
└── Program.java                 # Classe principal
