
The main functionality of Gateway Microservice is to route the incoming requests to the appropriate microservice, therefore, it is the entry point for all the incoming requests. In counterpart, each microservice have to expose their own port and endpoints to the internet, which is not a good practice. The Gateway Microservice will act as a reverse proxy and route the incoming requests to the appropriate microservice. Also, it will also handle the authentication and authorization of the incoming requests.

``` mermaid
flowchart LR
  subgraph api
    direction TB
    loadbalance --> gateway
    gateway --> account
    gateway --> auth
    gateway --> others
    account --> db@{ shape: cyl, label: "Database" }
    others --> db
    auth --> account
  end
  internet -->|request| loadbalance
```

The key functionalities of Gateway Microservice are:

- **Routing**: it will route the incoming requests to the appropriate microservice.
- **Authentication/Authorization**: it will handle the authentication and the authorization of the incoming requests.


## Gateway-Service

``` tree
api
    gateway-service
        src
            main
                java
                    store
                        gateway
                            GatewayApplication.java
                resources
                    application.yaml
        pom.xml
        Dockerfile
```

??? info "Source"

    === "pom.xml"

        ``` { .yaml .copy .select linenums="1" }
        - -8<-- "https://raw.githubusercontent.com/Insper/platform/refs/heads/main/api/gateway-service/pom.xml"
        ```

    === "application.yaml"

        ``` { .yaml .copy .select linenums="1" }
        - -8<-- "https://raw.githubusercontent.com/Insper/platform/refs/heads/main/api/gateway-service/src/main/resources/application.yaml"
        ```

    === "GatewayApplication.java"

        ``` { .java .copy .select linenums='1' }
        - -8<-- "https://raw.githubusercontent.com/Insper/platform/refs/heads/main/api/gateway-service/src/main/java/store/gateway/GatewayApplication.java"
        ```

    === "Dockerfile"

        ``` { .dockerfile .copy .select linenums="1" }
        -  -8<-- "https://raw.githubusercontent.com/Insper/platform/refs/heads/main/api/gateway-service/Dockerfile"
        ```
