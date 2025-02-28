A secutiry of the system is a very important aspect of the system. All security systems are based on authentication and authorization.

- **Authentication** is the process of verifying the identity of a user.

- **Authorization** is the process of verifying what the user has access to.


``` mermaid
classDiagram
    namespace auth {
        class AuthController {
            +register(RegisterIn RegisterIn): TokenOut
            +login(LoginIn loginIn): TokenOut
        }
        class RegisterIn {
            -String name
            -String email
            -String password
        }
        class LoginIn {
            -String name
            -String email
        }
        class TokenOut {
            -String token
        }
    }
    namespace auth-service {
        class AuthResource {
            +register(RegisterIn RegisterIn): TokenOut
            +login(LoginIn loginIn): TokenOut
        }
        class AuthService {
            +register(Register): Regiter
            +login(LoginIn loginIn): String
        }
        class Register {
            -String id
            -String name
            -String email
            -String password
        }
    }
    <<Interface>> AuthController
    AuthController ..> RegisterIn
    AuthController ..> LoginIn
    AuthController ..> TokenOut

    AuthController <|-- AuthResource
    AuthResource *-- AuthService
    AuthService ..> Register
```