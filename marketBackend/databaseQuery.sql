CREATE TABLE categoria(
	id IDENTITY,
	nombre VARCHAR(50),
	descripcion VARCHAR(50),
	url_imagen VARCHAR(50),
	url_video VARCHAR(50),
	activo BOOLEAN,
	
	CONSTRAINT pk_categoria_id PRIMARY KEY (id)
);
