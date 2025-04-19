import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobDAO {
  public static Job getJob(int id) {
    String url = "jdbc:postgresql://localhost:5432/jobportal";
    String user = "postgres";
    String password = "Inf144";

    String query = "SELECT * FROM job WHERE id = " + id;
    try (Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query)) {

      if (rs.next()) {
        // Crear y retornar el objeto Job con los datos obtenidos
        return new Job(rs.getInt("id"), rs.getString("title"), rs.getString("type"),
            rs.getString("description"), rs.getString("location"), rs.getString("salary"),
            rs.getString("company_name"), rs.getString("company_description"),
            rs.getString("company_contact_email"), rs.getString("company_contact_phone"));
      } else {
        System.out.println("⚠️ No se encontró un Job con el ID: " + id);
      }
    } catch (SQLException e) {
      System.out.println("⚠️ Error al buscar el Job:");
      e.printStackTrace();
    }
    return null; // Retorna null si no se encuentra el Job o hay un error
  }

  public static void addJob(Job job) {
    String url = "jdbc:postgresql://localhost:5432/jobportal";
    String user = "postgres";
    String password = "Inf144";

    String query = "INSERT INTO job (title, type, description, location, salary, company_name, "
        + "company_description, company_contact_email, company_contact_phone) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(query)) {

      // Establecer los valores en el PreparedStatement
      pstmt.setString(1, job.getTitle());
      pstmt.setString(2, job.getType());
      pstmt.setString(3, job.getDescription());
      pstmt.setString(4, job.getLocation());
      pstmt.setString(5, job.getSalary());
      pstmt.setString(6, job.getCompanyName());
      pstmt.setString(7, job.getCompanyDescription());
      pstmt.setString(8, job.getCompanyContactEmail());
      pstmt.setString(9, job.getCompanyContactPhone());

      // Ejecutar la consulta
      int rowsInserted = pstmt.executeUpdate();
      if (rowsInserted > 0) {
        System.out.println("✅ Job agregado exitosamente.");
      }
    } catch (SQLException e) {
      System.out.println("⚠️ Error al agregar el Job:");
      e.printStackTrace();
    }
  }
}
