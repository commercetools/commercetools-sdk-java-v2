
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
public class SetLineItemDiscountedPriceChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemDiscountedPriceChangeBuilder builder) {
        SetLineItemDiscountedPriceChange setLineItemDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemDiscountedPriceChange).isInstanceOf(SetLineItemDiscountedPriceChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemDiscountedPriceChange.builder().change("change") },
                new Object[] { SetLineItemDiscountedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) },
                new Object[] { SetLineItemDiscountedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) },
                new Object[] { SetLineItemDiscountedPriceChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemDiscountedPriceChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
