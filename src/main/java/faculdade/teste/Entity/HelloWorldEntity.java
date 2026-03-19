package faculdade.teste.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication

public class HelloWorldEntity {

    @PostMapping ("/contato")
    public String criarContato() {
        return "Contato criado com sucesso!";
    }
    @RequestMapping ("/aqui")
    public String puxarContato() {
        return "O contato está aqui.";
    }
    @DeleteMapping ("/deletar")
    public String deletarContato() {
        return "Você deletou o contato.";
    }
    @PutMapping ("/postar")
    public String consultarCtt(){
        return "Você consultou o contato.";
    }
}
