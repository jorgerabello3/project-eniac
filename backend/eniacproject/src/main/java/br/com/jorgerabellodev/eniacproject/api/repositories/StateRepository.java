package br.com.jorgerabellodev.eniacproject.api.repositories;

import br.com.jorgerabellodev.eniacproject.api.models.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
