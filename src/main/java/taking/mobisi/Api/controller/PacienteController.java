package taking.mobisi.Api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taking.mobisi.Api.medico.DadosCadastroMedico;
import taking.mobisi.Api.pacientes.DadosCadastroPaciente;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        System.out.println("Dados recebidos: " + dados);
    }
}
