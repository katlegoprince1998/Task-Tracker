package service;

import exceptions.TaskModelMustNotBeNullException;
import exceptions.TaskNoFoundException;
import helpers.ReadFromFile;
import model.TaskModel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TaskTrackServiceImpl implements TaskTrackService{
    private final String FILE_PATH;

    public TaskTrackServiceImpl() {
        FILE_PATH = "C:\\Users\\princ\\OneDrive\\Desktop\\Projects\\Task-Tarcker\\src\\data\\task.json";
    }

    @Override
    public void createTask(TaskModel model) throws Exception {
        if (model == null)
            throw new TaskModelMustNotBeNullException("Object model cannot be null");

        try{
            File file = new File(FILE_PATH);

            if (!file.exists()){
                file.createNewFile();

                try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                    writer.write("[]");
                }
            }

            String json = ReadFromFile.getRecords(file);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTask(int id) throws TaskNoFoundException {

    }

    @Override
    public void updateTask(int id, TaskModel model) throws TaskNoFoundException {

    }

    @Override
    public TaskModel getTaskById(int id) throws TaskNoFoundException {
        return null;
    }

    @Override
    public List<TaskModel> getAllTasks() {
        return List.of();
    }

    @Override
    public List<TaskModel> getTaskByStatus(String status) throws TaskNoFoundException {
        return List.of();
    }
}
