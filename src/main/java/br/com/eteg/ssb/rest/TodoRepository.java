package br.com.eteg.ssb.rest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.eteg.ssb.entities.Todo;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends CrudRepository<Todo, Integer> {
	List<Todo> findByCompleted(@Param("completed") Boolean completed);
}
