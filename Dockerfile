FROM clojure
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/permissions-client

COPY project.clj /usr/src/permissions-client/
RUN lein deps

COPY . /usr/src/permissions-client
CMD ["lein", "test"]
