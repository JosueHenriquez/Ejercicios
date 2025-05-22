package ejercicio1_20200001.josueguinea.OperacionesAritmeticas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Operaciones {

    @GetMapping("/suma")
    public void Sumar(){
        int num1 = 3;
        int num2 = 9;
        System.out.println("El resultado es: " + (num1 + num2));
    }

    @GetMapping("/resta")
    public void Resta(){
        int num1 = 3;
        int num2 = 9;
        System.out.println("El resultado es: " + (num1 - num2));
    }

}
