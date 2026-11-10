
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemStateTransitionMessagePayloadBuilder builder) {
        CustomLineItemStateTransitionMessagePayload customLineItemStateTransitionMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customLineItemStateTransitionMessagePayload)
                .isInstanceOf(CustomLineItemStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CustomLineItemStateTransitionMessagePayload.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CustomLineItemStateTransitionMessagePayload.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "transitionDate",
                        CustomLineItemStateTransitionMessagePayload.builder()
                                .transitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "quantity", CustomLineItemStateTransitionMessagePayload.builder().quantity(8L) },
                new Object[] { "fromState",
                        CustomLineItemStateTransitionMessagePayload.builder()
                                .fromState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "toState", CustomLineItemStateTransitionMessagePayload.builder()
                        .toState(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CustomLineItemStateTransitionMessagePayload value = CustomLineItemStateTransitionMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CustomLineItemStateTransitionMessagePayload value = CustomLineItemStateTransitionMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void transitionDate() {
        CustomLineItemStateTransitionMessagePayload value = CustomLineItemStateTransitionMessagePayload.of();
        value.setTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void quantity() {
        CustomLineItemStateTransitionMessagePayload value = CustomLineItemStateTransitionMessagePayload.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        CustomLineItemStateTransitionMessagePayload value = CustomLineItemStateTransitionMessagePayload.of();
        value.setFromState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void toState() {
        CustomLineItemStateTransitionMessagePayload value = CustomLineItemStateTransitionMessagePayload.of();
        value.setToState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
