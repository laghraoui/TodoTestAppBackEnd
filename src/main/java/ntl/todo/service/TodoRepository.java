package ntl.todo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ntl.todo.model.Todo;

//the args : 1st arg is which entity i would manage, and 2nd arg is what's the id
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
	/*
	 * Once you have an entity in jpa, the way you can to talk the jpa to save data
	 * and getting infos from it, it's by using a repository ! And spring data jpa
	 * provides an awesome thing called 'JpaRepository' which provides all the
	 * features, to be able to crud an entity of an entity very easy !
	 */
	List<Todo> findByUsername(String username);
	
	/* 
	 * Spring data : you just define your repository interfaces and i will take care of implementing them.  
	 * the specific implementation for jpa in spring data is spring data jpa.
	 */
}
