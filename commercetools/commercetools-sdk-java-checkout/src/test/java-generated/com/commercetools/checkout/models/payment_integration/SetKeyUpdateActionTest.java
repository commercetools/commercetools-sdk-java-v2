
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetKeyUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetKeyUpdateActionBuilder builder) {
        SetKeyUpdateAction setKeyUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setKeyUpdateAction).isInstanceOf(SetKeyUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", SetKeyUpdateAction.builder().key("key") } };
    }

    @Test
    public void key() {
        SetKeyUpdateAction value = SetKeyUpdateAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
