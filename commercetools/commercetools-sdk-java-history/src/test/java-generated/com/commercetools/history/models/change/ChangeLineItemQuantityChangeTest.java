
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
public class ChangeLineItemQuantityChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeLineItemQuantityChangeBuilder builder) {
        ChangeLineItemQuantityChange changeLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeLineItemQuantityChange).isInstanceOf(ChangeLineItemQuantityChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeLineItemQuantityChange.builder().change("change") },
                new Object[] { ChangeLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { ChangeLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { ChangeLineItemQuantityChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ChangeLineItemQuantityChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void lineItem() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        ChangeLineItemQuantityChange value = ChangeLineItemQuantityChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
