package josueguinea_1A_20200002.ejercicio1A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class OperacionesAritméticas {

    Operaciones objOper = new Operaciones();

    @GetMapping("/Sumatoria")
    public int Sumar(){
        return objOper.Suma(3,7);
    }

    @GetMapping("/Resta")
    public int Restar(){
        return objOper.Resta(10,5);
    }

    @GetMapping("/Multiplicacion")
    public int Producto(){
        return objOper.Multiplicacion(5,9);
    }

    @GetMapping("/Division")
    public double Division(){
        return objOper.Division(10,2);
    }

    @GetMapping("/getData")
    public Map<String, Object> DatosEmpleados(){
        Map<String, Object> datos = new LinkedHashMap<>();
        datos.put("nombre", "Josue");
        datos.put("nacimiento", "26/12/1992");
        datos.put("ciudad", "San Salvador");
        return datos;
    }
}
