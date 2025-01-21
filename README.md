# Foro Hub API REST

Este es un proyecto para construir una API REST para un foro llamado "Foro Hub", donde los usuarios pueden crear tópicos, responder a ellos y realizar interacciones dentro de una comunidad. A través de esta API, se gestionan los tópicos, la autenticación de usuarios y la seguridad mediante tokens JWT.

**Tecnología utilizada**: IntelliJ IDEA, Node.js, JWT, Base de datos (elige la que prefieras).

Un agradecimiento especial a **Alura** por la inspiración y los recursos proporcionados para desarrollar este proyecto.

## Características

- **Listar Tópicos**: Permite obtener una lista de todos los tópicos creados por los usuarios.
- **Crear Tópicos**: Los usuarios autenticados pueden crear nuevos tópicos en el foro.
- **Eliminar Tópicos**: Los usuarios pueden eliminar tópicos existentes, siempre que estén autenticados.
- **Autenticación**: Utiliza tokens JWT para la autenticación de usuarios. Solo los usuarios autenticados pueden crear y eliminar tópicos.

## Endpoints

### 1. Listar Tópicos
- **Método**: `GET`
- **Ruta**: `/tópicos`
- **Descripción**: Obtiene una lista de todos los tópicos creados en el foro.

### 2. Crear un Tópico
- **Método**: `POST`
- **Ruta**: `/tópicos`
- **Descripción**: Permite a los usuarios crear un nuevo tópico en el foro.
- **Requiere autenticación** (Bearer token).

### 3. Eliminar un Tópico
- **Método**: `DELETE`
- **Ruta**: `/tópicos/{id}`
- **Descripción**: Permite eliminar un tópico específico.
- **Requiere autenticación** (Bearer token).

## Seguridad

La API utiliza **JSON Web Tokens (JWT)** para la autenticación. Los usuarios deben autenticarse antes de poder crear o eliminar tópicos. 

Para obtener un token JWT, utiliza el endpoint de autenticación.

### 4. Autenticación
- **Método**: `POST`
- **Ruta**: `/auth`
- **Descripción**: Autentica a un usuario y devuelve un token JWT.
- **Campos requeridos**: `email`, `contraseña`.

## Tecnología

- **IDE**: IntelliJ IDEA
- **Base de datos**: PostgreSQL
- **Autenticación**: JWT (JSON Web Tokens).

## Instalación

1. Clona este repositorio:
    ```bash
    git clone https://github.com/tu-usuario/foro-hub.git
    ```

2. Instala las dependencias:
    ```bash
    cd foro-hub
    npm install
    ```

3. Configura tu base de datos.

4. Ejecuta el servidor:
    ```bash
    npm start
    ```

El servidor estará corriendo en `http://localhost:8080`.

## Contribuciones

¡Contribuye! Si deseas agregar más funcionalidades o mejoras, no dudes en hacer un pull request. Este es un proyecto que puede evolucionar con la creatividad de todos.

## Agradecimientos

Gracias a **Alura LATAM** y a **ORACLE** por ofrecer los recursos y la motivación para realizar este proyecto.

## Badges

![image alt](https://github.com/GabbyGeek/Foro-Hub/blob/main/Badge-Spring.png?raw=true)

