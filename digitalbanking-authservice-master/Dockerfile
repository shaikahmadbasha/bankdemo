FROM maven

RUN curl -sSL https://github.com/amalgam8/amalgam8/releases/download/v0.4.0/a8sidecar.sh | sh

ENV A8_SERVICE=authservice:v1
ENV A8_ENDPOINT_PORT=8160
ENV A8_ENDPOINT_TYPE=http
ENV A8_REGISTRY_URL=http://ADM-a8-registry.mybluemix.net
ENV A8_REGISTRY_POLL=60s
ENV A8_CONTROLLER_URL=http://ADM-a8-controller.mybluemix.net
ENV A8_CONTROLLER_POLL=60s
ENV A8_LOG=enable_log


RUN apt-get install git

RUN git clone https://github.com/caprepo/digitalbanking-authservice.git

RUN cd /digitalbanking-authservice

RUN mvn -f /digitalbanking-authservice/pom.xml clean install -DskipTests

EXPOSE 8160

ENTRYPOINT ["a8sidecar", "--register", "--supervise", "java", "-jar", "/digitalbanking-authservice/target/authservice-0.0.1-SNAPSHOT.war"]
