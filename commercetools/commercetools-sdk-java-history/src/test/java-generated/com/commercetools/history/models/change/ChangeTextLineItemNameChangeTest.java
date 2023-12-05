
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
public class ChangeTextLineItemNameChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTextLineItemNameChangeBuilder builder) {
        ChangeTextLineItemNameChange changeTextLineItemNameChange = builder.buildUnchecked();
        Assertions.assertThat(changeTextLineItemNameChange).isInstanceOf(ChangeTextLineItemNameChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTextLineItemNameChange.builder().change("change") },
                new Object[] { ChangeTextLineItemNameChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ChangeTextLineItemNameChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ChangeTextLineItemNameChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTextLineItemNameChange value = ChangeTextLineItemNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTextLineItemNameChange value = ChangeTextLineItemNameChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeTextLineItemNameChange value = ChangeTextLineItemNameChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void textLineItem() {
        ChangeTextLineItemNameChange value = ChangeTextLineItemNameChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
