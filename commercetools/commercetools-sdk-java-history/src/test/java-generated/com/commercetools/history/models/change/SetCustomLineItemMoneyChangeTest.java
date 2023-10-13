
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
public class SetCustomLineItemMoneyChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomLineItemMoneyChangeBuilder builder) {
        SetCustomLineItemMoneyChange setCustomLineItemMoneyChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemMoneyChange).isInstanceOf(SetCustomLineItemMoneyChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomLineItemMoneyChange.builder().change("change") },
                new Object[] { SetCustomLineItemMoneyChange.builder()
                        .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { SetCustomLineItemMoneyChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { SetCustomLineItemMoneyChange.builder()
                        .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetCustomLineItemMoneyChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemMoneyChange value = SetCustomLineItemMoneyChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
