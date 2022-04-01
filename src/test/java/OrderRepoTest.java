import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    Product product1 = new Product(1, "Pencil");
    Product product2 = new Product(2, "Collageblock");

    @Test
    void addOrder_whenAddOrder_shouldContainsInMap() {
        // GIVEN
        Order order1 = new Order(1, product1);
        Order order2 = new Order(2, product2);
        Map<Integer, Order> orders = new HashMap<>();
        OrderRepo orderRepo = new OrderRepo(orders);

        // WHEN add to OrderRepo by Method
        orders.put(1, order2);
        Map<Integer, Order> actual = orderRepo.getAllOrder();

        // THEN should be equal to another Map with same Order
        Map<Integer, Order> expected = new HashMap<>(Map.of(1,new Order(2, product2)));
        assertEquals(expected, actual);
    }

    @Test
    void getAllOrder_shouldReturnAllIncomingOrders() {
        // GIVEN
        Order order1 = new Order(1, product1);
        Order order2 = new Order(2, product2);
        Map<Integer, Order> orders = new HashMap<>();
        orders.put(1, order2);

        // WHEN add to OrderRepo by Method
        OrderRepo orderRepo = new OrderRepo(orders);
        Map<Integer, Order> actual = orderRepo.getAllOrder();

        // THEN should be equal to another Map with same Order
        Map<Integer, Order> expected = new HashMap<>(Map.of(1,new Order(2, product2)));
        assertEquals(expected, actual);
    }

    @Test
    void getOrderById_whenPutID_shouldReturnOrderWithID() {
        // GIVEN
        Order order1 = new Order(1, product1);
        Order order2 = new Order(2, product2);
        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addOrder(1, order1);
        orderRepo.addOrder(2, order2);

        //WHEN // THEN
        Order actual = orderRepo.getOrderbyID(2);
        assertEquals(order2, actual);
    }
}