import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionPostgres {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/jobportal";
    String user = "postgres";
    String password = "Inf144";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      if (conn != null) {
        System.out.println("✅ Conexión exitosa a PostgreSQL!");

        // Consulta para obtener todas las filas de la tabla job
        String query = "SELECT * FROM job";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

          // Iterar sobre los resultados
          while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String type = rs.getString("type");
            String description = rs.getString("description");
            String location = rs.getString("location");
            String salary = rs.getString("salary");
            String companyName = rs.getString("company_name");
            String companyDescription = rs.getString("company_description");
            String companyContactEmail = rs.getString("company_contact_email");
            String companyContactPhone = rs.getString("company_contact_phone");

            // Imprimir los datos
            System.out.println("ID: " + id);
            System.out.println("Title: " + title);
            System.out.println("Type: " + type);
            System.out.println("Description: " + description);
            System.out.println("Location: " + location);
            System.out.println("Salary: " + salary);
            System.out.println("Company Name: " + companyName);
            System.out.println("Company Description: " + companyDescription);
            System.out.println("Company Contact Email: " + companyContactEmail);
            System.out.println("Company Contact Phone: " + companyContactPhone);
            System.out.println("--------------------------------------------------");
          }
        }
      } else {
        System.out.println("❌ Falló la conexión.");
      }
    } catch (SQLException e) {
      System.out.println("⚠️ Error al conectar:");
      e.printStackTrace();
    }
  }
}
