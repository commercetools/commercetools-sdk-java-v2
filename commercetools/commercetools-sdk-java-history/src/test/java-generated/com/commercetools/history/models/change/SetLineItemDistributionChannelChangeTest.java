
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
public class SetLineItemDistributionChannelChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemDistributionChannelChangeBuilder builder) {
        SetLineItemDistributionChannelChange setLineItemDistributionChannelChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemDistributionChannelChange)
                .isInstanceOf(SetLineItemDistributionChannelChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemDistributionChannelChange.builder().change("change") },
                new Object[] { SetLineItemDistributionChannelChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { SetLineItemDistributionChannelChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { SetLineItemDistributionChannelChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemDistributionChannelChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
