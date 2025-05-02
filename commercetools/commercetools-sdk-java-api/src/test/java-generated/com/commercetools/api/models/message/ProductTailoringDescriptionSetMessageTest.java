
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringDescriptionSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringDescriptionSetMessageBuilder builder) {
        ProductTailoringDescriptionSetMessage productTailoringDescriptionSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productTailoringDescriptionSetMessage)
                .isInstanceOf(ProductTailoringDescriptionSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "store",
                        ProductTailoringDescriptionSetMessage.builder()
                                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { "productKey", ProductTailoringDescriptionSetMessage.builder().productKey("productKey") },
                new Object[] { "product",
                        ProductTailoringDescriptionSetMessage.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "description",
                        ProductTailoringDescriptionSetMessage.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldDescription", ProductTailoringDescriptionSetMessage.builder()
                        .oldDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void store() {
        ProductTailoringDescriptionSetMessage value = ProductTailoringDescriptionSetMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void productKey() {
        ProductTailoringDescriptionSetMessage value = ProductTailoringDescriptionSetMessage.of();
        value.setProductKey("productKey");
        Assertions.assertThat(value.getProductKey()).isEqualTo("productKey");
    }

    @Test
    public void product() {
        ProductTailoringDescriptionSetMessage value = ProductTailoringDescriptionSetMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void description() {
        ProductTailoringDescriptionSetMessage value = ProductTailoringDescriptionSetMessage.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldDescription() {
        ProductTailoringDescriptionSetMessage value = ProductTailoringDescriptionSetMessage.of();
        value.setOldDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
