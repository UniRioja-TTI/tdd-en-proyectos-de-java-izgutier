package com.tt1.repository;

import com.tt1.model.ToDo;
import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();

    public void guardar(ToDo tarea) {
        tareas.add(tarea);
    }

    public List<ToDo> obtenerTodas() {
        return tareas;
    }
}
