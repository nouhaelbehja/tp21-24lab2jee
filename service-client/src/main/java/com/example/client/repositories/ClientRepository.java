package com.example.client.repositories;
import com.example.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ClientRepository extends JpaRepository<Client, Long> {

}
