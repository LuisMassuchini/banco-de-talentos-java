package br.com.bancotalentos.api.service;


import br.com.bancotalentos.api.model.Candidato;
import br.com.bancotalentos.api.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public Candidato criar(Candidato novoCandidato) {
        return candidatoRepository.save(novoCandidato);
    }

    public Candidato buscarPorId(Long id) {
        return candidatoRepository.findById(id).orElse(null);
    }

    public Candidato buscarTodos() {
        return (Candidato) candidatoRepository.findAll();
    }

    public Candidato atualizar(Long id, Candidato dadosParaAtualizar) {
        Candidato candidatoExistente = buscarPorId(id);

        candidatoExistente.setNome(dadosParaAtualizar.getNome());
        candidatoExistente.setAge(dadosParaAtualizar.getAge());
        candidatoExistente.setSkill(dadosParaAtualizar.getSkill());

        return candidatoRepository.save(candidatoExistente);
    }

    public void deletar(Long id) {
        candidatoRepository.deleteById(id);
    }
}
