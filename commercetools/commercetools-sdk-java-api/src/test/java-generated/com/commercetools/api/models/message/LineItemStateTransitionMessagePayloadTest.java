
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemStateTransitionMessagePayloadBuilder builder) {
        LineItemStateTransitionMessagePayload lineItemStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(lineItemStateTransitionMessagePayload)
                .isInstanceOf(LineItemStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", LineItemStateTransitionMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        LineItemStateTransitionMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { "transitionDate",
                        LineItemStateTransitionMessagePayload.builder()
                                .transitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "quantity", LineItemStateTransitionMessagePayload.builder().quantity(8L) },
                new Object[] { "fromState",
                        LineItemStateTransitionMessagePayload.builder()
                                .fromState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "toState", LineItemStateTransitionMessagePayload.builder()
                        .toState(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void transitionDate() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void quantity() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setFromState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void toState() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setToState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
