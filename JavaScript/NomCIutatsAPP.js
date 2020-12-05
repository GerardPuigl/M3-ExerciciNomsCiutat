// Crear 6 variables String y pedir por consolsa introducir nombres ciudades

var ciutats = new Array;


for (var i = 1; i < 7; i++) {
    ciutats.push(prompt("Intrdueix el nom la ciutat nº " + i))
}


//Cambiar las 'a' por '4'
var ciutatsModificades = new Array;

ciutats.forEach(s => {
    s = s.replace('a', '4');
    ciutatsModificades.push(s);
})

//Ordeonar en Ciudades en diferentes ArrayList e imprimir en orden inverso sus letras

var lletresCiutats = new Array;


ciutats.sort();

ciutats.forEach(c => {

    c=c.reverse();

    c.forEach(l =>{
        lletresCiutats.push(l)
    })
    
});

document.writeln()