# validation-security-challenge
Validação de dados com Bean Validation, autenticação e autorização com OAuth2 e JWT.

## Sobre o projeto:

- A proposta do projeto é apartir de um projeto base realizar a validação de dados da classe City e Event com o Bean Validadion,
 realizando as validações de atributos e construtores de acordo com a proposta do projeto.
 Também será incluido neste projeto as configurações necessárias para se trabalhar com autorização e autenticação com o 
 OAuth2 e token JWT. Será feito a configuração das rotas para os usuarios CLIENT e ADMIN de acordo com o nivel de acesso de cada perfil. 
 Os detalhes de implementação já estão escritos nos testes automatizados do projeto base (TDD), a proposta é fazer as implementações 
 necessárias para que os testes passem.
 
 ## Modelo conceitual do projeto:
 
 ![Web 1](https://github.com/Romariorfr/validation-security-challenge/blob/master/backend/Assets/modelo_conceitual.png)
 
## Principais bibliotecas e tecnologias utilizadas no backend:
- Java
- Spring Boot
- JPA / Hibernate
- Banco de dados H2
- OAuth2
- JSON Web Token (JWT)
- Jakarta Bean Validation
- Apache Maven


# Como rodar a aplicação na sua maquina


```bash
# clonar repositório
git clone https://github.com/Romariorfr/validation-security-challenge

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```
 
 
 


