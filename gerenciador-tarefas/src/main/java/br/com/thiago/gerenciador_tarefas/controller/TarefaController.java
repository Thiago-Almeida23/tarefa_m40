package br.com.thiago.gerenciador_tarefas.controller;

import br.com.thiago.gerenciador_tarefas.model.Tarefa;
import br.com.thiago.gerenciador_tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefas")
    public Iterable<Tarefa> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @PostMapping("/tarefas")
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.criarTarefa(tarefa);
    }
}

