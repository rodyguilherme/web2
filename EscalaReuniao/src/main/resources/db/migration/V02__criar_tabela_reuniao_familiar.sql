CREATE TABLE reuniao_familiar (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    data DATE NOT NULL,
    dia_semana VARCHAR(30) NOT NULL,
    irmao_responsavel VARCHAR(100) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    horario VARCHAR(10) NOT NULL,
    atendente VARCHAR(100) NOT NULL,
    user_id BIGINT(20) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Inserindo alguns dados do PDF
INSERT INTO reuniao_familiar (data, dia_semana, irmao_responsavel, endereco, horario, atendente, user_id)
VALUES 
('2026-08-02', '1° DOMINGO', 'GRAÇA', 'Morro das Andorinhas', '14:30', 'KELINHO', 1),
('2026-08-05', '1ª QUARTA-FEIRA', 'NEUZA', 'R. Tucano, 186 - Vila Santo Antônio', '20:00', 'PAULO', 1),
('2026-08-07', '1ª SEXTA-FEIRA', 'BRITO', 'R. José Pereira de Macedo, 215 - Vl. Albertina', '20:00', 'OLIVINO', 2),
('2026-08-11', '2ª TERÇA-FEIRA', 'BENEDITA (FIA)', 'R. Aristides Inácio de Sousa, 52 - Biquinha', '20:00', 'RAIMUNDO', 2),
('2026-08-12', '2ª QUARTA-FEIRA', 'CIDA', 'R. Tucano, 198 - Vila Santo Antônio', '20:00', 'MARCOS', 1);
