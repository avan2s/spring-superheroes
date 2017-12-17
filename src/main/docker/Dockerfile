FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ADD wrapper.sh wrapper.sh
RUN bash -c 'chmod +x /wrapper.sh'
ENTRYPOINT ["/bin/bash", "/wrapper.sh"]