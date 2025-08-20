-- Usuwanie tabel jeśli istnieją (opcjonalnie)
DROP TABLE IF EXISTS interviews;
DROP TABLE IF EXISTS applications;
DROP TABLE IF EXISTS positions;
DROP TABLE IF EXISTS candidates;

-- Tabela kandydatów
CREATE TABLE IF NOT EXISTS candidates (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    cv_path VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
    );

-- Tabela stanowisk
CREATE TABLE IF NOT EXISTS positions (
                                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                         title VARCHAR(100) NOT NULL,
    description TEXT,
    department VARCHAR(50),
    salary_min DECIMAL(10,2),
    salary_max DECIMAL(10,2),
    status VARCHAR(20) DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

-- Tabela aplikacji/zgłoszeń
CREATE TABLE IF NOT EXISTS applications (
                                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                            candidate_id BIGINT NOT NULL,
                                            position_id BIGINT NOT NULL,
                                            status VARCHAR(20) DEFAULT 'SUBMITTED',
    application_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    notes TEXT,
    FOREIGN KEY (candidate_id) REFERENCES candidates(id),
    FOREIGN KEY (position_id) REFERENCES positions(id)
    );

-- Tabela rozmów kwalifikacyjnych
CREATE TABLE IF NOT EXISTS interviews (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          application_id BIGINT NOT NULL,
                                          interview_date TIMESTAMP,
                                          interviewer VARCHAR(100),
    type VARCHAR(20) DEFAULT 'TECHNICAL',
    status VARCHAR(20) DEFAULT 'SCHEDULED',
    feedback TEXT,
    FOREIGN KEY (application_id) REFERENCES applications(id)
    );