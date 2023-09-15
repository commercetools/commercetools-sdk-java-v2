
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
public class SetLineItemDeactivatedAtChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemDeactivatedAtChangeBuilder builder) {
        SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemDeactivatedAtChange).isInstanceOf(SetLineItemDeactivatedAtChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemDeactivatedAtChange.builder().change("change") },
                new Object[] { SetLineItemDeactivatedAtChange.builder().previousValue("previousValue") },
                new Object[] { SetLineItemDeactivatedAtChange.builder().nextValue("nextValue") },
                new Object[] { SetLineItemDeactivatedAtChange.builder()
                        .lineItem(
                            new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void lineItem() {
        SetLineItemDeactivatedAtChange value = SetLineItemDeactivatedAtChange.of();
        value.setLineItem(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.ShoppingListLineItemValueImpl());
    }
}
