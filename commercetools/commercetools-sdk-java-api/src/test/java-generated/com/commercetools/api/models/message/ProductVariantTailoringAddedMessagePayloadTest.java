
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringAddedMessagePayloadBuilder builder) {
        ProductVariantTailoringAddedMessagePayload productVariantTailoringAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productVariantTailoringAddedMessagePayload)
                .isInstanceOf(ProductVariantTailoringAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductVariantTailoringAddedMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey",
                        ProductVariantTailoringAddedMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductVariantTailoringAddedMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductVariantTailoringAddedMessagePayload.builder().variantId(5L) },
                new Object[] { "variant", ProductVariantTailoringAddedMessagePayload.builder()
                        .variant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl()) } };
    }

    @Test
    public void store() {
        ProductVariantTailoringAddedMessagePayload value = ProductVariantTailoringAddedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductVariantTailoringAddedMessagePayload value = ProductVariantTailoringAddedMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductVariantTailoringAddedMessagePayload value = ProductVariantTailoringAddedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductVariantTailoringAddedMessagePayload value = ProductVariantTailoringAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void variant() {
        ProductVariantTailoringAddedMessagePayload value = ProductVariantTailoringAddedMessagePayload.of();
        value.setVariant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
    }
}
