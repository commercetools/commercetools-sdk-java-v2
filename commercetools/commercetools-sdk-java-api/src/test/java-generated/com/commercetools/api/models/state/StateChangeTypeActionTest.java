
package com.commercetools.api.models.state;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StateChangeTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StateChangeTypeActionBuilder builder) {
        StateChangeTypeAction stateChangeTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stateChangeTypeAction).isInstanceOf(StateChangeTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", StateChangeTypeAction.builder()
                .type(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState")) } };
    }

    @Test
    public void type() {
        StateChangeTypeAction value = StateChangeTypeAction.of();
        value.setType(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
    }
}
