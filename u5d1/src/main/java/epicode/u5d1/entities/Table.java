package epicode.u5d1.entities;

import epicode.u5d1.enums.TableStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Table {
    private int tableNumber;
    private int tableSeats;
    private TableStatus tableStatus;

    public Table(int tableNumber, int tableSeats, TableStatus tableStatus) {
        this.tableNumber = tableNumber;
        this.tableSeats = tableSeats;
        this.tableStatus = tableStatus;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", tableSeats=" + tableSeats +
                ", tableStatus=" + tableStatus +
                '}';
    }
}
