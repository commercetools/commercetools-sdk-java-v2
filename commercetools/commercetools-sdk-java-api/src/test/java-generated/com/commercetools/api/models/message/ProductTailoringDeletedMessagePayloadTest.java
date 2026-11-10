
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringDeletedMessagePayloadBuilder builder) {
        ProductTailoringDeletedMessagePayload productTailoringDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productTailoringDeletedMessagePayload)
                .isInstanceOf(ProductTailoringDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringDeletedMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringDeletedMessagePayload.builder().productKey("productKey") },
                new Object[] { "product", ProductTailoringDeletedMessagePayload.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringDeletedMessagePayload value = ProductTailoringDeletedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringDeletedMessagePayload value = ProductTailoringDeletedMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringDeletedMessagePayload value = ProductTailoringDeletedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
