
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringImportRequestBuilder builder) {
        ProductTailoringImportRequest productTailoringImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImportRequest).isInstanceOf(ProductTailoringImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                ProductTailoringImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.product_tailoring.ProductTailoringImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductTailoringImportRequest value = ProductTailoringImportRequest.of();
        value.setResources(Collections
                .singletonList(new com.commercetools.importapi.models.product_tailoring.ProductTailoringImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.product_tailoring.ProductTailoringImportImpl()));
    }
}
