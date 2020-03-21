DROP TABLE IF EXISTS TBL_EMPLOYEES;
 
CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  deleted boolean DEFAULT false NOT NULL,
  deleted_by character varying(128) COLLATE pg_catalog."default",
  deleted_on timestamp with time zone,
  creation_date timestamp with time zone DEFAULT timestamp 'now ( )'NOT NULL,
  creation_user character varying(128) COLLATE pg_catalog."default" NOT NULL,
  last_modification_date timestamp with time zone,
  last_modification_user character varying(128) COLLATE pg_catalog."default"  
);