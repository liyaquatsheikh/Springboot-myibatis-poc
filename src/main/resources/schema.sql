CREATE TABLE IF NOT EXISTS PRODUCT(
id        INTEGER PRIMARY KEY,
name     VARCHAR(100) NOT NULL,
status      BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS USER(
id        INTEGER PRIMARY KEY,
name     VARCHAR(100) NOT NULL,
mobileNumber      varchar(100) NOT NULL
);