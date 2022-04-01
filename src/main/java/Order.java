import java.util.Map;

public class Order extends Product {

    protected int id;
    protected Product product;

    public Order() {
    }

    public Order(int id, Product product) {
        this.id = id;
        this.product = product;
    }

    public Order(int id, String name, int id1, Product product) {
        super(id, name);
        this.id = id1;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product=" + product +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        return product != null ? product.equals(order.product) : order.product == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
