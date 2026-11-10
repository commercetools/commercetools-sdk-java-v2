
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCheckoutUrlTemplateSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCheckoutUrlTemplateSetMessageBuilder builder) {
        StoreCheckoutUrlTemplateSetMessage storeCheckoutUrlTemplateSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeCheckoutUrlTemplateSetMessage)
                .isInstanceOf(StoreCheckoutUrlTemplateSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "checkoutUrlTemplate",
                StoreCheckoutUrlTemplateSetMessage.builder().checkoutUrlTemplate("checkoutUrlTemplate") } };
    }

    @Test
    public void checkoutUrlTemplate() {
        StoreCheckoutUrlTemplateSetMessage value = StoreCheckoutUrlTemplateSetMessage.of();
        value.setCheckoutUrlTemplate("checkoutUrlTemplate");
        Assertions.assertThat(value.getCheckoutUrlTemplate()).isEqualTo("checkoutUrlTemplate");
    }
}
