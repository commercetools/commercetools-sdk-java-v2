
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringPublishedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringPublishedMessagePayloadBuilder builder) {
        ProductTailoringPublishedMessagePayload productTailoringPublishedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringPublishedMessagePayload)
                .isInstanceOf(ProductTailoringPublishedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringPublishedMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey",
                        ProductTailoringPublishedMessagePayload.builder().productKey("productKey") },
                new Object[] { "product", ProductTailoringPublishedMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringPublishedMessagePayload value = ProductTailoringPublishedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringPublishedMessagePayload value = ProductTailoringPublishedMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringPublishedMessagePayload value = ProductTailoringPublishedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
