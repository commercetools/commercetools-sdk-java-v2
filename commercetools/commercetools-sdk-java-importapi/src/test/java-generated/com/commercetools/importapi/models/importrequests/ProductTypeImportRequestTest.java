
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeImportRequestBuilder builder) {
        ProductTypeImportRequest productTypeImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productTypeImportRequest).isInstanceOf(ProductTypeImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                ProductTypeImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.producttypes.ProductTypeImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductTypeImportRequest value = ProductTypeImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.producttypes.ProductTypeImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.producttypes.ProductTypeImportImpl()));
    }
}
