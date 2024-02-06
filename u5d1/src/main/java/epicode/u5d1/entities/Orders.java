package epicode.u5d1.entities;

import epicode.u5d1.enums.OrderStatus;
import epicode.u5d1.superclass.Element;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Orders {
    private Table table;
    private List<Element> orderList;
    private int numOrder;
    private OrderStatus orderStatus;
    private int costumers;
    private LocalDate orderTime;

    public Orders(Table table, List<Element> orderList, int numOrder, OrderStatus orderStatus, int costumers, LocalDate orderTime) {
        this.table = table;
        this.orderList = orderList;
        this.numOrder = numOrder;
        this.orderStatus = orderStatus;
        this.costumers = costumers;
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "table=" + table.getTableNumber() +
                ", orderList=" + orderList +
                ", numOrder=" + numOrder +
                ", orderStatus=" + orderStatus +
                ", costumers=" + costumers +
                ", orderTime=" + orderTime +
                '}';
    }
}
