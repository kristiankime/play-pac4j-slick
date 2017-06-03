# Loing/Users schema for pac4j http://www.pac4j.org/2.0.x/docs/authenticators/sql.html

# --- !Ups

CREATE TABLE logins
(
    id VARCHAR(255) PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    linkedid VARCHAR(255),
    serializedprofile VARCHAR(10000)
);

CREATE INDEX ON logins (username);
CREATE INDEX ON logins (linkedid);

# --- !Downs

DROP TABLE User;