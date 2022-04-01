import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    Product product1 = new Product(1, "Pencil");
    Product product2 = new Product(2, "Collageblock");
    Product product3 = new Product(3, "Diary");
    Product product4 = new Product(4, "Paperclips");

    @Test
    void addProduct_whenAddAProduct_ProductRepoShouldContainsProduct() {
        // GIVEN
        Product product1 = new Product(1, "Pencil");
        Product product2 = new Product(2, "Collageblock");
        Map<Integer, Product> products = new HashMap<>();
        ProductRepo productRepo = new ProductRepo(products);

        // WHEN
        productRepo.addProduct(1, product1);
        Map<Integer, Product> actual = productRepo.getList();

        // THEN
        Map<Integer, Product> expected = new HashMap<>(Map.of(1, new Product(1, "Pencil")));

        assertEquals(expected, actual);
    }


    @Test
    void getList_shouldReturnListOfProducts() {

        // GIVEN
        Product product1 = new Product(1, "Pencil");
        Product product2 = new Product(2, "Collageblock");
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, product1);


        // WHEN
        ProductRepo productRepo = new ProductRepo(products);
        Map actual = productRepo.getList();

        // THEN
        Map<Integer, Product> expected = new HashMap<>(Map.of(1, new Product(1, "Pencil")));
        assertEquals(expected, actual);


    }

    @Test
    void getProductById_whenIdGiven_shouldFindProduct() {
        // GIVEN
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(1, product1);
        productRepo.addProduct(2, product2);

        // WHEN
        Product result = productRepo.getProductById(1);

        // THEN
        assertEquals(product1, result);
    }

    @Test
    void getProductById_whenIdIsNotGiven_shouldThrowException() {
        // GIVEN
        ProductRepo expected = new ProductRepo();
        expected.addProduct(1, product1);
        expected.addProduct(2, product2);


        // WHEN // THEN
        assertThrows(NoSuchElementException.class, () -> expected.getProductById(3));
    }

    @Test
    void removeProduct_whenRemoveWorks_shouldReturnTrue() {
        // GIVEN
        ProductRepo result = new ProductRepo();
        result.addProduct(1, product1);
        result.addProduct(2, product2);

        // WHEN // THEN
        Boolean expected = result.removeProduct(1, product1);
    }
/*
    @Test
    void getProductByName_whenNameIsGiven_shouldReturnProduct() {
        //GIVEN
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(1, product1);
        productRepo.addProduct(2, product2);

        // WHEN
        Product result = productRepo.getProductByName("Collageblock");
        // THEN
        assertEquals(product2, result);
    }

 */


}