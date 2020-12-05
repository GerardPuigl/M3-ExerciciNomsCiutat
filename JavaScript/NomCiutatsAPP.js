// Crear 6 variables String y pedir por consolsa introducir nombres ciudades

var ciutats = new Array;


for (var i = 1; i < 7; i++) {   
    ciutats.push(prompt("Intrdueix el nom la ciutat nº "+i))
}

ciutats.forEach(c => {    document.writeln(c,"<br/>");})