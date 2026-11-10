
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemStateTransitionMessageBuilder builder) {
        CustomLineItemStateTransitionMessage customLineItemStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(customLineItemStateTransitionMessage)
                .isInstanceOf(CustomLineItemStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CustomLineItemStateTransitionMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CustomLineItemStateTransitionMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "transitionDate",
                        CustomLineItemStateTransitionMessage.builder()
                                .transitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "quantity", CustomLineItemStateTransitionMessage.builder().quantity(8L) },
                new Object[] { "fromState",
                        CustomLineItemStateTransitionMessage.builder()
                                .fromState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "toState", CustomLineItemStateTransitionMessage.builder()
                        .toState(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void transitionDate() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void quantity() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setFromState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void toState() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setToState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
