import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    Map<Integer, Order> orders = new HashMap<>();

    public OrderRepo() {
    }

    public OrderRepo(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public void addOrder(int id, Order order) {
        orders.put(id, order);

    }

    public Map<Integer, Order> getAllOrder() {
        return orders;
    }

    public Order getOrderbyID(int id) {
        return orders.get(id);
    }

}
