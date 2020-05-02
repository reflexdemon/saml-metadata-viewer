FROM openjdk:14-alpine
COPY build/libs/saml-metatada-viewer-*-all.jar saml-metatada-viewer.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "saml-metatada-viewer.jar"]