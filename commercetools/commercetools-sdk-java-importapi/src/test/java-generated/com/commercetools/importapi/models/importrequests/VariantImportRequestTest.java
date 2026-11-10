
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantImportRequestBuilder builder) {
        VariantImportRequest variantImportRequest = builder.buildUnchecked();
        Assertions.assertThat(variantImportRequest).isInstanceOf(VariantImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources", VariantImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.variants.VariantImportImpl())) } };
    }

    @Test
    public void resources() {
        VariantImportRequest value = VariantImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.variants.VariantImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.variants.VariantImportImpl()));
    }
}
