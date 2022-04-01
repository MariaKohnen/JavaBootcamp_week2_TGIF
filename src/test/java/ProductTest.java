import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product1 = new Product(1, "Pencil");
    Product product2 = new Product(2, "Collageblock");
    Product product3 = new Product(3, "Diary");
    Product product4 = new Product(4, "Paperclips");

    @Test
    void setID_whenNewProduct_shouldSetID() {
        // GIVEN
        Product result = new Product();

        // WHEN
        result.setId(1);
        result.setName("Bleistift");

        // THEN
        Product excepted = new Product(1, "Bleistift");
        assertEquals(excepted, result);
    }

}