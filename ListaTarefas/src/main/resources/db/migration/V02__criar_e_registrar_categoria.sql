CREATE TABLE categoria (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	name varchar(30) NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (id, name)
	values (1, "Google Meu Negócio");
INSERT INTO categoria (id, name)
	values (2, "Prioridade");	