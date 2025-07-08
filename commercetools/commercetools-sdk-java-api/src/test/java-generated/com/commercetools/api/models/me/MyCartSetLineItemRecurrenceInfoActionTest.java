
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLineItemRecurrenceInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLineItemRecurrenceInfoActionBuilder builder) {
        MyCartSetLineItemRecurrenceInfoAction myCartSetLineItemRecurrenceInfoAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemRecurrenceInfoAction)
                .isInstanceOf(MyCartSetLineItemRecurrenceInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyCartSetLineItemRecurrenceInfoAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyCartSetLineItemRecurrenceInfoAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "recurrenceInfo", MyCartSetLineItemRecurrenceInfoAction.builder()
                        .recurrenceInfo(
                            new com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemRecurrenceInfoAction value = MyCartSetLineItemRecurrenceInfoAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemRecurrenceInfoAction value = MyCartSetLineItemRecurrenceInfoAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void recurrenceInfo() {
        MyCartSetLineItemRecurrenceInfoAction value = MyCartSetLineItemRecurrenceInfoAction.of();
        value.setRecurrenceInfo(new com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftImpl());
        Assertions.assertThat(value.getRecurrenceInfo())
                .isEqualTo(new com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraftImpl());
    }
}
