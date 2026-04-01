const carrito = [
    { nombre: "Monitor 27p", precio: 300, categoria: "Tecnología" },
    { nombre: "Teclado RGB", precio: 80, categoria: "Tecnología" },
    { nombre: "Libro JavaScript", precio: 30, categoria: "Libros" },
    { nombre: "Silla Gaming", precio: 250, categoria: "Muebles" }
];

const productosSeleccionados = carrito
    .filter(p => p.categoria === "Tecnología")
    .map(({ nombre, precio }) => `El producto ${nombre} cuesta ${precio}€`);

console.log(productosSeleccionados)