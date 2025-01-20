import model.TaskModel;
import service.TaskTrackService;
import service.TaskTrackServiceImpl;

import java.time.LocalDate;

public class TaskCli {
    public static void main(String[] args) throws Exception {
        TaskTrackService service = new TaskTrackServiceImpl();

        TaskModel model = new TaskModel(1, "Cooking", "one", LocalDate.now(), LocalDate.now());

        service.createTask(model);
    }
}