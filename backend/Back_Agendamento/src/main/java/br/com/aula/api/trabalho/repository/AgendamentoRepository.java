package br.com.aula.api.trabalho.repository;

import br.com.aula.api.trabalho.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
    List<Agendamento> findByStartDateGreaterThanEqualAndFinalDateLessThanEqual(Date beginDate, Date finalDate);
}
