const estudiantes = [{nombre: "Clara", nota: 8.0}, {nombre: "Lucas", nota: 6.8},  {nombre: "Sofía", nota: 5.9},  {nombre: "Diego", nota: 4.5},  {nombre: "Nerea", nota: 7.2}]

const mejoresEstudiantes = estudiantes
                            .filter(e => e.nota >= 5)
                            .sort((a, b) => b.nota - a.nota)
                            .slice(0, 2);

console.log(mejoresEstudiantes);