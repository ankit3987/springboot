FROM openjdk:17

WORKDIR app

RUN microdnf install findutils

COPY . .

#RUN npm install
RUN chmod +x gradlew

EXPOSE 8080

#RUN chmod +x gradlew

CMD ["./gradlew", "bootRun"]