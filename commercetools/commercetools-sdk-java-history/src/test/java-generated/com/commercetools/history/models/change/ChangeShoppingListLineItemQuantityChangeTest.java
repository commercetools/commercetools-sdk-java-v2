
package com.commercetools.history.models.change;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ChangeShoppingListLineItemQuantityChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeShoppingListLineItemQuantityChangeBuilder builder) {
        ChangeShoppingListLineItemQuantityChange changeShoppingListLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeShoppingListLineItemQuantityChange)
                .isInstanceOf(ChangeShoppingListLineItemQuantityChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeShoppingListLineItemQuantityChange.builder().change("change") },
                new Object[] { ChangeShoppingListLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { ChangeShoppingListLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { ChangeShoppingListLineItemQuantityChange.builder()
                        .lineItem(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void lineItem() {
        ChangeShoppingListLineItemQuantityChange value = ChangeShoppingListLineItemQuantityChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }
}
