
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransitionLineItemStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransitionLineItemStateChangeBuilder builder) {
        TransitionLineItemStateChange transitionLineItemStateChange = builder.buildUnchecked();
        Assertions.assertThat(transitionLineItemStateChange).isInstanceOf(TransitionLineItemStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", TransitionLineItemStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        TransitionLineItemStateChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { "nextValue",
                        TransitionLineItemStateChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { "lineItemId", TransitionLineItemStateChange.builder().lineItemId("lineItemId") },
                new Object[] { "stateId", TransitionLineItemStateChange.builder().stateId("stateId") } };
    }

    @Test
    public void change() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void nextValue() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void lineItemId() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void stateId() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setStateId("stateId");
        Assertions.assertThat(value.getStateId()).isEqualTo("stateId");
    }
}
