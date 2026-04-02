const carrito = [
    { nombre: "Monitor", precio: 300 },
    { nombre: "Teclado", precio: 60 },
    { nombre: "Auriculares", precio: null }
];

const total = carrito.reduce((total, p) => total + (p.precio ?? 0), 0);

console.log("Total JS protegido:", total);