
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomLineItemRecurrenceInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomLineItemRecurrenceInfoActionBuilder builder) {
        CartSetCustomLineItemRecurrenceInfoAction cartSetCustomLineItemRecurrenceInfoAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemRecurrenceInfoAction)
                .isInstanceOf(CartSetCustomLineItemRecurrenceInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartSetCustomLineItemRecurrenceInfoAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartSetCustomLineItemRecurrenceInfoAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "recurrenceInfo", CartSetCustomLineItemRecurrenceInfoAction.builder()
                        .recurrenceInfo(
                            new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemRecurrenceInfoAction value = CartSetCustomLineItemRecurrenceInfoAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemRecurrenceInfoAction value = CartSetCustomLineItemRecurrenceInfoAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void recurrenceInfo() {
        CartSetCustomLineItemRecurrenceInfoAction value = CartSetCustomLineItemRecurrenceInfoAction.of();
        value.setRecurrenceInfo(
            new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl());
        Assertions.assertThat(value.getRecurrenceInfo())
                .isEqualTo(new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl());
    }
}
