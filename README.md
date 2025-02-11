Lunes 2025/01/27 API REST con Java Spring Boot

# Evaluación Técnica: "Mini API o Aplicación Dinámica"

# Desarrolar API REST con Java y Framework Spring Boot

Enunciado:

Crea una pequeña aplicación o servicio que permita realizar lo siguiente:

1. Registrar usuarios: Los datos del usuario deben incluir al menos nombre, correo electrónico y edad.
2. Listar usuarios registrados: Devuelve todos los usuarios registrados.

# Resolución de la evaluación By Olga Viviana

Guía paso a paso para crear una página web simple con JavaScript puro.

Estructura del proyecto

plaintext
- src/
    - main/
        - java/
            - com/
                - example/
                    - demo/
                        - DemoApplication.java
                        - UserController.java
                        - User.java

#-----------------

Paso 1: Instalar Java y Maven

Tener instalados Java Development Kit (JDK) y Apache Maven en tu máquina. 

Podemos descargarlos desde sus sitios oficiales:

•	JDK (https://www.oracle.com/ar/java/technologies/downloads/)

•	Maven (https://maven.apache.org/download.cgi)

#-----------------

Paso 2: Crear un nuevo proyecto Spring Boot

1.	Visitar el sitio web de Spring Initializr: Spring Initializr (https://start.spring.io/)

2.	Configurar el proyecto:

      o	Project: Maven Project

      o	Language: Java

      o	Spring Boot: 3.0.2 (o la última versión disponible)

      o	Project Metadata:

      	Group: com.apirest

      	Artifact: java

      	Name: java

      	Package name: com.apirest.java

      	Packaging: War

      	Java: 21 (o la versión que prefieras)

      o	Dependencias: Spring Web


Generar el proyecto:

•	Hacer clic en "Generate" para descargar un archivo ZIP con el proyecto configurado.

Extraer el archivo ZIP:

•	Descomprimir el archivo ZIP en tu directorio de trabajo.


#-----------------

Paso 3: Importar el proyecto en tu IDE

Podemos utilizar cualquier IDE que soporte proyectos de Spring Boot. 


Aquí algunos de los más populares:

•	IntelliJ IDEA (https://www.jetbrains.com/es-es/idea/download/?section=windows)

•	Eclipse

•	Spring Tool Suite (STS)



Yo voy a descargar Intellij IDEA del sitio oficial (https://www.jetbrains.com/es-es/idea/download/?section=windows)

Luego realizo la instalación de Intellij IDEA

Luego de la instalación, abro el IDE Intellij IDEA y continuo asi:


1.	Importa el proyecto como un proyecto Maven existente.

2.	Espera a que el IDE descargue las dependencias.

#-----------------

Quiza sea necesario agregar en Microsoft defender la carpeta del proyecto.

#-----------------

Paso 4: Crear las clases necesarias

1. "DemoApplication.java" 
   Esta clase es la principal de tu aplicación Spring Boot.



2. "UserController.java" 
   Esta clase será tu controlador REST.



3. "User.java" 
   Esta clase representa la entidad usuario.

#-----------------

Paso 5: Ejecutar el proyecto

1.	Ejecutar la aplicación desde tu IDE:

      o	En IntelliJ IDEA: Hacer clic derecho sobre la clase "DemoApplication" y selecciona "Run 'DemoApplication'".

      o	En Eclipse o STS: Hacer clic derecho sobre el proyecto y selecciona "Run As" -> "Spring Boot App".

      

2.	Verificar que el servidor esté corriendo:

      o	La aplicación debería estar ejecutándose en http://localhost:8080.

#-----------------

Paso 6: Probar la API

Podemos usar herramientas como Postman o cURL para probar los endpoints. 

Yo elijo utilizar Postman asi:

•	Registrar un usuario (POST /usuarios)

    json
    {
    "nombre": "Juan Pérez",
    "correo": "juan@example.com",
    "edad": 25
    }



•	Listar usuarios registrados (GET /usuarios) 

    Simplemente realiza una petición GET a http://localhost:8080/usuarios.


#-----------------

Luego de haber realizado la pruebas utilizando Postman, detengo el proceso con comando:

    “spring-boot:stop”

#-----------------


Subir proyecto a GITHUB

Ingreso a mi cuenta de GITHUB
Selecciono crear nuevo repositorio “api-rest-java-spring-boot”

En la terminal de Intellij IDEA escribo el comando:

    git init



Creo el archivo “readme.md” donde voy a resumir el enunciado de la evaluación técnica y mi resolución.

En la terminal del proyecto escribo los comandos:

    echo "# api-rest-java-spring-boot" >> README.md

Edito el archivo readme.md
Luego continúo ejecutando los comandos para añadir el archivo readme.md al repositorio.

    git add README.md
    git commit -m "Iniciando con readme.md"
    git branch -M main
    git remote add origin https://github.com/vdviviana/api-rest-java-spring-boot.git
    git push -u origin main

Crear archivo “.gitignore” y luego le agrego las librerías y dependencias.
Añadir archivo “.gitignore" al repositorio web.

    git add .gitignore
    git commit -m "Añadiendo .gitignore para excluir dependencias y archivos innecesarios"
    git push

Para añadir el resto de todo el proyecto (los archivos html, css, y javascript) al Repositorio, escribo en la terminal de Visual Studio los siguientes comandos:

    git add .
    git commit -m "Subiendo los archivos primera versión"
    git push


#--------- FIN ψ (｀∇´) ψ --------


