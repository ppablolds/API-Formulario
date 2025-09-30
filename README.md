# API de Formulário - Envio de formularios com MailTrap

## 💡 Visão Geral
Esta é a API de backend construída em Java com Spring Boot para o projeto Envio de formularios com MailTrap.

O objetivo principal desta API é gerenciar o fluxo de formularios que suportam a solução tecnológica desenvolvida para envio de formularios por email com facilidade.

🛠️ Tecnologias Utilizadas
A estrutura da API foi desenvolvida utilizando as seguintes tecnologias:

Linguagem: Java 21

Framework: Spring Boot 3.x

Ferramenta de Build: Maven

Outras libs: MailTrap

🚀 Como Executar o Projeto

Siga os passos abaixo para ter uma cópia do projeto em execução na sua máquina local para fins de desenvolvimento e testes.

Pré-requisitos
Certifique-se de ter os seguintes itens instalados:

Java Development Kit (JDK): Versão 21 ou superior.

Maven (ou Gradle).

### 1. Configuração do MailTrap

#### application.properties
Configure o arquivo `src/main/resources/application.properties` com as credenciais do MailTrap

### Exemplo para MailTrap
````application.properties
spring.mail.host=live.smtp.mailtrap.io
spring.mail.port=587
spring.mail.username=api
spring.mail.password=your_password_here
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
````

### 2. Execução
A. Usando a IDE (Recomendado): IntelliJ, Eclipse, VS Code, etc.

Clone o repositório.

Importe o projeto como um projeto Maven/Gradle na sua IDE (IntelliJ, Eclipse, VS Code, etc.).

Localize a classe principal FormularioApplication.java.

Execute a classe (Run As Java Application).

🌍 Endpoints da API
Após a execução, a API estará acessível em http://localhost:8080/email/send.

## Exemplo usando Postman
````json
{
    "to": "seu_email@gmail.com",
    "subject": "Tester",
    "body": "This is a Tester!"
}
````

🧑‍💻 Desenvolvedor
Pablo Silva - Desenvolvedor Backend