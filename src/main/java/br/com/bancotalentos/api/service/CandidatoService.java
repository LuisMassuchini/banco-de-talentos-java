package br.com.bancotalentos.api.service;


import br.com.bancotalentos.api.model.Candidato;
import br.com.bancotalentos.api.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public Candidato criar(Candidato novoCandidato) {
        return candidatoRepository.save(novoCandidato);
    }

    @Cacheable(value = "candidatos", key = "#id")
    public Candidato buscarPorId(Long id) {

        System.out.println("### BUSCANDO NO BANCO DE DADOS PARA O ID: " + id + " ###");
        return candidatoRepository.findById(id).orElseThrow(() -> new RuntimeException("Candidato não encontrado"));
    }

    public List<Candidato> buscarTodos() {
        return candidatoRepository.findAll();
    }

    @CachePut(value = "candidatos", key = "#id")
    public Candidato atualizar(Long id, Candidato dadosParaAtualizar) {
        Candidato candidatoExistente = buscarPorId(id);

        candidatoExistente.setNome(dadosParaAtualizar.getNome());
        candidatoExistente.setAge(dadosParaAtualizar.getAge());
        candidatoExistente.setSkill(dadosParaAtualizar.getSkill());

        return candidatoRepository.save(candidatoExistente);
    }

    @CacheEvict(value = "candidatos", key = "#id")
    public void deletar(Long id) {
        candidatoRepository.deleteById(id);
    }
}
