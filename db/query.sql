
CREATE TABLE Usuario(
    id UUID PRIMARY KEY,
    Nombre VARCHAR(30) NOT NULL,
    Apellido VARCHAR(35) NOT NULL,
    Dni VARCHAR(10) NOT NULL,
    Num_Celular VARCHAR(15) NOT NULL,
    Direccion VARCHAR(60) NOT NULL,
    Email VARCHAR(40) NOT NULL,
    Password VARCHAR(50) NOT NULL,
    Activo BOOLEAN NOT NULL,
    Fecha_desactivacion TIMESTAMP NULL,
    CreatedAt TIMESTAMP NOT NULL,
    UpdatedAt TIMESTAMP NOT NULL
)










