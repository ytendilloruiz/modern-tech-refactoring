const notas = [4, 8, 3, 10, 5, 9];

const aprobadosSubidos = notas.filter(n => n >= 5)
                        .map(n => n + 1);

console.log(aprobadosSubidos);

const resultado = notas.filter(n => n >= 5)
                        .map(n => `Nota: ${ n + 1}`);
console.log(resultado);