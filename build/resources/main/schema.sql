DROP TABLE IF EXISTS acao;

CREATE TABLE acao (
		 id_acao BIGINT AUTO_INCREMENT NOT NULL,
		 empresa VARCHAR(255) NULL,
		 codigo_negociacao VARCHAR(6),
		 setor VARCHAR(30),
		 tipo_acao VARCHAR(20),
		 dividend_yield DOUBLE NULL,
		 PRIMARY KEY (id_acao));