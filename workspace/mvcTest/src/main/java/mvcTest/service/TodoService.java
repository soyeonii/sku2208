package mvcTest.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvcTest.dao.TodoRepository;
import mvcTest.model.Todo;

@Service
public class TodoService {
	@Autowired
	private TodoRepository todoRepository;

	public Todo getTodo(Long id) {
		return todoRepository.findById(id).orElseThrow();
	}

	public List<Todo> getTodos() {
		return todoRepository.findAll();
	}

	public void addTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Transactional
	public void updateTodo(Long id) {
		Todo todo = todoRepository.getOne(id);
		if (todo.getEndDate() != null)
			todo.setEndDate(null);
		else
			todo.setEndDate(LocalDateTime.now());
	}

	@Transactional
	public void deleteTodo(Long id) {
		todoRepository.delete(todoRepository.getOne(id));
	}
}
