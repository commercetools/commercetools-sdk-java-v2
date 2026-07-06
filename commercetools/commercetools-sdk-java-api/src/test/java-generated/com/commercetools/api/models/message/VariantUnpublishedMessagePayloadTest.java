
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantUnpublishedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantUnpublishedMessagePayloadBuilder builder) {
        VariantUnpublishedMessagePayload variantUnpublishedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(variantUnpublishedMessagePayload).isInstanceOf(VariantUnpublishedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "product", VariantUnpublishedMessagePayload.builder()
                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void product() {
        VariantUnpublishedMessagePayload value = VariantUnpublishedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
