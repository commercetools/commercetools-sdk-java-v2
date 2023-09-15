
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
public class SetLineItemPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemPriceChangeBuilder builder) {
        SetLineItemPriceChange setLineItemPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemPriceChange).isInstanceOf(SetLineItemPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemPriceChange.builder().change("change") },
                new Object[] { SetLineItemPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { SetLineItemPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { SetLineItemPriceChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void change() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemPriceChange value = SetLineItemPriceChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
