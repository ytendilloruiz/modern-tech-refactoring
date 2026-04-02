const carrito = [
    { nombre: "Monitor", precio: 300 },
    { nombre: "Teclado"},
    { nombre: "Ratón", precio: 20 }
];

const precioTotal = carrito.reduce((total, producto) => (producto.precio || 0) + total, 0)
console.log(precioTotal);