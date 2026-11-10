
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionImportRequestBuilder builder) {
        ProductSelectionImportRequest productSelectionImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productSelectionImportRequest).isInstanceOf(ProductSelectionImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources", ProductSelectionImportRequest.builder()
                .resources(Collections.singletonList(
                    new com.commercetools.importapi.models.product_selections.ProductSelectionImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductSelectionImportRequest value = ProductSelectionImportRequest.of();
        value.setResources(Collections
                .singletonList(new com.commercetools.importapi.models.product_selections.ProductSelectionImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.product_selections.ProductSelectionImportImpl()));
    }
}
