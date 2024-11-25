package br.com.thiago.gerenciador_tarefas;

import br.com.thiago.gerenciador_tarefas.model.Tarefa;
import br.com.thiago.gerenciador_tarefas.repository.TarefaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner demo(TarefaRepository repository) {
        return (args) -> {
            Tarefa tarefa = new Tarefa();
            tarefa.setDescricao("Estudar Spring Boot");
            tarefa.setConcluida(false);
            repository.save(tarefa);
            System.out.println("Tarefa salva: " + tarefa.getDescricao());
        };
    }
}

