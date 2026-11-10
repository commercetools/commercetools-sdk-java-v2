
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeImportRequestBuilder builder) {
        DiscountCodeImportRequest discountCodeImportRequest = builder.buildUnchecked();
        Assertions.assertThat(discountCodeImportRequest).isInstanceOf(DiscountCodeImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                DiscountCodeImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.discount_codes.DiscountCodeImportImpl())) } };
    }

    @Test
    public void resources() {
        DiscountCodeImportRequest value = DiscountCodeImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.discount_codes.DiscountCodeImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.discount_codes.DiscountCodeImportImpl()));
    }
}
