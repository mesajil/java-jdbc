# Proyecto Java JDBC con PostgreSQL

Este proyecto tiene como objetivo conectarse a una base de datos PostgreSQL utilizando **JDBC** y el driver `.jar` correspondiente. El programa permitirá realizar operaciones básicas para manipular la base de datos, como consultas y modificaciones.

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener lo siguiente instalado:

1. **Java Development Kit (JDK)**: Versión 8 o superior.
2. **Driver JDBC para PostgreSQL**: Archivo `.jar` del driver, como `postgresql-42.7.5-20250414.052837-2.jar`.
3. **Base de datos PostgreSQL**: Configurada y accesible con las credenciales adecuadas.

## Configuración

1. Coloca el archivo del driver JDBC (`postgresql-42.7.5-20250414.052837-2.jar`) en la carpeta `libs` dentro del proyecto.
2. Asegúrate de que la base de datos PostgreSQL esté configurada correctamente y que la tabla `job` exista con los campos esperados.

## Ejecución

Para compilar y ejecutar el proyecto, utiliza el siguiente comando en la terminal:

```bash
javac ConexionPostgres.java && java -cp .:libs/postgresql-42.7.5-20250414.052837-2.jar ConexionPostgres
```
