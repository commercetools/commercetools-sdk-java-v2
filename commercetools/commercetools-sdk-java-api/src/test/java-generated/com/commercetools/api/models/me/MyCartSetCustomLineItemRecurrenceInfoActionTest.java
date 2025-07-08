
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetCustomLineItemRecurrenceInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetCustomLineItemRecurrenceInfoActionBuilder builder) {
        MyCartSetCustomLineItemRecurrenceInfoAction myCartSetCustomLineItemRecurrenceInfoAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartSetCustomLineItemRecurrenceInfoAction)
                .isInstanceOf(MyCartSetCustomLineItemRecurrenceInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        MyCartSetCustomLineItemRecurrenceInfoAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        MyCartSetCustomLineItemRecurrenceInfoAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "recurrenceInfo", MyCartSetCustomLineItemRecurrenceInfoAction.builder()
                        .recurrenceInfo(
                            new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        MyCartSetCustomLineItemRecurrenceInfoAction value = MyCartSetCustomLineItemRecurrenceInfoAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        MyCartSetCustomLineItemRecurrenceInfoAction value = MyCartSetCustomLineItemRecurrenceInfoAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void recurrenceInfo() {
        MyCartSetCustomLineItemRecurrenceInfoAction value = MyCartSetCustomLineItemRecurrenceInfoAction.of();
        value.setRecurrenceInfo(
            new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl());
        Assertions.assertThat(value.getRecurrenceInfo())
                .isEqualTo(new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl());
    }
}
