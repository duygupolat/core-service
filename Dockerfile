FROM adoptopenjdk:14.0.1_7-jre-hotspot

# os linux
# jre / dotnet runtime
# executable

EXPOSE 8080

ARG JAR_FILE=build/libs/*.jar

# copy executable into image
ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]