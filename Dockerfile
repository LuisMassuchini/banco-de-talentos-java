# Passo 1: Imagem base com Java 21 já instalado.
FROM eclipse-temurin:21-jdk-jammy

# Passo 2: Define o diretório de trabalho dentro do container.
WORKDIR /app

# Passo 3: Copia o arquivo .jar da nossa aplicação para dentro do container.
# O arquivo .jar é gerado pelo Maven na pasta 'target'. Nós o renomeamos para app.jar por simplicidade.
COPY target/*.jar app.jar

# Passo 4: Comando que será executado quando o container iniciar.
ENTRYPOINT ["java", "-jar", "app.jar"]