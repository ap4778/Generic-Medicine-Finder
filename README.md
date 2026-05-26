# Generic Medicine Finder

A Java Swing desktop application that helps users search for generic medicine substitutes from a MySQL-backed dataset.

## Features

- Search branded medicines and view their generic substitute details.
- Display dosage, brand, price, salt name, and availability.
- Clean Swing UI with a logo header and responsive search workflow.
- Uses MySQL for data storage and retrieval.

## Project Structure

- `Medicine/src/MedicineApp.java` — main Swing application UI and search flow
- `Medicine/src/MedicineService.java` — database access/service layer
- `Medicine/src/DatabaseConnection.java` — MySQL connection configuration
- `Medicine/src/Medicine.java` — data model for medicine records
- `Medicine/src/Resources/images/` — image assets used in the UI
- `SQL.txt` — sample SQL for populating the medicines table

## Requirements

- Java 21+
- MySQL 8+
- MySQL Connector/J 9.4.0 (included in `Medicine/src/mysql-connector-j-9.4.0/`)

## Database Setup

1. Create a MySQL database named `medicines_db`.
2. Import or run the SQL from `SQL.txt` to create and populate the `medicines` table.
3. Make sure the database user and password match the defaults in `DatabaseConnection.java`, or set environment variables:
   - `MED_DB_URL`
   - `MED_DB_USER`
   - `MED_DB_PASSWORD`

## How to Run

From the `Medicine` directory:

```bash
javac -cp "src/mysql-connector-j-9.4.0/mysql-connector-j-9.4.0.jar" -d build/classes src/*.java
java -cp "build/classes;src/mysql-connector-j-9.4.0/mysql-connector-j-9.4.0.jar" MedicineApp
```

## Notes

- The app expects a running MySQL server on `localhost:3306`.
- If the logo asset is unavailable, the UI falls back to a generated placeholder icon.

## Future Improvements

- Add search filters by dosage, brand, or price.
- Add medicine suggestions when exact matches are not found.
- Improve error handling and offline fallback behavior.

## GitHub

Repository: https://github.com/ap4778/Generic-Medicine-Finder

<img width="1105" height="855" alt="image" src="https://github.com/user-attachments/assets/d57758b8-c2ab-43f7-9e80-3e6c79a89400" />


