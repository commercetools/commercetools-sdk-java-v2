
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UpdateActionBuilder builder) {
        UpdateAction updateAction = builder.buildUnchecked();
        Assertions.assertThat(updateAction).isInstanceOf(UpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "action", UpdateAction.builder().action("action") } };
    }

    @Test
    public void action() {
        UpdateAction value = UpdateAction.of();
        value.setAction("action");
        Assertions.assertThat(value.getAction()).isEqualTo("action");
    }
}
