FROM clojure
COPY . /usr/src/permissions-client
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/permissions-client
RUN lein deps
CMD ["lein", "test"]
