## Setup

Para utilizar o código deste repositório, siga as instruções a seguir:

Crie um ambiente virtual do Python:

``` shell
python3 -m venv env
```

Ative o ambiente virtual (**você deve fazer isso sempre que for executar algum script deste repositório**):

- Linux/MacOS:

    ``` shell
    . env/bin/activate
    ```

- Windows:

    ``` shell
    env\Scripts\activate
    ```


Instale as dependências com:

``` shell
pip3 install -r requirements.txt
```

## Deployment

O material utiliza o mkdocs para gerar a documentação. Para visualizar a documentação, execute o comando:

``` shell
mkdocs serve
```

Para subir ao GitHub Pages, execute o comando:

``` shell
mkdocs gh-deploy
```
