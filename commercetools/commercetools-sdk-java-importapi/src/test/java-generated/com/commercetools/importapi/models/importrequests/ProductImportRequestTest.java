
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductImportRequestBuilder builder) {
        ProductImportRequest productImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productImportRequest).isInstanceOf(ProductImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources", ProductImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.products.ProductImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductImportRequest value = ProductImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.products.ProductImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.products.ProductImportImpl()));
    }
}
