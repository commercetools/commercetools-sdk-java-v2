
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
public class SetShoppingListLineItemCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetShoppingListLineItemCustomFieldChangeBuilder builder) {
        SetShoppingListLineItemCustomFieldChange setShoppingListLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setShoppingListLineItemCustomFieldChange)
                .isInstanceOf(SetShoppingListLineItemCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetShoppingListLineItemCustomFieldChange.builder().change("change") },
                new Object[] { SetShoppingListLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { SetShoppingListLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { SetShoppingListLineItemCustomFieldChange.builder().name("name") },
                new Object[] { SetShoppingListLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { SetShoppingListLineItemCustomFieldChange.builder()
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
