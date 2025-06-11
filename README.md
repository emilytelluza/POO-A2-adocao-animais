# 🐾 Aplicativo de Adoção de Animais

Este é um projeto Java orientado a objetos desenvolvido com foco em:
- Herança, polimorfismo, abstração, encapsulamento
- Manipulação de arquivos com persistência binária
- Menu interativo no terminal
- Separação por pacotes (`model`, `service`, `util`, `main`)

---

## 📁 Estrutura do Projeto

```
adocao-animais/
├── bin/                 # Arquivos .class compilados
├── dados/               # Arquivos binários de persistência
├── src/
│   ├── main/            # Classe Main
│   ├── model/           # Classes: Animal, Cachorro, Gato, Pessoa etc.
│   ├── service/         # Classe SistemaAdocao (lógica central)
│   └── util/            # Classe Persistencia (leitura/gravação binária)
```

---

## ▶️ Como Executar (Windows - PowerShell)

### 1. Acesse a pasta do projeto

```powershell
cd caminho/para/adocao-animais
```

### 2. Compile os arquivos

```powershell
cd caminho/para/adocao-animais/src
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { javac -d bin $_.FullName }
```

### 3. Execute o programa

```powershell
cd ..
java -cp bin main.Main
```

---

## 💾 Persistência de Dados

- Os dados cadastrados são salvos automaticamente como arquivos `.bin` na pasta `dados/`.
- Arquivos utilizados:
  - `dados/animais.bin`
  - `dados/adotantes.bin`
  - `dados/adocoes.bin`

---

## 📌 Funcionalidades

- Cadastro de cães e gatos com características específicas
- Cadastro de adotantes
- Adoção de animais (verifica se já foram adotados)
- Listagem de animais disponíveis
- Listagem de adoções realizadas

---

## 📚 Paradigmas Utilizados

- ✅ Herança (ex: `Cachorro` e `Gato` herdam de `Animal`)
- ✅ Polimorfismo (`getDescricao()` sobrescrito)
- ✅ Classe abstrata (`Animal`, `Pessoa`)
- ✅ Encapsulamento (atributos privados com getters/setters)
- ✅ Uso de `ArrayList` e persistência com `ObjectOutputStream`

---

## 👨‍💻 Desenvolvido por
- Emily Bernardes Alberton