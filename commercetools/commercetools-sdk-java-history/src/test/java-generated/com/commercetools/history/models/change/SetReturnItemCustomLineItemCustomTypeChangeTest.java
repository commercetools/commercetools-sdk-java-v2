
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnItemCustomLineItemCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnItemCustomLineItemCustomTypeChangeBuilder builder) {
        SetReturnItemCustomLineItemCustomTypeChange setReturnItemCustomLineItemCustomTypeChange = builder
                .buildUnchecked();
        Assertions.assertThat(setReturnItemCustomLineItemCustomTypeChange)
                .isInstanceOf(SetReturnItemCustomLineItemCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetReturnItemCustomLineItemCustomTypeChange.builder().change("change") },
                new Object[] { "customLineItem",
                        SetReturnItemCustomLineItemCustomTypeChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetReturnItemCustomLineItemCustomTypeChange.builder().customLineItemId("customLineItemId") },
                new Object[] { "previousValue",
                        SetReturnItemCustomLineItemCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetReturnItemCustomLineItemCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetReturnItemCustomLineItemCustomTypeChange value = SetReturnItemCustomLineItemCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void customLineItem() {
        SetReturnItemCustomLineItemCustomTypeChange value = SetReturnItemCustomLineItemCustomTypeChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetReturnItemCustomLineItemCustomTypeChange value = SetReturnItemCustomLineItemCustomTypeChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void previousValue() {
        SetReturnItemCustomLineItemCustomTypeChange value = SetReturnItemCustomLineItemCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetReturnItemCustomLineItemCustomTypeChange value = SetReturnItemCustomLineItemCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
