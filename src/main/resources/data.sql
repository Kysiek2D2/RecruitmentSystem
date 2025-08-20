-- Kandydaci
INSERT INTO candidates (first_name, last_name, email, phone, cv_path) VALUES
                                                                          ('Jan', 'Kowalski', 'jan.kowalski@email.com', '+48123456789', '/cvs/jan_kowalski.pdf'),
                                                                          ('Anna', 'Nowak', 'anna.nowak@email.com', '+48987654321', '/cvs/anna_nowak.pdf'),
                                                                          ('Piotr', 'Wiśniewski', 'piotr.wisniewski@email.com', '+48555666777', '/cvs/piotr_wisniewski.pdf'),
                                                                          ('Maria', 'Dąbrowska', 'maria.dabrowska@email.com', '+48111222333', '/cvs/maria_dabrowska.pdf'),
                                                                          ('Tomasz', 'Brown', 'tomasz.brown@email.com', '+48444555666', '/cvs/tomasz_brown.pdf');

-- Stanowiska
INSERT INTO positions (title, description, department, salary_min, salary_max, status) VALUES
                                                                                           ('Java Developer', 'Programista Java z min. 3-letnim doświadczeniem', 'IT', 8000.00, 12000.00, 'ACTIVE'),
                                                                                           ('Frontend Developer', 'Programista React/Angular', 'IT', 7000.00, 10000.00, 'ACTIVE'),
                                                                                           ('DevOps Engineer', 'Specjalista od CI/CD i infrastruktury', 'IT', 10000.00, 15000.00, 'ACTIVE'),
                                                                                           ('Product Manager', 'Zarządzanie produktem IT', 'Product', 12000.00, 18000.00, 'ACTIVE'),
                                                                                           ('QA Engineer', 'Tester automatyczny i manualny', 'QA', 6000.00, 9000.00, 'CLOSED');

-- Aplikacje
INSERT INTO applications (candidate_id, position_id, status, notes) VALUES
                                                                        (1, 1, 'SUBMITTED', 'Kandydat z dobrym doświadczeniem w Spring Boot'),
                                                                        (2, 2, 'IN_REVIEW', 'Świetne portfolio projektów React'),
                                                                        (3, 1, 'INTERVIEW_SCHEDULED', 'Doświadczenie w microservices'),
                                                                        (4, 4, 'SUBMITTED', 'Background w zarządzaniu projektami'),
                                                                        (5, 3, 'REJECTED', 'Brak doświadczenia z Kubernetes'),
                                                                        (1, 3, 'IN_REVIEW', 'Chce się przebranżowić na DevOps');

-- Rozmowy kwalifikacyjne
INSERT INTO interviews (application_id, interview_date, interviewer, type, status, feedback) VALUES
                                                                                                 (3, '2024-01-15 10:00:00', 'Jan Nowak', 'TECHNICAL', 'COMPLETED', 'Dobra znajomość Java, potrzebuje poprawić wiedzę o bazach danych'),
                                                                                                 (2, '2024-01-20 14:30:00', 'Anna Kowalska', 'HR', 'COMPLETED', 'Bardzo dobra komunikacja, motywacja wysoka'),
                                                                                                 (6, '2024-01-25 09:00:00', 'Piotr Maj', 'TECHNICAL', 'SCHEDULED', NULL);