
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
public class ChangeCustomLineItemQuantityChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeCustomLineItemQuantityChangeBuilder builder) {
        ChangeCustomLineItemQuantityChange changeCustomLineItemQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeCustomLineItemQuantityChange)
                .isInstanceOf(ChangeCustomLineItemQuantityChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeCustomLineItemQuantityChange.builder().change("change") },
                new Object[] { ChangeCustomLineItemQuantityChange.builder().previousValue(8) },
                new Object[] { ChangeCustomLineItemQuantityChange.builder().nextValue(7) },
                new Object[] { ChangeCustomLineItemQuantityChange.builder()
                        .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ChangeCustomLineItemQuantityChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }

    @Test
    public void customLineItem() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        ChangeCustomLineItemQuantityChange value = ChangeCustomLineItemQuantityChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
