
create database club_nautica;
use club_nautica;


create table socios (
    socio_id int primary key auto_increment,
    nombre varchar(100),
    direccion varchar(255),
    telefono varchar(100)
);


create table barcos (
    barco_id int primary key auto_increment,
    numero_matricula varchar(50),
    nombre varchar(100),
    numero_amarre int,
    cuota decimal(10, 2),
    socio_id int,
    foreign key (socio_id) references socios(socio_id)
);


create table patrones (
    patron_id int primary key auto_increment,
    nombre varchar(100),
    telefono varchar(100)
);


create table salidas (
    salida_id int primary key auto_increment,
    fecha_salida datetime,
    destino varchar(100),
    socio_id int,
    barco_id int,
    patron_id int,
    foreign key (socio_id) references socios(socio_id),
    foreign key (barco_id) references barcos(barco_id),
    foreign key (patron_id) references patrones(patron_id)
);


insert into socios (nombre, direccion, telefono) values
('juan pérez', 'calle falsa 123, ciudad a', '5551234567'),
('maría lópez', 'avenida siempreviva 742, ciudad b', '5555678123'),
('carlos gómez', 'calle principal 10, ciudad c', '5559876543'),
('ana sánchez', 'boulevard norte 5, ciudad d', '5558765432'),
('luis martínez', 'calle 8, ciudad e', '5555432678'),
('lucía fernández', 'avenida del sol 33, ciudad f', '5556543789'),
('pedro ramírez', 'calle luna 7, ciudad g', '5553210789'),
('carmen torres', 'avenida primavera 19, ciudad h', '5554321987'),
('jorge rojas', 'calle verano 3, ciudad i', '5557890123'),
('elena morales', 'boulevard este 29, ciudad j', '5550987123');


insert into barcos (numero_matricula, nombre, numero_amarre, cuota, socio_id) values
('mtr-001', 'el velero', 101, 250.00, 1),
('mtr-002', 'la sirena', 102, 300.00, 2),
('mtr-003', 'el delfín', 103, 275.00, 3),
('mtr-004', 'la estrella', 104, 320.00, 4),
('mtr-005', 'el tritón', 105, 290.00, 5),
('mtr-006', 'la gaviota', 106, 310.00, 6),
('mtr-007', 'el albatros', 107, 265.00, 7),
('mtr-008', 'la perla', 108, 330.00, 8),
('mtr-009', 'el faro', 109, 285.00, 9),
('mtr-010', 'la brisa', 110, 295.00, 10);


insert into patrones (nombre, telefono) values
('raúl castillo', '5551001123'),
('sara herrera', '5551002234'),
('miguel rivera', '5551003345'),
('laura aguilar', '5551004456'),
('diego jiménez', '5551005567'),
('valeria mendoza', '5551006678'),
('josé torres', '5551007789'),
('sandra ruiz', '5551008890'),
('antonio navarro', '5551009901'),
('beatriz vargas', '5551010012');


insert into salidas (barco_id, fecha_salida, destino, socio_id, patron_id) values
(1, '2024-08-10 09:00:00', 'isla aventura', 1, 1),
(2, '2024-08-11 10:30:00', 'bahía encantada', 2, 2),
(3, '2024-08-12 08:00:00', 'playa del sol', 3, 3),
(4, '2024-08-13 11:15:00', 'cabo norte', 4, 4),
(5, '2024-08-14 07:45:00', 'isla paraíso', 5, 5),
(6, '2024-08-15 09:30:00', 'puerto azul', 6, 6),
(7, '2024-08-16 10:00:00', 'laguna verde', 7, 7),
(8, '2024-08-17 08:30:00', 'costa dorada', 8, 8),
(9, '2024-08-18 09:45:00', 'isla tesoro', 9, 9),
(10, '2024-08-19 11:00:00', 'playa blanca', 10, 10);
