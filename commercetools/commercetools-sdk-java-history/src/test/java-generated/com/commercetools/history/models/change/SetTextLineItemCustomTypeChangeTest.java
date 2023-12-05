
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
public class SetTextLineItemCustomTypeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetTextLineItemCustomTypeChangeBuilder builder) {
        SetTextLineItemCustomTypeChange setTextLineItemCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setTextLineItemCustomTypeChange).isInstanceOf(SetTextLineItemCustomTypeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetTextLineItemCustomTypeChange.builder().change("change") },
                new Object[] { SetTextLineItemCustomTypeChange.builder()
                        .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetTextLineItemCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetTextLineItemCustomTypeChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void textLineItem() {
        SetTextLineItemCustomTypeChange value = SetTextLineItemCustomTypeChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
