INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('rich','$2a$10$lLMWL9mSbYbg2DoP1zVToe1DJbvysYlZTKHTtMNmubScuML4e99wC',1,'Richard','Rojas','richardrojas.cid@gmail.com');
INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('jocy','$2a$10$3D.1J3iRt2j6hq06vmz6ae.ogr3OUqUQ.ge1Ds5iyf7YXNhF/9CBS',1,'Jocelyn','Castillo','jcastillo7@gmail.com');
																			   --rich-password:12345
																			   --jocy-password:02468
INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);