package ejercicio1.intro.OperacionesAritmeticas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
@RequestMapping(value = "/oper")
public class Operaciones {

    @GetMapping("/suma")
    public void Sumar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La suma es de: " + (num1 + num2));
    }

    @GetMapping("/resta")
    public void Restar(){
        System.out.println("La resta es: " + (6-3));
    }

    @GetMapping("/multiplicacion")
    public void Multiplicacion(){
        System.out.println("La multiplicación es: " + (6*3));
    }

    @GetMapping("/division")
    public void Division(){
        System.out.println("La division es: " + (6/3));
    }
}
