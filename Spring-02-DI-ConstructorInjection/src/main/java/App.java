import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class App {
    public static void main(String[] args) {

        //FullTimeMentor fullTime= new FullTimeMentor();
        PartTimeMentor partTime= new PartTimeMentor();

        MentorAccount mentor= new MentorAccount(partTime);  //<--fullTime

        mentor.manageAccount();
    }
}
