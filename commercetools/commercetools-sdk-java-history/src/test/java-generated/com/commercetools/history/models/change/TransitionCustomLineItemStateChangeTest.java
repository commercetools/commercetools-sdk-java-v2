
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransitionCustomLineItemStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransitionCustomLineItemStateChangeBuilder builder) {
        TransitionCustomLineItemStateChange transitionCustomLineItemStateChange = builder.buildUnchecked();
        Assertions.assertThat(transitionCustomLineItemStateChange)
                .isInstanceOf(TransitionCustomLineItemStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", TransitionCustomLineItemStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        TransitionCustomLineItemStateChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { "nextValue",
                        TransitionCustomLineItemStateChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { "lineItemId", TransitionCustomLineItemStateChange.builder().lineItemId("lineItemId") },
                new Object[] { "stateId", TransitionCustomLineItemStateChange.builder().stateId("stateId") } };
    }

    @Test
    public void change() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void nextValue() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void lineItemId() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void stateId() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setStateId("stateId");
        Assertions.assertThat(value.getStateId()).isEqualTo("stateId");
    }
}
