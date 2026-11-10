
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringRemovedMessagePayloadBuilder builder) {
        ProductVariantTailoringRemovedMessagePayload productVariantTailoringRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productVariantTailoringRemovedMessagePayload)
                .isInstanceOf(ProductVariantTailoringRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductVariantTailoringRemovedMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey",
                        ProductVariantTailoringRemovedMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductVariantTailoringRemovedMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", ProductVariantTailoringRemovedMessagePayload.builder().variantId(5L) },
                new Object[] { "variant", ProductVariantTailoringRemovedMessagePayload.builder()
                        .variant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl()) } };
    }

    @Test
    public void store() {
        ProductVariantTailoringRemovedMessagePayload value = ProductVariantTailoringRemovedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductVariantTailoringRemovedMessagePayload value = ProductVariantTailoringRemovedMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductVariantTailoringRemovedMessagePayload value = ProductVariantTailoringRemovedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        ProductVariantTailoringRemovedMessagePayload value = ProductVariantTailoringRemovedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void variant() {
        ProductVariantTailoringRemovedMessagePayload value = ProductVariantTailoringRemovedMessagePayload.of();
        value.setVariant(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductVariantTailoringImpl());
    }
}
