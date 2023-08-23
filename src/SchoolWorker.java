public class SchoolWorker extends School {
    private String job;
    public SchoolWorker(String nameFirst, String nameLast, int age,String job) {
        super(nameFirst, nameLast, age);
        this.job=job;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

}
