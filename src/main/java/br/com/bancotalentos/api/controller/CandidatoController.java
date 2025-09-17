package br.com.bancotalentos.api.controller;


import br.com.bancotalentos.api.model.Candidato;
import br.com.bancotalentos.api.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService   candidatoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Candidato criar(@RequestBody Candidato candidato){
        return candidatoService.criar(candidato);
    }

    @GetMapping("/{id}")
    public Candidato buscarPorId(@PathVariable Long id) {
        return candidatoService.buscarPorId(id);
    }

    @GetMapping
    public Candidato buscarTodos() {
        return candidatoService.buscarTodos();  }

    @PutMapping("/{id}")
    public Candidato atualizar(@PathVariable Long id, @RequestBody Candidato dadosParaAtualizar) {
        return candidatoService.atualizar(id, dadosParaAtualizar);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        candidatoService.deletar(id);   }

}
