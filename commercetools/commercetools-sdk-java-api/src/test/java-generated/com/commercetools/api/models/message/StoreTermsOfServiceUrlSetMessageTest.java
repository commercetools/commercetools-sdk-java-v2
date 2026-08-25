
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreTermsOfServiceUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreTermsOfServiceUrlSetMessageBuilder builder) {
        StoreTermsOfServiceUrlSetMessage storeTermsOfServiceUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeTermsOfServiceUrlSetMessage).isInstanceOf(StoreTermsOfServiceUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "termsOfServiceUrl",
                StoreTermsOfServiceUrlSetMessage.builder().termsOfServiceUrl("termsOfServiceUrl") } };
    }

    @Test
    public void termsOfServiceUrl() {
        StoreTermsOfServiceUrlSetMessage value = StoreTermsOfServiceUrlSetMessage.of();
        value.setTermsOfServiceUrl("termsOfServiceUrl");
        Assertions.assertThat(value.getTermsOfServiceUrl()).isEqualTo("termsOfServiceUrl");
    }
}
