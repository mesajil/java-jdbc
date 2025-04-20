public class Job {
  private int id;
  private String title;
  private String type;
  private String description;
  private String location;
  private String salary;
  private String companyName;
  private String companyDescription;
  private String companyContactEmail;
  private String companyContactPhone;

  // Constructor
  public Job(int id, String title, String type, String description, String location, String salary,
      String companyName, String companyDescription, String companyContactEmail,
      String companyContactPhone) {
    this.id = id;
    this.title = title;
    this.type = type;
    this.description = description;
    this.location = location;
    this.salary = salary;
    this.companyName = companyName;
    this.companyDescription = companyDescription;
    this.companyContactEmail = companyContactEmail;
    this.companyContactPhone = companyContactPhone;
  }

  // Getters y Setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyDescription() {
    return companyDescription;
  }

  public void setCompanyDescription(String companyDescription) {
    this.companyDescription = companyDescription;
  }

  public String getCompanyContactEmail() {
    return companyContactEmail;
  }

  public void setCompanyContactEmail(String companyContactEmail) {
    this.companyContactEmail = companyContactEmail;
  }

  public String getCompanyContactPhone() {
    return companyContactPhone;
  }

  public void setCompanyContactPhone(String companyContactPhone) {
    this.companyContactPhone = companyContactPhone;
  }

  @Override
  public String toString() {
    return "Job{" + "id=" + id + ", title='" + title + '\'' + ", type='" + type + '\''
        + ", description='" + description + '\'' + ", location='" + location + '\'' + ", salary='"
        + salary + '\'' + ", companyName='" + companyName + '\'' + ", companyDescription='"
        + companyDescription + '\'' + ", companyContactEmail='" + companyContactEmail + '\''
        + ", companyContactPhone='" + companyContactPhone + '\'' + '}';
  }
}
