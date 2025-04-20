public class ConexionPostgres {
  public static void main(String[] args) {
    // Job job2 = createJob();

    // Get Job
    Job job = JobDAO.getJob(1);
    // job.setType("Part-Time");
    // JobDAO.updateJob(job);

    // Print Job
    if (job != null) {
      System.out.println(job.toString());
    }
  }

  private static Job createJob() {
    return new Job(3, "Java Expert", "null", "Java Spring Boot Expert", "Perú", "3K - 5K $",
        "Microsoft", "-", "contact@microsoft.com", "+99 999 999 999");
  }
}
