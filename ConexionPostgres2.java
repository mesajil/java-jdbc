import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPostgres2 {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5432/rickandmorty";
    String user = "postgres";
    String password = "Inf144";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
      if (conn != null) {
        System.out.println("✅ Conexión exitosa a PostgreSQL!");
      } else {
        System.out.println("❌ Falló la conexión.");
      }
    } catch (SQLException e) {
      System.out.println("⚠️ Error al conectar:");
      e.printStackTrace();
    }
  }
}
