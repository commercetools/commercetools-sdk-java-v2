
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
public class SetLineItemShippingDetailsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemShippingDetailsChangeBuilder builder) {
        SetLineItemShippingDetailsChange setLineItemShippingDetailsChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemShippingDetailsChange).isInstanceOf(SetLineItemShippingDetailsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemShippingDetailsChange.builder().change("change") },
                new Object[] { SetLineItemShippingDetailsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { SetLineItemShippingDetailsChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { SetLineItemShippingDetailsChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
