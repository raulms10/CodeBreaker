FROM openjdk:8

ENV SBT_VERSION 1.1.2

RUN \
  curl -L -o sbt-$SBT_VERSION.deb http://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion
RUN mkdir -p /usr/apps/codebreaker/backend
WORKDIR /usr/apps/codebreaker/backend
COPY . /usr/apps/codebreaker/backend
EXPOSE 9000
CMD ["sbt","run"]