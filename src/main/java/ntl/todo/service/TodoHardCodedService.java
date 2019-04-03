package ntl.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ntl.todo.model.Todo;

@Service
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter = 0;
	
	/*
	 * till now, we didn't have a data layer yet ! so we hardCoded our service, just
	 * to test !
	 */	static {
		todos.add(new Todo(++idCounter, "mehdi", "Learn Spring Boot", new Date(), true));
		todos.add(new Todo(++idCounter, "mehdi", "Learn Spring Security", new Date(), false));
		todos.add(new Todo(++idCounter, "mehdi", "Learn Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "mehdi", "Learn Angular", new Date(), true));
		todos.add(new Todo(++idCounter, "mehdi", "Go Full Stack Spring/Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "mehdi", "Learn Angular 2+", new Date(), true));
		todos.add(new Todo(++idCounter, "mehdi", "Go Full Stack Spring/Angular and master it", new Date(), false));
	}

	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0){
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo findById(long id) {
		for(Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo == null) return null;
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
	}
}
