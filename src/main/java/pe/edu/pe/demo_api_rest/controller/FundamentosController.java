package pe.edu.pe.demo_api_rest.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.pe.demo_api_rest.model.APIResponse;
import pe.edu.pe.demo_api_rest.service.FundamentosService;
import pe.edu.pe.demo_api_rest.service.IFundamentosService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {

    private final IFundamentosService ifundamentosService;


    @GetMapping("/ejercicios1")
    public String ejercicios1() {
        return "Hola mundo Rest";
    }

    @GetMapping("/primo")
    public ResponseEntity<APIResponse<String>> ValidarPrimo(
            @RequestParam int numero) {
        String respuesta = ifundamentosService.validarNumeroPrimo(numero);


        return ResponseEntity.ok(APIResponse.<String>builder()
                .data(respuesta)
                .message("ejercicio Correctamente")
                .build());
    }
    @GetMapping("/factorial")
    public ResponseEntity<APIResponse<String>> factorial(
            @RequestParam int numero) {
        String respuesta = ifundamentosService.calcularFactorial(numero);


        return ResponseEntity.ok(APIResponse.<String>builder()
                .data(respuesta)
                .message("ejercicio Correctamente")
                .build());
    }
    @GetMapping("/fibonacci")
    public ResponseEntity<APIResponse<List<Integer>>> fibonacci(
            @RequestParam int numero) {
        List<Integer> respuesta = ifundamentosService.calcularFibonacci(numero);


        return ResponseEntity.ok(APIResponse.<List<Integer>>builder()
                .data(respuesta)
                .message("ejercicio Correctamente")
                .build());
    }

}


