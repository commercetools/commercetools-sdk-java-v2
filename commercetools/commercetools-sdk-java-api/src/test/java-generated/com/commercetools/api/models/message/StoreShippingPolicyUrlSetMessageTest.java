
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreShippingPolicyUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreShippingPolicyUrlSetMessageBuilder builder) {
        StoreShippingPolicyUrlSetMessage storeShippingPolicyUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeShippingPolicyUrlSetMessage).isInstanceOf(StoreShippingPolicyUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingPolicyUrl",
                StoreShippingPolicyUrlSetMessage.builder().shippingPolicyUrl("shippingPolicyUrl") } };
    }

    @Test
    public void shippingPolicyUrl() {
        StoreShippingPolicyUrlSetMessage value = StoreShippingPolicyUrlSetMessage.of();
        value.setShippingPolicyUrl("shippingPolicyUrl");
        Assertions.assertThat(value.getShippingPolicyUrl()).isEqualTo("shippingPolicyUrl");
    }
}
