package br.com.eteg.ssb

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

import br.com.eteg.ssb.entities.Todo
import br.com.eteg.ssb.rest.TodoRepository

@Component
class DatabaseLoader implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository

	@Override
	void run(String... args) throws Exception {
		5.times {
			todoRepository.save new Todo(text: "Todo ${it+1}", completed: false)
		}
	}
}
