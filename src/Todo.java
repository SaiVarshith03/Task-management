import java.util.ArrayList;
import java.util.Scanner;

//import static java.util.Collections.list;

class Task{
    String taskname, taskdescription;

    public Task(String tn, String td){
        this.taskname=tn;
        this.taskdescription=td;

    }
    @Override
    public String toString(){
        return "Task Name:"+this.taskname+"\nTask Description:"+this.taskdescription;
        /*This method is used to print the object attributes without calling the attributes itself.
        @Override annotation is used so userdefined method will be called rather than pre-defined method
        toString() converts the characters to Strings.*/
    }

}
public class Todo{
    public static void main(String[] args) {
        System.out.println("-------To do List-------");
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();
        do {
            System.out.println("Choose the option below");
            System.out.println("1. Add new Task");
            System.out.println("2. Display all task");
            System.out.println("3. Display particular task");
            System.out.println("4. Delete a task");
            System.out.println("_____________________");
            System.out.println("Enter your option:");
            int option = sc.nextInt();
            sc.nextLine(); //consumes new line character in buffer

            switch (option) {
                case 1:
                    String tname, tdesc;
                    System.out.println("Enter the task name :");
                    tname = sc.nextLine();
                    System.out.println("Enter the task description :");
                    tdesc = sc.nextLine();
                    Task obj = new Task(tname, tdesc);
                    list.add(obj);
                    break;

                case 2:
                    System.out.println("-------------Displaying the task-------");
                    for (Task i : list) {
                        if (i != null) {
                            System.out.println("Task name:" + i.taskname);
                            System.out.println("Task description:" + i.taskdescription);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the task number:");
                    int num = sc.nextInt();
                    sc.nextLine();
                    if (num <=list.size()) {
//                        System.out.println("Task name:" + list.get(num - 1).taskname);
//                        System.out.println("Task description:" + list.get(num - 1).taskdescription);
                        System.out.println(list.get(num-1));
                    } else {
                        System.out.println("Choose correct task number");
                    }

                    break;

                case 4:
                    System.out.println("Enter the task number of deletion:");
                    int a = sc.nextInt();
                    sc.nextLine();
                    if (condition(a - 1, list)) {
                        System.out.println("Task name:" + list.get(a - 1).taskname + "Deleted successfully");
                        list.remove(a - 1);

                    }

                    break;




            }
        } while (true);



    }
    static boolean condition(int temp, ArrayList<Task> e)
    {
        if (temp< e.size()){
            return true;
        }
        else {
            return false;
        }
        /*This method is used so that we become pro coder
        here we are using static method so that we can implemenet in the main method
        We are using Static because we can call this method without creating an object
         */
    }
}