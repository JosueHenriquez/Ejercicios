//Función async permite que una función se ejecute y que lo demás se siga ejecutando
//await hace la espera mientras se estan obteniendo los datos.
async function Sumar(){
    const request = await fetch('api/Sumatoria', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    //Una vez se obtengan todos los datos de la funcion se guarda en la constante
    const valores = await request.json();
    console.log(valores);
}