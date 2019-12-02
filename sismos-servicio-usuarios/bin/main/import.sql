INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('rich','12345',1,'Richard','Rojas','richardrojas.cid@gmail.com');
INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('jocy','02468',1,'Jocelyn','Castillo','jcastillo7@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);