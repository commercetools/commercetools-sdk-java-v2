
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnItemLineItemCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnItemLineItemCustomTypeChangeBuilder builder) {
        SetReturnItemLineItemCustomTypeChange setReturnItemLineItemCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnItemLineItemCustomTypeChange)
                .isInstanceOf(SetReturnItemLineItemCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetReturnItemLineItemCustomTypeChange.builder().change("change") },
                new Object[] { "variant", SetReturnItemLineItemCustomTypeChange.builder().variant("variant") },
                new Object[] { "lineItem",
                        SetReturnItemLineItemCustomTypeChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", SetReturnItemLineItemCustomTypeChange.builder().lineItemId("lineItemId") },
                new Object[] { "previousValue",
                        SetReturnItemLineItemCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetReturnItemLineItemCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetReturnItemLineItemCustomTypeChange value = SetReturnItemLineItemCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void variant() {
        SetReturnItemLineItemCustomTypeChange value = SetReturnItemLineItemCustomTypeChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void lineItem() {
        SetReturnItemLineItemCustomTypeChange value = SetReturnItemLineItemCustomTypeChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetReturnItemLineItemCustomTypeChange value = SetReturnItemLineItemCustomTypeChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void previousValue() {
        SetReturnItemLineItemCustomTypeChange value = SetReturnItemLineItemCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetReturnItemLineItemCustomTypeChange value = SetReturnItemLineItemCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
