const personas = [{nombre: "ana", edad: 17}, {nombre: "beto", edad: 20}, {nombre: "carla", edad: 25}];

const personasMayorEdad = personas
                    .filter(p => p.edad >= 18)
                    .map(p => `Mayor de edad ${p.nombre.toUpperCase()}`)
console.log(personasMayorEdad);