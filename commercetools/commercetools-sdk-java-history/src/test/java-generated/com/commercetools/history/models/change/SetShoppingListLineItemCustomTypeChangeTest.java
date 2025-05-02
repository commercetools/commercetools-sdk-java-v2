
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShoppingListLineItemCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShoppingListLineItemCustomTypeChangeBuilder builder) {
        SetShoppingListLineItemCustomTypeChange setShoppingListLineItemCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setShoppingListLineItemCustomTypeChange)
                .isInstanceOf(SetShoppingListLineItemCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetShoppingListLineItemCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetShoppingListLineItemCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue",
                        SetShoppingListLineItemCustomTypeChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "lineItem", SetShoppingListLineItemCustomTypeChange.builder()
                        .lineItem(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetShoppingListLineItemCustomTypeChange value = SetShoppingListLineItemCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShoppingListLineItemCustomTypeChange value = SetShoppingListLineItemCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetShoppingListLineItemCustomTypeChange value = SetShoppingListLineItemCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void lineItem() {
        SetShoppingListLineItemCustomTypeChange value = SetShoppingListLineItemCustomTypeChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }
}
