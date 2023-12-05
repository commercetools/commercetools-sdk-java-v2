
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
public class RemoveShoppingListLineItemChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveShoppingListLineItemChangeBuilder builder) {
        RemoveShoppingListLineItemChange removeShoppingListLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(removeShoppingListLineItemChange).isInstanceOf(RemoveShoppingListLineItemChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveShoppingListLineItemChange.builder().change("change") },
                new Object[] { RemoveShoppingListLineItemChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LineItemImpl()) },
                new Object[] { RemoveShoppingListLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LineItemImpl()) } };
    }

    @Test
    public void change() {
        RemoveShoppingListLineItemChange value = RemoveShoppingListLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveShoppingListLineItemChange value = RemoveShoppingListLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }

    @Test
    public void nextValue() {
        RemoveShoppingListLineItemChange value = RemoveShoppingListLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }
}
