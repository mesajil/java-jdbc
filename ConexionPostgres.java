public class ConexionPostgres {
  public static void main(String[] args) {
    // Insert new Job
    // JobDAO.addJob(new Job(3, "Java Expert", "null", "Java Spring Boot Expert", "Perú", "3K - 5K
    // $",
    // "Microsoft", "-", "contact@microsoft.com", "+99 999 999 999"));

    // Print Job
    Job job = JobDAO.getJob(2);
    if (job != null) {
      System.out.println(job.toString());
    }
  }
}
