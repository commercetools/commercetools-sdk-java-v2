
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetOrderLineItemCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetOrderLineItemCustomTypeChangeBuilder builder) {
        SetOrderLineItemCustomTypeChange setOrderLineItemCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderLineItemCustomTypeChange).isInstanceOf(SetOrderLineItemCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetOrderLineItemCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetOrderLineItemCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue",
                        SetOrderLineItemCustomTypeChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "lineItem",
                        SetOrderLineItemCustomTypeChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetOrderLineItemCustomTypeChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetOrderLineItemCustomTypeChange value = SetOrderLineItemCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderLineItemCustomTypeChange value = SetOrderLineItemCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetOrderLineItemCustomTypeChange value = SetOrderLineItemCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void lineItem() {
        SetOrderLineItemCustomTypeChange value = SetOrderLineItemCustomTypeChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetOrderLineItemCustomTypeChange value = SetOrderLineItemCustomTypeChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
