
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantPublishedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantPublishedMessageBuilder builder) {
        VariantPublishedMessage variantPublishedMessage = builder.buildUnchecked();
        Assertions.assertThat(variantPublishedMessage).isInstanceOf(VariantPublishedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "product", VariantPublishedMessage.builder()
                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void product() {
        VariantPublishedMessage value = VariantPublishedMessage.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
