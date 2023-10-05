package med.voll.api.medico;

import med.voll.api.controller.endereco.DadosEdereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEdereco endereco) {
    
}
