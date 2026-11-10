
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShoppingListLineItemCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShoppingListLineItemCustomFieldChangeBuilder builder) {
        SetShoppingListLineItemCustomFieldChange setShoppingListLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setShoppingListLineItemCustomFieldChange)
                .isInstanceOf(SetShoppingListLineItemCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetShoppingListLineItemCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetShoppingListLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetShoppingListLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { "name", SetShoppingListLineItemCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetShoppingListLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "lineItem", SetShoppingListLineItemCustomFieldChange.builder()
                        .lineItem(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetShoppingListLineItemCustomFieldChange value = SetShoppingListLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShoppingListLineItemCustomFieldChange value = SetShoppingListLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetShoppingListLineItemCustomFieldChange value = SetShoppingListLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetShoppingListLineItemCustomFieldChange value = SetShoppingListLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetShoppingListLineItemCustomFieldChange value = SetShoppingListLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void lineItem() {
        SetShoppingListLineItemCustomFieldChange value = SetShoppingListLineItemCustomFieldChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }
}
