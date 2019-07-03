package app.model;

import app.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<Employee> model;

    public static Model getInstance(){
        return instance;
    }

    private Model(){
        model = new ArrayList<>();
    }

    public void add(Employee employee){
        model.add(employee);
    }

    public void delete(Employee employee){
        model.remove(employee);
    }

    public List<Employee> list(){
        return  model.stream().collect(Collectors.toList());
    }
}
