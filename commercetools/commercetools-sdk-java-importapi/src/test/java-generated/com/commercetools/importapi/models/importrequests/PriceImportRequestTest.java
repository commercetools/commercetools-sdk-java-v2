
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceImportRequestBuilder builder) {
        PriceImportRequest priceImportRequest = builder.buildUnchecked();
        Assertions.assertThat(priceImportRequest).isInstanceOf(PriceImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources", PriceImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.prices.PriceImportImpl())) } };
    }

    @Test
    public void resources() {
        PriceImportRequest value = PriceImportRequest.of();
        value.setResources(Collections.singletonList(new com.commercetools.importapi.models.prices.PriceImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.prices.PriceImportImpl()));
    }
}
