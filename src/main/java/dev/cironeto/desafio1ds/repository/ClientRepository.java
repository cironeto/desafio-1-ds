package dev.cironeto.desafio1ds.repository;


import dev.cironeto.desafio1ds.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
