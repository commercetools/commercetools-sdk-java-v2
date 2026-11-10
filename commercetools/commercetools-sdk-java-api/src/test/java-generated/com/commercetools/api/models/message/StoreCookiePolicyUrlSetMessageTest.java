
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCookiePolicyUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCookiePolicyUrlSetMessageBuilder builder) {
        StoreCookiePolicyUrlSetMessage storeCookiePolicyUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeCookiePolicyUrlSetMessage).isInstanceOf(StoreCookiePolicyUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cookiePolicyUrl",
                StoreCookiePolicyUrlSetMessage.builder().cookiePolicyUrl("cookiePolicyUrl") } };
    }

    @Test
    public void cookiePolicyUrl() {
        StoreCookiePolicyUrlSetMessage value = StoreCookiePolicyUrlSetMessage.of();
        value.setCookiePolicyUrl("cookiePolicyUrl");
        Assertions.assertThat(value.getCookiePolicyUrl()).isEqualTo("cookiePolicyUrl");
    }
}
