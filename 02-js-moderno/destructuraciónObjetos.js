const usuario = {
    id: 101,
    nombre: "Lucía",
    apellidos: "García",
    puesto: "Programadora"
};

const {nombre, puesto} = usuario;

const usuarioActualizado = {
    ...usuario,
    puesto: "Senior Developer"
};