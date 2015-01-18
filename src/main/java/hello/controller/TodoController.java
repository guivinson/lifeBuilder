package hello.controller;

import hello.dao.TodoDao;
import hello.model.Todo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
	@Autowired
	private TodoDao todoDaoService;
	
    @RequestMapping("/todo")
    public ArrayList<Todo> list() {
        return todoDaoService.getTodos();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/todo/add{name}")
    public boolean addItem(@RequestParam(value="item") String item) {
        return todoDaoService.addTodo(item);
    }
    
}
