package vn.edu.iuh.fit.utils;

import org.junit.jupiter.api.Test;
import vn.edu.iuh.fit.models.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JsonUtilsTest {

    @Test
    void convertListProducts2Json() {
        Product p1 = new Product(1L, "So mi", 20, 200000);
        Product p2 = new Product(1L, "Ao thun", 25, 150000);

        String actual = JsonUtils.convertListProducts2Json(List.of(p1, p2));
        String expected = "[{\"id\":1,\"name\":\"So mi\",\"quantity\":20,\"price\":200000.0},{\"id\":1,\"name\":\"Ao thun\",\"quantity\":25,\"price\":150000.0}]";

        assertEquals(expected, actual);
    }

    @Test
    void convertJson2ListProduct() {
        Product p1 = new Product(1L, "So mi", 20, 200000);
        Product p2 = new Product(1L, "Ao thun", 25, 150000);

        List<Product> actual = JsonUtils.convertJson2ListProduct("[{\"id\":1,\"name\":\"So mi\",\"quantity\":20,\"price\":200000.0},{\"id\":1,\"name\":\"Ao thun\",\"quantity\":25,\"price\":150000.0}]");
        List<Product> expected = List.of(p1, p2);
        assertEquals(expected, actual);
    }
}