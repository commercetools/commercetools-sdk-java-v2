
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreTermsOfServiceUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreTermsOfServiceUrlSetMessagePayloadBuilder builder) {
        StoreTermsOfServiceUrlSetMessagePayload storeTermsOfServiceUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeTermsOfServiceUrlSetMessagePayload)
                .isInstanceOf(StoreTermsOfServiceUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "termsOfServiceUrl",
                StoreTermsOfServiceUrlSetMessagePayload.builder().termsOfServiceUrl("termsOfServiceUrl") } };
    }

    @Test
    public void termsOfServiceUrl() {
        StoreTermsOfServiceUrlSetMessagePayload value = StoreTermsOfServiceUrlSetMessagePayload.of();
        value.setTermsOfServiceUrl("termsOfServiceUrl");
        Assertions.assertThat(value.getTermsOfServiceUrl()).isEqualTo("termsOfServiceUrl");
    }
}
