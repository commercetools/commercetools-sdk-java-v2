
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringDescriptionSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringDescriptionSetMessagePayloadBuilder builder) {
        ProductTailoringDescriptionSetMessagePayload productTailoringDescriptionSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productTailoringDescriptionSetMessagePayload)
                .isInstanceOf(ProductTailoringDescriptionSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringDescriptionSetMessagePayload.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey",
                        ProductTailoringDescriptionSetMessagePayload.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringDescriptionSetMessagePayload.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "description",
                        ProductTailoringDescriptionSetMessagePayload.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldDescription", ProductTailoringDescriptionSetMessagePayload.builder()
                        .oldDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void description() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldDescription() {
        ProductTailoringDescriptionSetMessagePayload value = ProductTailoringDescriptionSetMessagePayload.of();
        value.setOldDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
