import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicineService {
    private static final String QUERY = "SELECT generic_substitute, dosage, brand, price, salt_name, availability FROM medicines WHERE medicine_name = ?";

    public Medicine findSubstitute(String medicineName) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(QUERY)) {
            statement.setString(1, medicineName);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Medicine(
                            medicineName,
                            resultSet.getString("generic_substitute"),
                            resultSet.getString("dosage"),
                            resultSet.getString("brand"),
                            resultSet.getDouble("price"),
                            resultSet.getString("salt_name"),
                            resultSet.getString("availability")
                    );
                }
            }
        }
        return null;
    }
}
