package josueguinea_20200001.ejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class OperacionesAritmeticas {

    @GetMapping("/Sumatoria")
    public int Sumar(){
        Operaciones objOperaciones = new Operaciones();
        return objOperaciones.Sumar(3, 2);
    }

    @GetMapping("/Resta")
    public void Restar(){
        int num1 = 2;
        int num2 = 3;
        System.out.println("La resta es: " + (num1 - num2));
    }

    @GetMapping("/Multiplicacion")
    public void producto(){
        int num1 = 2;
        int num2 = 3;
        System.out.println("La multiplicación es: " + (num1 * num2));
    }

    @GetMapping("/Division")
    public void Division(){
        int num1 = 9;
        int num2 = 3;
        System.out.println("La división es: " + (num1 / num2));
    }

    @GetMapping("/jsonResponse")
    public Map<String, Object> ArchivoJSON(){
        Map<String, Object> datos = new LinkedHashMap<>(); // Para mantener el orden
        datos.put("nombre", "Juan");
        datos.put("edad", 30);
        datos.put("ciudad", "Madrid");
        return datos; // Spring lo convierte a JSON
    }
}
