CREATE TABLE tb_categoria (
  idtb_categoria INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nom_categoria VARCHAR(45) NULL,
  PRIMARY KEY(idtb_categoria)
);

CREATE TABLE tb_detalle_venta (
  idtb_detalle_venta INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idtb_producto INTEGER UNSIGNED NOT NULL,
  idtb_ventas INTEGER UNSIGNED NOT NULL,
  precio DECIMAL NULL,
  cantidad INTEGER UNSIGNED NULL,
  subtotal DECIMAL NULL,
  PRIMARY KEY(idtb_detalle_venta)
);

CREATE TABLE tb_producto (
  idtb_producto INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idtb_categoria INTEGER UNSIGNED NOT NULL,
  nom_producto VARCHAR(45) NULL,
  precio DECIMAL NULL,
  cantidad INTEGER UNSIGNED NULL,
  PRIMARY KEY(idtb_producto)
);

CREATE TABLE tb_ventas (
  idtb_ventas INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idusuario INTEGER UNSIGNED NOT NULL,
  fecha DATE NULL,
  PRIMARY KEY(idtb_ventas)
);

CREATE TABLE usuario (
  idusuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nom_user CHAR(10) NULL,
  pass CHAR(10) NULL,
  PRIMARY KEY(idusuario)
);


