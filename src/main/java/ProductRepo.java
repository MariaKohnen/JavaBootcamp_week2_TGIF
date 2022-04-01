import java.util.*;

public class ProductRepo {

    Map<Integer, Product> products = new HashMap<>();

    public ProductRepo() {
    }

    public ProductRepo(Map<Integer, Product> products) {
        this.products = products;
    }

    public void addProduct(int id, Product product) {
        products.put(id, product);
    }

    public boolean removeProduct(Integer id, Product product) {
        return products.remove(id, product);
    }

    public Map<Integer, Product> getList() {
        return products;
    }

    public Product getProductById(int id) throws NoSuchElementException {
        if (products.containsKey(id)) {
            return products.get(id);
        }
        throw new NoSuchElementException();
    }
/*
    public Product getProductByName(String name) {
        for (Integer id : products) {
            if (products.containsValue(name)) ;
            return products.get(id);
        }
    }
 */
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductRepo that = (ProductRepo) o;

        return products != null ? products.equals(that.products) : that.products == null;
    }

    @Override
    public int hashCode() {
        return products != null ? products.hashCode() : 0;
    }
}
