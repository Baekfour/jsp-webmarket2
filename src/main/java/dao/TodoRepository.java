package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Todo;

public class TodoRepository { // ����Ҵ� ���ΰ�ħ�ص� ��� ����Ѵ�.
	private static long currentId = 0;
   private List<Todo> todos = new ArrayList<>();
   
   private static TodoRepository instance = new TodoRepository(); // ���α׷��� �⵿���ڸ��� ����� �ٸ��ֵ��� �����ְ� ����
   
   public static TodoRepository getInstance() {
      return instance;
   }
   

   
   public List<Todo> getTodos() {
      return todos;
   }
   
   public void addTodo(Todo todo) {
	   todo.setId(currentId);
	   currentId++;
      todos.add(todo);
   }
}