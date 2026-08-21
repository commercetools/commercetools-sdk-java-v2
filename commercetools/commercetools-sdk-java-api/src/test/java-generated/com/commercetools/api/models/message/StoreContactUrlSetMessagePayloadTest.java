
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreContactUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreContactUrlSetMessagePayloadBuilder builder) {
        StoreContactUrlSetMessagePayload storeContactUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeContactUrlSetMessagePayload).isInstanceOf(StoreContactUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "contactUrl", StoreContactUrlSetMessagePayload.builder().contactUrl("contactUrl") } };
    }

    @Test
    public void contactUrl() {
        StoreContactUrlSetMessagePayload value = StoreContactUrlSetMessagePayload.of();
        value.setContactUrl("contactUrl");
        Assertions.assertThat(value.getContactUrl()).isEqualTo("contactUrl");
    }
}
