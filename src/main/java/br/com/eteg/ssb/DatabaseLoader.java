package br.com.eteg.ssb;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.eteg.ssb.entities.Todo;
import br.com.eteg.ssb.rest.TodoRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		for(int i = 0; i < 5; ++i){
			todoRepository.save(new Todo(MessageFormat.format("Tarefa {0}", (i + 1))));
		}
	}
}
