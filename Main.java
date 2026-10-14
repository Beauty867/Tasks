import java.util.Scanner;

class Task {

    String name = "TaskName";
    int time = 0;
    boolean CompletionStatus = true;

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public boolean getCompletionStatus() {
        return CompletionStatus;
    }

    public void setName(String NewName) {
        this.name = NewName;
    }

    public void setCompletionStatus(boolean NewCompStatus) {
        CompletionStatus = NewCompStatus;
    }

    public void setTime(int NewTime) {
        this.time = NewTime;
    }

}
public class Main{
    public static void main(String[]args) {

        Task MyTask1 = new Task();

        MyTask1.setName("Homework");
        MyTask1.setTime(30);
        MyTask1.setCompletionStatus(true);



        Task MyTask2 = new Task();

        MyTask1.setName("Cleaning");
        MyTask2.setTime(20);
        MyTask2.setCompletionStatus(true);


        Task MyTask3 = new Task();

        MyTask3.setName("Reading");
        MyTask3.setTime(5);
        MyTask3.setCompletionStatus(true);


        Task MyTask4 = new Task();

        MyTask4.setName("Cooking");
        MyTask4.setTime(60);
        MyTask4.setCompletionStatus(false);


        Task MyTask5 = new Task();

        MyTask5.setName("Gaming");
        MyTask5.setTime(999);
        MyTask5.setCompletionStatus(true);

        Scanner scanner = new Scanner(System.in);
        Task[] TaskList =new Task[5];
        for (int i = 0; i < 5; i++) {

            Task InTask = new Task();
            TaskList[i] = InTask;

            System.out.println("Enter the Task name: ");
            String NaTask = scanner.nextLine();
            InTask.setName(NaTask);

            System.out.println("Enter the time: ");
            String TiTask = scanner.nextLine();
            InTask.setTime(Integer.parseInt(TiTask));

            System.out.println("Is your task completed?: ");
            String CoTask = scanner.nextLine();
            InTask.setCompletionStatus(Boolean.parseBoolean(CoTask));


            System.out.println(TaskList[i].getName());
            System.out.println(TaskList[i].getTime());
            System.out.println(TaskList[i].getCompletionStatus());


        }
        scanner.close();
    }

}

