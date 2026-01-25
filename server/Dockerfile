# syntax=docker/dockerfile:1

FROM gradle:8.14.2-jdk21-alpine AS build

ENV CI=true

WORKDIR /app

COPY build.gradle.kts settings.gradle.kts ./

RUN gradle dependencies --no-daemon

COPY ./ ./

RUN gradle build --no-daemon


FROM gcr.io/distroless/java21-debian12 AS stage

ENV JAVA_TOOL_OPTIONS="-Xmx1024m"

WORKDIR /app

COPY --from=build /app/apiserver/build/libs/apiserver-*.jar ./apiserver.jar

CMD ["apiserver.jar"]
