package execute_arround;

import java.util.function.Consumer;

public class Database {
    private Database() {
        System.out.println("Database connected successfully");
    }

    public static void use(Consumer<Database> block) {
        Database database = new Database();
        try {
            block.accept(database);
        } finally {
            database.close();
        }
    }

    public Database op1() {
        System.out.println("Create table");
        return this;
    }

    public Database op2() {
        System.out.println("Insert values to table");
        return this;
    }

    public void close() {
        System.out.println("Database closed");
    }
}
