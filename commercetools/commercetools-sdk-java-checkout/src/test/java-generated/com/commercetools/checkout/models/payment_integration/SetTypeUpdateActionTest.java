
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTypeUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTypeUpdateActionBuilder builder) {
        SetTypeUpdateAction setTypeUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setTypeUpdateAction).isInstanceOf(SetTypeUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", SetTypeUpdateAction.builder().type("type") } };
    }

    @Test
    public void type() {
        SetTypeUpdateAction value = SetTypeUpdateAction.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }
}
