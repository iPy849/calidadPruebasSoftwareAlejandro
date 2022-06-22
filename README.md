# calidadPruebasSoftwareAlejandro
App para la materia de calidad y pruebas de software

## Para ejecutar el entorno de pruebas de integración:
Levantar un contenedor docker, los pasos son los siguientes:
1. ```
   docker pull mysql
   ```
2. ```
   docker run -p 3307:3306 --name mysql-dbunit -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest
   ```
3. ```
   docker exec -it mysql-dbunit mysql -uroot -p
   ```
4. La contraseña de la base de datos es **123456** como se definió anteriormente
5. ```mysql
    CREATE DATABASE IF NOT EXISTS dbunit;
    use dbunit;
    CREATE TABLE IF NOT EXISTS usuarios (
        id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(30),
        password VARCHAR(10),
        email VARCHAR(100),
        tipo VARCHAR(15)  
    );
    ```