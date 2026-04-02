const carrito = [
    { nombre: "Monitor", precio: 300 },
    { nombre: "Teclado", precio: 80 },
    { nombre: "Ratón", precio: 20 }
];

const precioTotal = carrito.reduce((total, producto) => producto.precio + total, 0)
console.log(precioTotal);