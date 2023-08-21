package ejercicio4.entidades;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public TaskManager(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }
}
