
package com.commercetools.sdk;

import static com.commercetools.sdk.ProductUtil.toProductDraftImport;
import static com.commercetools.sdk.TestUtils.stringFromResource;
import static org.junit.jupiter.api.Assertions.*;

import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

public class ProductUtilTest {
    String productProjectionExample = "src/test/resources/product-projection.example.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void shouldDeserializeProductProjectionCorrectly() throws Exception {
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExample),
            ProductProjection.class);

        assertNotNull(testProduct, "The product object should not be null.");
        assertInstanceOf(ProductProjectionImpl.class, testProduct,
            "The product should be an instance of ProductProjectionImpl based on the annotation.");
    }

    @Test
    void productTransformTest() {
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExample),
            ProductProjection.class);
        var transformedProduct = toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        //assertEquals(testProduct.getName(), transformedProduct.getName());
    }

}
