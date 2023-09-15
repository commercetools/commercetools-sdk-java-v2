
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class ChangeShoppingListLineItemsOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeShoppingListLineItemsOrderChangeBuilder builder) {
        ChangeShoppingListLineItemsOrderChange changeShoppingListLineItemsOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeShoppingListLineItemsOrderChange)
                .isInstanceOf(ChangeShoppingListLineItemsOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeShoppingListLineItemsOrderChange.builder().change("change") },
                new Object[] { ChangeShoppingListLineItemsOrderChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl())) },
                new Object[] { ChangeShoppingListLineItemsOrderChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl())) } };
    }

    @Test
    public void change() {
        ChangeShoppingListLineItemsOrderChange value = ChangeShoppingListLineItemsOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeShoppingListLineItemsOrderChange value = ChangeShoppingListLineItemsOrderChange.of();
        value.setPreviousValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeShoppingListLineItemsOrderChange value = ChangeShoppingListLineItemsOrderChange.of();
        value.setNextValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()));
    }
}
