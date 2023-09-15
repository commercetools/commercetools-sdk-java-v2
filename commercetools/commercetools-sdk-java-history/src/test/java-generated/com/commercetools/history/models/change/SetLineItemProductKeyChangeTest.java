
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
public class SetLineItemProductKeyChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemProductKeyChangeBuilder builder) {
        SetLineItemProductKeyChange setLineItemProductKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemProductKeyChange).isInstanceOf(SetLineItemProductKeyChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemProductKeyChange.builder().change("change") },
                new Object[] { SetLineItemProductKeyChange.builder().previousValue("previousValue") },
                new Object[] { SetLineItemProductKeyChange.builder().nextValue("nextValue") },
                new Object[] { SetLineItemProductKeyChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemProductKeyChange.builder().lineItemId("lineItemId") },
                new Object[] { SetLineItemProductKeyChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void lineItem() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void variant() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
