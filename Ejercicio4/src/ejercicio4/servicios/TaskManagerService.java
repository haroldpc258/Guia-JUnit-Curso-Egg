package ejercicio4.servicios;

import ejercicio4.entidades.TaskManager;

public class TaskManagerService {

    public TaskManager agregar(TaskManager tareas, String tareaNueva) {

        tareas.getTasks().add(tareaNueva);
        return tareas;
    }

    public TaskManager eliminar(TaskManager tareas, String tareaEliminar) {

        for (String tarea : tareas.getTasks()) {
            if (tarea.equals(tareaEliminar)) {
                tareas.getTasks().remove(tarea);
                break;
            }
        }

        return tareas;
    }

    public void mostrar(TaskManager tareas) {

        for (String tarea : tareas.getTasks()) {
            System.out.println(tarea);
        }
    }
}
