package service;

import exceptions.TaskNoFoundException;
import model.TaskModel;

import java.util.List;

public interface TaskTrackService {
    void createTask(TaskModel model) throws Exception;
    void deleteTask(int id) throws TaskNoFoundException;
    void updateTask(int id, TaskModel model) throws TaskNoFoundException;
    TaskModel getTaskById(int id) throws TaskNoFoundException;
    List<TaskModel> getAllTasks();
    List<TaskModel> getTaskByStatus(String status) throws TaskNoFoundException;


}
