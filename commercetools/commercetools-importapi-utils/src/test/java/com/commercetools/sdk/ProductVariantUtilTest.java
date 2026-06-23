package com.commercetools.sdk;

import com.commercetools.api.models.product.ProductProjection;
import io.vrap.rmf.base.client.utils.json.JsonUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductVariantUtilTest {
    private final ProductVariantUtil util = new ProductVariantUtil();

    @Test
    void shouldIdentifyMasterVariant() {
        var product = JsonUtils.fromJsonString(TestUtils.stringFromResource("src/test/resources/product-projection.example.json"), ProductProjection.class);
        var result = util.toProductVariantImport(product, product.getMasterVariant());

        Assertions.assertTrue(result.getIsMasterVariant());
        Assertions.assertEquals("masterVariantKey", result.getKey());
    }

    @Test
    void shouldSetProductKeyReference() {
        var product = JsonUtils.fromJsonString(TestUtils.stringFromResource("src/test/resources/product-projection.example.json"), ProductProjection.class);
        var result = util.toProductVariantImport(product, product.getMasterVariant());

        Assertions.assertEquals("productKey", result.getProduct().getKey());
    }

    @Test
    void shouldIdentifyNonMasterVariant() {
        // use a fixture t at has at least one variant in "variants" array
        var product = JsonUtils.fromJsonString(TestUtils.stringFromResource("src/test/resources/product-projection.with-variants.json"), ProductProjection.class);
        var nonMaster = product.getVariants().get(0);
        var result = util.toProductVariantImport(product, nonMaster);

        Assertions.assertFalse(result.getIsMasterVariant());
    }

    @Test
    void shouldPassStagedFlag() {
        var product = JsonUtils.fromJsonString(TestUtils.stringFromResource("src/test/resources/product-projection.example.json"), ProductProjection.class);
        var result = util.toProductVariantImport(product, product.getMasterVariant());
        Assertions.assertFalse(result.getStaged());
    }
}
