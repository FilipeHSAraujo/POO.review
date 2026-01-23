# 🧠 Programação Orientada a Objetos (POO) — Polimorfismo em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge)
![Polimorfismo](https://img.shields.io/badge/Pilar-Polimorfismo-green?style=for-the-badge)

Este repositório contém um projeto desenvolvido em **Java** com foco no pilar **Polimorfismo**, um dos conceitos fundamentais da **Programação Orientada a Objetos (POO)**.

O projeto possui caráter **educacional**, sendo ideal para estudantes que estão aprendendo POO e desejam compreender como o polimorfismo funciona na prática.

---

## 📚 O que é Programação Orientada a Objetos?

A **Programação Orientada a Objetos (POO)** é um paradigma de programação que organiza o código em **classes** e **objetos**, aproximando o software de situações do mundo real.

Na POO, cada objeto possui:
- **Atributos** → características
- **Métodos** → comportamentos

Os quatro pilares da POO são:
- Encapsulamento  
- Herança  
- **Polimorfismo**  
- Abstração  

Este projeto foca especificamente no pilar **Polimorfismo**.

---

## 🔄 O que é Polimorfismo?

O **polimorfismo** permite que um mesmo método tenha **comportamentos diferentes**, dependendo do objeto que o executa.

📌 Em Java:
- Um objeto pode ser referenciado por uma **classe pai**
- O método executado depende da **classe filha instanciada**

Isso torna o código mais **flexível**, **organizado** e **fácil de manter**.

---

## 🔎 Exemplo conceitual de Polimorfismo

Imagine:
- Uma classe `Animal` com o método `fazerSom()`
- Classes `Cachorro` e `Gato` que herdam de `Animal`

Mesmo chamando `fazerSom()` usando a referência `Animal`, cada classe executa seu próprio comportamento:

- `Cachorro` → late  
- `Gato` → mia  

Esse comportamento diferente para o mesmo método caracteriza o **polimorfismo**.

---

## 💡 Como o Polimorfismo é aplicado neste projeto?

Neste projeto:

- Existe uma **classe base (pai)** com métodos genéricos
- Existem **classes filhas** que sobrescrevem esses métodos
- O polimorfismo ocorre por meio da **sobrescrita de métodos** (`@Override`)
- Os objetos são manipulados usando referências da **classe pai**

---
