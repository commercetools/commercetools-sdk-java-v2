
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTextLineItemCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTextLineItemCustomTypeChangeBuilder builder) {
        SetTextLineItemCustomTypeChange setTextLineItemCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setTextLineItemCustomTypeChange).isInstanceOf(SetTextLineItemCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTextLineItemCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetTextLineItemCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue",
                        SetTextLineItemCustomTypeChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "textLineItem", SetTextLineItemCustomTypeChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void textLineItem() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
