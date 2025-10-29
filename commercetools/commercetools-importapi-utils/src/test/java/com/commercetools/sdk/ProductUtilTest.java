
package com.commercetools.sdk;

import static com.commercetools.sdk.TestUtils.stringFromResource;
import static org.junit.jupiter.api.Assertions.*;

import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionImpl;
import com.commercetools.importapi.models.productvariants.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Test;

public class ProductUtilTest {
    String productProjectionExample = "src/test/resources/product-projection.example.json";
    private final ObjectMapper objectMapper = new ObjectMapper();
    ProductUtil util = new ProductUtil();

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
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        //assertEquals(testProduct.getName(), transformedProduct.getName());
    }

    @Test
    void productTransformTestAttributesString() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-string.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("text", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesInt() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-int.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("number", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesBool() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-bool.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("boolean", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesDouble() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-double.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("number", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesLong() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-long.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("number", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesLstring() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-lstring.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("ltext", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesEnum() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-enum.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("enum", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesLenum() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-lenum.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("enum", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesMoney() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-money.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("money", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesLdate() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-ldate.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("date", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesDateTime() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-datetime.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("datetime", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesTime() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-time.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("time", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesReference() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-ref.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("reference", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesEmptySet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-empty.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("text-set", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesLDateSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-ldate.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("date-set", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesDateTimeSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-datetime.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("datetime-set", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesTimeSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-time.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals(1, transformedProduct.getAttributes().size());
        assertEquals("time-set", transformedProduct.getAttributes().get(0).getType());
    }

    @Test
    void productTransformTestAttributesStrSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-string.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals("text-set", transformedProduct.getAttributes().get(0).getType());
        assertEquals(2, ((TextSetAttribute) transformedProduct.getAttributes().get(0)).getValue().size());
    }

    @Test
    void productTransformTestAttributesIntSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-int.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals("number-set", transformedProduct.getAttributes().get(0).getType());
        assertEquals(2, ((NumberSetAttribute) transformedProduct.getAttributes().get(0)).getValue().size());
    }

    @Test
    void productTransformTestAttributesBoolSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-bool.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals("boolean-set", transformedProduct.getAttributes().get(0).getType());
        assertEquals(2, ((BooleanSetAttribute) transformedProduct.getAttributes().get(0)).getValue().size());
    }

    @Test
    void productTransformTestAttributesDoubleSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-double.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals("number-set", transformedProduct.getAttributes().get(0).getType());
        assertEquals(2, ((NumberSetAttribute) transformedProduct.getAttributes().get(0)).getValue().size());
    }

    @Test
    void productTransformTestAttributesLStringSet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-lstring.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals("ltext-set", transformedProduct.getAttributes().get(0).getType());
        assertEquals(2, ((LocalizableTextSetAttribute) transformedProduct.getAttributes().get(0)).getValue().size());
    }

    @Test
    void productTransformTestAttributesMoneySet() {
        String productProjectionExampleAttr = "src/test/resources/product-projection.example-attr-set-money.json";
        var testProduct = JsonUtils.fromJsonString(stringFromResource(productProjectionExampleAttr),
            ProductProjection.class);
        var transformedProduct = util.toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
        assertEquals("money-set", transformedProduct.getAttributes().get(0).getType());
        assertEquals(2, ((MoneySetAttribute) transformedProduct.getAttributes().get(0)).getValue().size());
    }
}
