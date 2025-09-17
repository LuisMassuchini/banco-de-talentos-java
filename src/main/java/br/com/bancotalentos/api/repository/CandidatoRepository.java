package br.com.bancotalentos.api.repository;



import br.com.bancotalentos.api.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
