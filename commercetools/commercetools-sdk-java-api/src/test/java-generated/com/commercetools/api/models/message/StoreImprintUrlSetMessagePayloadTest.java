
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreImprintUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreImprintUrlSetMessagePayloadBuilder builder) {
        StoreImprintUrlSetMessagePayload storeImprintUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeImprintUrlSetMessagePayload).isInstanceOf(StoreImprintUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "imprintUrl", StoreImprintUrlSetMessagePayload.builder().imprintUrl("imprintUrl") } };
    }

    @Test
    public void imprintUrl() {
        StoreImprintUrlSetMessagePayload value = StoreImprintUrlSetMessagePayload.of();
        value.setImprintUrl("imprintUrl");
        Assertions.assertThat(value.getImprintUrl()).isEqualTo("imprintUrl");
    }
}
