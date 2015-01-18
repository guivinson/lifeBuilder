package hello.dao;

import hello.model.Todo;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TodoDao {
	private final ArrayList<Todo> todos = new ArrayList<>();

	public TodoDao() {
		todos.add(new Todo("un premier item!"));
		todos.add(new Todo("un second item!"));
		todos.add(new Todo("un troisème item!"));
	}

	public ArrayList<Todo> getTodos() {
		return todos;
	}

	public boolean addTodo(String item) {
		return todos.add(new Todo(item));
	}
	
}
