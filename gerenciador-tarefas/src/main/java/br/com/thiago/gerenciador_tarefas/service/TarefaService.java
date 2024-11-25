package br.com.thiago.gerenciador_tarefas.service;

import br.com.thiago.gerenciador_tarefas.model.Tarefa;
import br.com.thiago.gerenciador_tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public Iterable<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}
