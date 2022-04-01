import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    Product product1 = new Product(1, "Pencil");
    Product product2 = new Product(2, "Collageblock");
    Product product3 = new Product(3, "Diary");
    Product product4 = new Product(4, "Paperclips");

    ProductRepo expected = new ProductRepo();


    @Test
    void addProduct_whenAddAProduct_ProductRepoShouldContainsProduct() {
        // GIVEN
        LinkedList<Product> studentList2 = new LinkedList<>();
        studentList2.add(product1);
        studentList2.add(product2);
        studentList2.add(product3);
        ProductRepo expected = new ProductRepo(studentList2);

        LinkedList<Product> studentList1 = new LinkedList<>();
        studentList1.add(product1);
        studentList1.add(product2);
        ProductRepo result = new ProductRepo(studentList1);

        // WHEN
        result.addProduct(product3);

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void getList_shouldReturnListOfProducts () {

        // GIVEN
        LinkedList<Product> studentList1 = new LinkedList<>();
        studentList1.add(product1);
        studentList1.add(product2);
        ProductRepo expected = new ProductRepo(studentList1);

        // WHEN
        ProductRepo result = new ProductRepo();
        result.addProduct(product1);
        result.addProduct(product2);

        // THEN
        assertEquals(expected, result);

    }

    @Test
    void toString_shouldReturnStringOfProductRepo() {
        // GIVEN
        ProductRepo result = new ProductRepo();
        result.addProduct(product1);
        result.addProduct(product2);

        // WHEN
        result.toString();

        // THEN
        String expected ="ProductRepo{products=[Product{id=1, name='Pencil'}, Product{id=2, name='Collageblock'}]}";
        assertEquals(expected, result.toString());
    }


}