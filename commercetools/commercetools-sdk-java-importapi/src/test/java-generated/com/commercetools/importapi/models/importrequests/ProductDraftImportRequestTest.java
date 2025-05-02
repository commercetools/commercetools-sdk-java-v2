
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDraftImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDraftImportRequestBuilder builder) {
        ProductDraftImportRequest productDraftImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productDraftImportRequest).isInstanceOf(ProductDraftImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                ProductDraftImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.productdrafts.ProductDraftImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductDraftImportRequest value = ProductDraftImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.productdrafts.ProductDraftImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.productdrafts.ProductDraftImportImpl()));
    }
}
