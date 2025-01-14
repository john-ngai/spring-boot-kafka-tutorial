# Tutorial: Spring Boot and Apache Kafka

**Reference:** [devs5003. (17 Apr 2024). How to work with Apache Kafka in Spring Boot? JavaTechOnline.](https://javatechonline.com/how-to-work-with-apache-kafka-in-spring-boot/#What_are_the_limitations_of_using_JMS_Java_Message_Service)

## Getting Started

1. Download [Apache Kafka v2.6.0](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.6.0/kafka_2.12-2.6.0.tgz). Then extract the compressed file and move it into any directory of your choice.

2. From the command line, `cd` into the kafka folder.

3. `ls bin` to identify the Zookeeper start script path (e.g. `zookeeper-server-start.sh`).

4. `ls config` to identify the Zoopkeeper config file path (e.g. `zookeeper.properties`).

5. Once the paths have been identified, start the Zookeeper server using the following template: `bin/<script file> config/<config file>`. For example, `bin/zookeeper-server-start.sh config/zookeeper.properties`.

6. In another terminal, `ls bin` to identify the Kafka server start script path (e.g. `kafka-server-start.sh`).

7. `ls config` to identify the Kafka server config file path (e.g. `server.properties`).

8. Once the paths have been identified, start the Kafka server using the same template from step 5 (e.g. `bin/kafka-server-start.sh config/server.properties`).

9. In another terminal, start the Spring Boot server using `mvn spring-boot:run`.

### Producing and Consuming Messages

Once the Spring Boot server been started, messages can be created by navigating to the URL path using various parameter values:

`http://localhost:9090/send?msg=hello world`

`http://localhost:9090/send?msg=hello brave new world`

Upon success, the web page will display the text `'<message>' sent successfully!`

From the terminal running the Spring Boot server, similar logs are also displayed upon success:

`MESSAGE SENT FROM PRODUCER END -> <message>`

`MESSAGE RECEIVED AT CONSUMER END -> <message>`

