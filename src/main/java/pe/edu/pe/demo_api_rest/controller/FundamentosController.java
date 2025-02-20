package pe.edu.pe.demo_api_rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {


    @GetMapping("/ejercicios1")
    public String ejercicios1() {
        return "Hola mundo Rest";
    }
}
