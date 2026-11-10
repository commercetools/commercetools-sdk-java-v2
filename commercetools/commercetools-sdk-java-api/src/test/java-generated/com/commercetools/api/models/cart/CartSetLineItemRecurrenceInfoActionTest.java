
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemRecurrenceInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemRecurrenceInfoActionBuilder builder) {
        CartSetLineItemRecurrenceInfoAction cartSetLineItemRecurrenceInfoAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemRecurrenceInfoAction)
                .isInstanceOf(CartSetLineItemRecurrenceInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemRecurrenceInfoAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        CartSetLineItemRecurrenceInfoAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "recurrenceInfo", CartSetLineItemRecurrenceInfoAction.builder()
                        .recurrenceInfo(
                            new com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemRecurrenceInfoAction value = CartSetLineItemRecurrenceInfoAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemRecurrenceInfoAction value = CartSetLineItemRecurrenceInfoAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void recurrenceInfo() {
        CartSetLineItemRecurrenceInfoAction value = CartSetLineItemRecurrenceInfoAction.of();
        value.setRecurrenceInfo(new com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftImpl());
        Assertions.assertThat(value.getRecurrenceInfo())
                .isEqualTo(new com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftImpl());
    }
}
