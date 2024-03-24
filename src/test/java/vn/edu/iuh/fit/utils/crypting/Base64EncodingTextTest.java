package vn.edu.iuh.fit.utils.crypting;

import org.junit.jupiter.api.Test;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.utils.JsonUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Base64EncodingTextTest {

    @Test
    void encrypt() throws Exception {
        Product p = new Product(1, "Ao", 12, 123000.0);
        Base64EncodingText base64EncodingText = new Base64EncodingText();
        String base64Actual = base64EncodingText.encrypt(JsonUtils.convertListProducts2Json(List.of(p)));
        String expected = "W3siaWQiOjEsIm5hbWUiOiJBbyIsInF1YW50aXR5IjoxMiwicHJpY2UiOjEyMzAwMC4wfV0=";
        assertEquals(expected,base64Actual);
    }

    @Test
    void decrypt() throws Exception {
        Product p = new Product(1, "Ao", 12, 123000.0);
        Base64EncodingText base64EncodingText = new Base64EncodingText();
        String jsonActual = base64EncodingText.decrypt("W3siaWQiOjEsIm5hbWUiOiJBbyIsInF1YW50aXR5IjoxMiwicHJpY2UiOjEyMzAwMC4wfV0=");
        String expected =JsonUtils.convertListProducts2Json(List.of(p));
        assertEquals(expected,jsonActual);
    }
}