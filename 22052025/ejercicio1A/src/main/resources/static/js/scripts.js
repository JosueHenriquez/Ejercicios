async function Sumar(){
    console.log("Entre al metodo");
    const request = await fetch('api/Sumatoria', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const valores = await request.json();
    console.log(valores);
}