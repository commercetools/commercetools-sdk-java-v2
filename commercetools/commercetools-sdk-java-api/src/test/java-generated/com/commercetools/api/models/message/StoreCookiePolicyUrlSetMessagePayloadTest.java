
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCookiePolicyUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCookiePolicyUrlSetMessagePayloadBuilder builder) {
        StoreCookiePolicyUrlSetMessagePayload storeCookiePolicyUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeCookiePolicyUrlSetMessagePayload)
                .isInstanceOf(StoreCookiePolicyUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cookiePolicyUrl",
                StoreCookiePolicyUrlSetMessagePayload.builder().cookiePolicyUrl("cookiePolicyUrl") } };
    }

    @Test
    public void cookiePolicyUrl() {
        StoreCookiePolicyUrlSetMessagePayload value = StoreCookiePolicyUrlSetMessagePayload.of();
        value.setCookiePolicyUrl("cookiePolicyUrl");
        Assertions.assertThat(value.getCookiePolicyUrl()).isEqualTo("cookiePolicyUrl");
    }
}
