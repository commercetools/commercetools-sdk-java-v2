
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationNameUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationNameUpdateActionBuilder builder) {
        SetApplicationNameUpdateAction setApplicationNameUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationNameUpdateAction).isInstanceOf(SetApplicationNameUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", SetApplicationNameUpdateAction.builder().name("name") } };
    }

    @Test
    public void name() {
        SetApplicationNameUpdateAction value = SetApplicationNameUpdateAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
