
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetNameUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetNameUpdateActionBuilder builder) {
        SetNameUpdateAction setNameUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setNameUpdateAction).isInstanceOf(SetNameUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", SetNameUpdateAction.builder().name("name") } };
    }

    @Test
    public void name() {
        SetNameUpdateAction value = SetNameUpdateAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
