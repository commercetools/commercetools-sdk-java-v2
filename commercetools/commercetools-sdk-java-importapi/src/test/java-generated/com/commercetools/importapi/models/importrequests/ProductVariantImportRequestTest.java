
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantImportRequestBuilder builder) {
        ProductVariantImportRequest productVariantImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productVariantImportRequest).isInstanceOf(ProductVariantImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                ProductVariantImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.productvariants.ProductVariantImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductVariantImportRequest value = ProductVariantImportRequest.of();
        value.setResources(Collections
                .singletonList(new com.commercetools.importapi.models.productvariants.ProductVariantImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.productvariants.ProductVariantImportImpl()));
    }
}
