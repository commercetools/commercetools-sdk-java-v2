
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
public class SetCustomLineItemShippingDetailsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomLineItemShippingDetailsChangeBuilder builder) {
        SetCustomLineItemShippingDetailsChange setCustomLineItemShippingDetailsChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemShippingDetailsChange)
                .isInstanceOf(SetCustomLineItemShippingDetailsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomLineItemShippingDetailsChange.builder().change("change") },
                new Object[] { SetCustomLineItemShippingDetailsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { SetCustomLineItemShippingDetailsChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] {
                        SetCustomLineItemShippingDetailsChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemShippingDetailsChange value = SetCustomLineItemShippingDetailsChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
