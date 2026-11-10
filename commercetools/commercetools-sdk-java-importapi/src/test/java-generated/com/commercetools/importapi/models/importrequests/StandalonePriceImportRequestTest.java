
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceImportRequestBuilder builder) {
        StandalonePriceImportRequest standalonePriceImportRequest = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceImportRequest).isInstanceOf(StandalonePriceImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                StandalonePriceImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.standalone_prices.StandalonePriceImportImpl())) } };
    }

    @Test
    public void resources() {
        StandalonePriceImportRequest value = StandalonePriceImportRequest.of();
        value.setResources(Collections
                .singletonList(new com.commercetools.importapi.models.standalone_prices.StandalonePriceImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.standalone_prices.StandalonePriceImportImpl()));
    }
}
