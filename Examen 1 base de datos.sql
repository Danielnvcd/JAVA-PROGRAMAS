use examen1
select * from productos;
SELECT nombre as productos_con_la_letra_c FROM productos  WHERE nombre LIKE '%C%';
SELECT precio as promedio FROM productos WHERE precio > 200;
SELECT AVG(precio) as promedio FROM productos WHERE nombre LIKE '%E%';
--ALTER TABLE Productos ADD Categoria VARCHAR(50);
UPDATE productos SET Categoria   = 'Electrodomesticos';
UPDATE productos SET Categoria = 'Mecedoras' WHERE nombre LIKE 'Silla%';
