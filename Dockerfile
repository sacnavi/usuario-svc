# Usa una imagen base de OpenJDK con JRE optimizado
FROM openjdk:17-jdk-slim

# Crea un directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor

COPY target/usuario-service-0.0.1-SNAPSHOT.jar app.jar

# Establece variables de entorno predeterminadas (puedes sobrescribirlas al iniciar el contenedor)
#ENV SPRING_PROFILES_ACTIVE=prod
#ENV SPRING_DATA_MONGODB_URI=mongodb://localhost:27017/usuariodb
ENV APP_DB_URL=mongodb://admin:admin123@mongodb:27017/usuariodb
ENV APP_DB=usuariodb
ENV APP_USR=admin
ENV APP_PASS=admin123

# Expone el puerto en el que se ejecuta la aplicación
EXPOSE 8081

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
