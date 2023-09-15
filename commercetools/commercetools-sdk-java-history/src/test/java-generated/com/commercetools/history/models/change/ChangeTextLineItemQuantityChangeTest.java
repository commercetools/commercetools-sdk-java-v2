
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
public class ChangeTextLineItemQuantityChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTextLineItemQuantityChangeBuilder builder) {
        ChangeTextLineItemQuantityChange changeTextLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeTextLineItemQuantityChange).isInstanceOf(ChangeTextLineItemQuantityChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTextLineItemQuantityChange.builder().change("change") },
                new Object[] { ChangeTextLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { ChangeTextLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { ChangeTextLineItemQuantityChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void textLineItem() {
        ChangeTextLineItemQuantityChange value = ChangeTextLineItemQuantityChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
