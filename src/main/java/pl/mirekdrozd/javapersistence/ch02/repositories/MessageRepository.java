package pl.mirekdrozd.javapersistence.ch02.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mirekdrozd.javapersistence.ch02.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

}