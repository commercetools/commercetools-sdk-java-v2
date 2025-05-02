
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantPatchRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantPatchRequestBuilder builder) {
        ProductVariantPatchRequest productVariantPatchRequest = builder.buildUnchecked();
        Assertions.assertThat(productVariantPatchRequest).isInstanceOf(ProductVariantPatchRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "patches",
                ProductVariantPatchRequest.builder()
                        .patches(Collections.singletonList(
                            new com.commercetools.importapi.models.productvariants.ProductVariantPatchImpl())) } };
    }

    @Test
    public void patches() {
        ProductVariantPatchRequest value = ProductVariantPatchRequest.of();
        value.setPatches(Collections
                .singletonList(new com.commercetools.importapi.models.productvariants.ProductVariantPatchImpl()));
        Assertions.assertThat(value.getPatches())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.productvariants.ProductVariantPatchImpl()));
    }
}
